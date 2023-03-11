package model;

import java.time.LocalDate;

public class Customer {
    Long id;
    String name;
    String surname;
    LocalDate birthdate;
    String fin;
    String serialNumber;
    Long carId;

    public Customer(Long id, String name, String surname, LocalDate birthdate, String fin, String serialNumber, Long carId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.fin = fin;
        this.serialNumber = serialNumber;
        this.carId = carId;
    }

    public Customer() {
    }

    public Customer(String name, String surname, LocalDate birthdate, String fin, String serialNumber) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.fin = fin;
        this.serialNumber = serialNumber;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", fin='" + fin + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", carId=" + carId +
                '}';
    }
}
