package oops.abstraction;

public class FourWheeler extends Vehicle {
    @Override
    public void pricing() {
        System.out.println("This Pricing for Four Wheeler Vehicle ");
    }

    @Override
    public void servicing() {
        System.out.println("This servicing for Four Wheeler Vehicle ");
    }

    public static void main(String[] args) {

        System.out.println("Welcome to four wheeler Management System");

        FourWheeler obj= new FourWheeler();
        obj.vehicleInfo();
        obj.pricing();
        obj.servicing();
    }
}
