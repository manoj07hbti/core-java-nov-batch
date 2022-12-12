package collection_framework.model;

public class Vehicle {
    String model;
    int price;
    int wheels;
    // parameterized constructor

    public Vehicle(String model, int price, int wheels) {
        this.model = model;
        this.price = price;
        this.wheels = wheels;
    }
    //getter setter

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
