package helper;

import model.Car;
import model.Customer;

import java.time.LocalDate;

import static util.InputUtil.inputTypeInteger;
import static util.InputUtil.inputTypeString;

public class CarServiceHelper {
    public static Car fillCar() {
        String brand = inputTypeString("Enter the brand: ");
        String model = inputTypeString("Enter the model: ");
        String engine = inputTypeString("Enter the engine: ");
        String production = inputTypeString("Enter the production: ");
        String bodyType = inputTypeString("Enter the body type: ");
        Integer seats = inputTypeInteger("Enter the seats: ");
        Integer doors = inputTypeInteger("Enter the doors: ");
        Integer speed = inputTypeInteger("Enter the speed: ");
        Integer amount = inputTypeInteger("Enter the amount: ");
        return new Car(brand, model, engine, production, bodyType, seats, doors, speed, amount, 1);
    }

    public static Customer fillCustomer() {
        String name = inputTypeString("Enter the name: ");
        String surname = inputTypeString("Enter the surname: ");
        LocalDate birthdate = LocalDate.parse(inputTypeString("Enter the birthdate: "));
        String fin = inputTypeString("Enter the fin: ");
        String serialNumber = inputTypeString("Enter the serial number: ");
        return new Customer(name, surname, birthdate, fin, serialNumber);
    }
}
