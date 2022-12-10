package conditional_framework.model;

public class Vehicle_M {

    //data member

    String name;
    double price;
    String type;

    //parameterized constructor


    public Vehicle_M(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    //getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
