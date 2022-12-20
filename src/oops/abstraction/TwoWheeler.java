package oops.abstraction;

public class TwoWheeler extends Vehicle{


    @Override
    public void pricing() {
        System.out.println("Two wheeler price is 78000.99 rupees");
    }

    @Override
    public void servicing() {
        System.out.println("Servicing of the two wheeler is cost by 2500.00 rupees");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Two wheeler management system");
        TwoWheeler obj = new TwoWheeler();

        obj.Vehicle_information();
        obj.pricing();
        obj.servicing();
    }
}
