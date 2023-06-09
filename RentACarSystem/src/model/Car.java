package model;

public class Car {
    private Long id;
    private String brand;
    private String model;
    private String engine;
    private  String production;
    private String bodyType;
    private Integer seats;
    private Integer doors;
    private Integer speed;
    private Integer amount;
    private Integer status;

    public Car(Long id, String brand, String model, String engine, String production, String bodyType, Integer seats, Integer doors, Integer speed, Integer amount, Integer status) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.production = production;
        this.bodyType = bodyType;
        this.seats = seats;
        this.doors = doors;
        this.speed = speed;
        this.amount = amount;
        this.status = status;
    }

    public Car() {
    }

    public Car(Long id, String brand, String model, String engine, String production, String bodyType, Integer seats, Integer doors, Integer speed, Integer amount) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.production = production;
        this.bodyType = bodyType;
        this.seats = seats;
        this.doors = doors;
        this.speed = speed;
        this.amount = amount;
    }

    public Car(String brand, String model, String engine, String production, String bodyType, Integer seats, Integer doors, Integer speed, Integer amount, Integer status) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.production = production;
        this.bodyType = bodyType;
        this.seats = seats;
        this.doors = doors;
        this.speed = speed;
        this.amount = amount;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "\nId: " + getId() +
                "\nBrand: " + getBrand() +
                "\nModel: " + getModel() +
                "\nEngine: " + getEngine() +
                "\nProduction: " + getProduction() +
                "\nBody type: " + getBodyType() +
                "\nSeats: " + getSeats() +
                "\nDoors: " + getDoors() +
                "\nSpeed: " + getSpeed() +
                "\nAmount: " + getAmount() + "\n";
    }
}
