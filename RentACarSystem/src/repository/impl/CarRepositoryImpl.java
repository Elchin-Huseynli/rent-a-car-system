package repository.impl;

import exception.NotFoundCarException;
import model.Car;
import repository.CarRepository;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import static queries.CarQuery.*;
import static repository.DbConnection.connect;

public class CarRepositoryImpl implements CarRepository {
    @Override
    public boolean addCar(Car car) {
        try (Connection connection = connect()) {
            PreparedStatement preparedStatement = connection.prepareStatement(ADD_CAR);
            preparedStatement.setString(1,car.getBrand());
            preparedStatement.setString(2,car.getModel());
            preparedStatement.setString(3,car.getEngine());
            preparedStatement.setString(4,car.getProduction());
            preparedStatement.setString(5,car.getBodyType());
            preparedStatement.setInt(6,car.getSeats());
            preparedStatement.setInt(7,car.getDoors());
            preparedStatement.setInt(8,car.getSpeed());
            preparedStatement.setInt(9,car.getAmount());
            preparedStatement.setInt(10,car.getStatus());

            int count = preparedStatement.executeUpdate();
            return count>0;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public List<Car> cars() {
        try (Connection connection = connect()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_CARS);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Car> cars = new LinkedList<>();
            if (resultSet.wasNull()) throw new NotFoundCarException();
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String brand = resultSet.getString("brand");
                String model = resultSet.getString("model");
                String engine = resultSet.getString("engine");
                String production = resultSet.getString("production");
                String bodyType = resultSet.getString("body_type");
                Integer seats = resultSet.getInt("seats");
                Integer doors = resultSet.getInt("doors");
                Integer speed = resultSet.getInt("speed");
                Integer amount = resultSet.getInt("amount");
                cars.add(new Car(id, brand, model, engine, production, bodyType, seats, doors, speed, amount));
            }
            return cars;

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

}