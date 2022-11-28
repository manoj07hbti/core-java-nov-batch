package class_and_object;

public class Car {
    String brand = "Tata Harrier";
    int cc = 1600;
    double insurance = 6649.49;
    String pay = "Via Credit Card.";

    public static void main(String[] args) {
        Car pro = new Car();
        System.out.println("Bike "+pro.brand+" CC - "+pro.cc+"CC Insurance cost - "+pro.insurance+"/- Paid "+pro.pay);
    }
}
