package helper;

import model.Customer;

import java.time.LocalDate;

import static util.InputUtil.inputTypeString;

public class CustomerServiceHelper {
    public static Customer fillCustomer(Long carId) {
        String name = inputTypeString("Enter the name: ");
        String surname = inputTypeString("Enter the surname: ");
        LocalDate birthdate = LocalDate.parse(inputTypeString("Enter the birthdate: "));
        String fin = inputTypeString("Enter the fin: ");
        String serialNumber = inputTypeString("Enter the serial number: ");
        return new Customer(name, surname, birthdate, fin, serialNumber,carId);
    }
}
