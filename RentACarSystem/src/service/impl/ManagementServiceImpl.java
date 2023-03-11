package service.impl;

import exception.InvalidOptionException;
import exception.NotFoundCarException;
import exception.NotFoundCustomerException;
import service.ManagementService;

import java.util.InputMismatchException;

import static util.MenuUtil.entry;

public class ManagementServiceImpl implements ManagementService {
    @Override
    public void management() {
        while (true) {
            try {
                CarServiceImpl carService = new CarServiceImpl();
                while (true) {
                    Integer option = entry();
                    switch (option) {
                        case 0:
                            System.exit(-1);
                        case 1:
                            carService.orderCar();
                            break;
                        case 2:
                            carService.findCustomers();
                            break;
                        case 3:
                            carService.addCar();
                            break;
                        default:
                            throw new InvalidOptionException();
                    }
                }
            } catch (InputMismatchException | InvalidOptionException | NotFoundCarException | NotFoundCustomerException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
