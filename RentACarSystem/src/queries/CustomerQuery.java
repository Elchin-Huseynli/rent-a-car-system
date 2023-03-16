package queries;

public class CustomerQuery {
    public static final String ADD_CUSTOMER = "INSERT INTO customer(name, surname, birthdate, fin, serial_number, car_id) " +
            "VALUES (?, ?, ?, ?, ?, ?)";

    public static final String FIND_CUSTOMERS = "SELECT * FROM customer";
}
