package service.impl;

import model.Car;
import model.Customer;
import repository.CarRepository;
import repository.impl.CarRepositoryImpl;
import service.CarService;
import util.InputUtil;

import java.util.List;

import static helper.CarServiceHelper.*;


public class CarServiceImpl implements CarService {
    public final CarRepository carRepository;

    public CarServiceImpl() {
        carRepository = new CarRepositoryImpl();
    }


    @Override
    public void addCar() {
        carRepository.addCar(fillCar());
    }

    @Override
    public void addCustomer() {
        carRepository.addCustomer(fillCustomer());
    }

    @Override
    public void findCars() {
        List<Car> cars = carRepository.cars();
        System.out.println(cars);
    }

    @Override
    public void findCustomers() {
        List<Customer> customers = carRepository.customers();
        System.out.println(customers);
    }

    @Override
    public void orderCar() {
        findCars();
        Integer option = InputUtil.inputTypeInteger("Enter the car id: ");
        addCustomer();
    }
}
