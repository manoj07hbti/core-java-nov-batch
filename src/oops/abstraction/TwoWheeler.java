package oops.abstraction;

public class TwoWheeler extends Vehicle {
    @Override
    public void pricing() {

        System.out.println("This is pricing of two wheeler ");
    }

    @Override
    public void servicing() {
        System.out.println("This is servicing of two wheeler ");
    }


    public static void main(String[] args) {

        System.out.println("Welcome to Two Wheeler vehicle Management System");

        TwoWheeler obj = new TwoWheeler();
        obj.vehicleInfo();
        obj.pricing();
        obj.servicing();
    }
}
