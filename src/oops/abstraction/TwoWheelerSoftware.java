package oops.abstraction;

public class TwoWheelerSoftware extends Vehicle{



    @Override
    public void vehicleprice() {
        System.out.println("THE PRICE OF VEHICLE = 550000 ");
    }

    @Override
    public void vehicleservice() {
        System.out.println("THE SERVICE CHARGE OF VEHICLE = 5000 ");

    }

    public static void main(String[] args) {
        TwoWheelerSoftware obj = new TwoWheelerSoftware();
        obj.vehicleinfo();
        obj.vehicleprice();
        obj.vehicleservice();
    }
}
