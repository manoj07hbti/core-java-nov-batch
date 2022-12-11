package collection.model;

public class Vehicle {

    String name ;
    String colour;
    int rating;
    double price;

    public Vehicle(String name, String colour, int rating, double price) {
        this.name = name;
        this.colour = colour;
        this.rating = rating;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }
}
