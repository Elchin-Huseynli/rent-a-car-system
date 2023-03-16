package repository.impl;

import exception.NotFoundCustomerException;
import model.Customer;

import java.sql.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import repository.CustomerRepository;
import static queries.CustomerQuery.*;
import static repository.DbConnection.connect;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public boolean addCustomer(Customer customer) {
        try (Connection connection = connect()) {
            PreparedStatement preparedStatement = connection.prepareStatement(ADD_CUSTOMER);
            preparedStatement.setString(1,customer.getName());
            preparedStatement.setString(2,customer.getSurname());
            preparedStatement.setDate(3, Date.valueOf(customer.getBirthdate()));
            preparedStatement.setString(4,customer.getFin());
            preparedStatement.setString(5,customer.getSerialNumber());
            preparedStatement.setLong(6,customer.getCarId());
            int count = preparedStatement.executeUpdate();
            return count>0;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public List<Customer> customers() {
        try (Connection connection = connect()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_CUSTOMERS);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Customer> customers = new LinkedList<>();
            if (resultSet.wasNull()) throw new NotFoundCustomerException();
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                LocalDate birthdate = resultSet.getDate("birthdate").toLocalDate();
                String fin = resultSet.getString("fin");
                String serialNumber = resultSet.getString("serial_number");
                Long carId = resultSet.getLong("car_id");
                customers.add(new Customer(id, name, surname, birthdate, fin, serialNumber,carId));
            }
            return customers;

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
