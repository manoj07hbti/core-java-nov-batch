package arrayList.model;

public class Vehicle {

    String name;
    int price;
    double mileage;

    // *****Parameterize constructor*****


    public Vehicle(String name, int price, double mileage) {
        this.name = name;
        this.price = price;
        this.mileage = mileage;
    }


    // *****getter and setter*****

    // for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // for price
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    // for mileage
    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}
