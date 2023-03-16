package queries;
public class CarQuery {
    public static final String ADD_CAR = "INSERT INTO car(brand, model, engine, production, body_type, seats, doors, speed, amount, status) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public static final String FIND_CARS = "SELECT * FROM car WHERE status = 1";
}
