package Oops.Abstraction;

public class FourWheeler extends Vehicle {

    // four wheeler is a child/subclass
    // Vehicle is parent/super class
    public void price() {
        System.out.println("put the price value");
    }

    @Override
    public void colour() {
        System.out.println("colour of Vehicle is White");
    }


    public void service() {
        System.out.println("Company is providing service for four wheeler ");
    }

    public static void main(String[] args) {

        System.out.println("Welcome to four wheeler Management System  ");

        FourWheeler obj = new FourWheeler();
        obj.vehicleInfo();
        obj.price();
        obj.service();
        obj.colour();

    }
}