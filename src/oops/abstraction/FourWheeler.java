package oops.abstraction;

public class FourWheeler extends Vehicle{
    @Override
    public void pricing() {
        System.out.println("Price of Four Wheeler is 850000.99 rupees");
    }

    @Override
    public void servicing() {
        System.out.println("Servicing of the Four Wheeler is 5000.00 rupees");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Four Wheeler Management system");

        FourWheeler obj = new FourWheeler();

        obj.Vehicle_information();
        obj.pricing();
        obj.servicing();
    }
}
