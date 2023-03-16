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

}
