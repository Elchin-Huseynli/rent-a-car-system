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
    public void findCars() {
        List<Car> cars = carRepository.cars();
        cars.stream()
                .forEach(System.out::println);
    }

}
