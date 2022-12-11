package collection_framework.model;

public class Vehicle {


    // Data members or properties or instance variables  of class

    String brand;
    int price;
    String engine_capacity; //engine capacity-----------CC
    String fuel_tank_capacity; // liter


    // Parameterized Constructor


    public Vehicle(String brand, int price, String engine_capacity, String fuel_tank_capacity) {
        this.brand = brand;
        this.price = price;
        this.engine_capacity = engine_capacity;
        this.fuel_tank_capacity = fuel_tank_capacity;
    }

    // Getter and Setter


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_capacity(String engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    public String getFuel_tank_capacity() {
        return fuel_tank_capacity;
    }

    public void setFuel_tank_capacity(String fuel_tank_capacity) {
        this.fuel_tank_capacity = fuel_tank_capacity;
    }
}
