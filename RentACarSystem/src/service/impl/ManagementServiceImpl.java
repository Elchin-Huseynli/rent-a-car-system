package service.impl;

import exception.InvalidIdException;
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
                CustomerServiceImpl customerService = new CustomerServiceImpl();
                while (true) {
                    Integer option = entry();
                    switch (option) {
                        case 0:
                            System.exit(-1);
                        case 1:
                            customerService.addCustomer();
                            break;
                        case 2:
                            customerService.findCustomers();
                            break;
                        case 3:
                            carService.addCar();
                            break;
                        default:
                            throw new InvalidOptionException();
                    }
                }
            } catch (InputMismatchException | InvalidOptionException | NotFoundCarException | NotFoundCustomerException |
                     InvalidIdException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
