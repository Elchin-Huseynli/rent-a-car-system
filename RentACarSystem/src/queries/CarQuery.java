package queries;
public class CarQuery {
    public static final String ADD_CAR = "INSERT INTO car(brand, model, engine, production, body_type, seats, doors, speed, amount, status) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String ADD_CUSTOMER = "INSERT INTO customer(name, surname, birthdate, fin, serial_number, car_id) " +
            "VALUES (?, ?, ?, ?, ?, (SELECT id FROM car ORDER BY id LIMIT 1))";
    public static final String FIND_CARS = "SELECT * FROM car WHERE status = 1";
    public static final String FIND_CUSTOMERS = "SELECT * FROM customer";

}
