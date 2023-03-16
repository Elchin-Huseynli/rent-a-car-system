package service.impl;

import exception.InvalidIdException;
import model.Car;
import model.Customer;
import repository.CustomerRepository;
import repository.impl.CarRepositoryImpl;
import repository.impl.CustomerRepositoryImpl;
import service.CustomerService;
import static util.InputUtil.*;

import java.util.List;

import static helper.CustomerServiceHelper.fillCustomer;

public class CustomerServiceImpl implements CustomerService {
    public final CustomerRepository customerRepository;

    public CustomerServiceImpl() {
        customerRepository = new CustomerRepositoryImpl();
    }

    @Override
    public void addCustomer() {
        boolean isFind = false;
        CarServiceImpl carService = new CarServiceImpl();
        CarRepositoryImpl carRepository = new CarRepositoryImpl();
        carService.findCars();
        List<Car> cars = carRepository.cars();
        Long optionId = inputTypeLong("Enter the id: ");
        for (Car car1 : cars) {
            if (car1.getId().equals(optionId)) {
                customerRepository.addCustomer(fillCustomer(optionId));
                isFind = true;
            }
        }
        if (isFind == false) {
            throw new InvalidIdException();
        }

    }

    @Override
    public void findCustomers() {
        List<Customer> customers = customerRepository.customers();
        customers.stream()
                .forEach(System.out::println);
    }
}
