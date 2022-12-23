package oops.abstraction;

public class FourWheelerSoftware extends Vehicle {

    public void info(){
        System.out.println("BMW CAR TOP MODEL --");
    }


    @Override
    public void vehicleprice() {
        System.out.println("THE PRICE OF VEHICLE IS 5500000");
    }

    @Override
    public void vehicleservice() {
        System.out.println("THE SERVICE CHARGE OF VEHICLE IS 10000");

    }

    public static void main(String[] args) {
        FourWheelerSoftware obj = new FourWheelerSoftware();
        obj.vehicleinfo();
        obj.info();
        obj.vehicleprice();
        obj.vehicleservice();
    }
}
