package repository;
import model.Car;
import model.Customer;

import java.sql.SQLException;
import java.util.List;
public interface CarRepository {
    boolean addCar(Car car);
    List<Car> cars();
}
