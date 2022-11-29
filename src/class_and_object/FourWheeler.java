package class_and_object;

public class FourWheeler {
    String brand;
    int cc;
    double insurance;
    String pay;

    // parameterized constructor
    public FourWheeler(String brand, int cc, double insurance, String pay) {
        this.brand = brand;
        this.cc = cc;
        this.insurance = insurance;
        this.pay = pay;
    }

    public static void main(String[] args) {

        FourWheeler pro = new FourWheeler("Tata Harrier",1600,6965.75,"Via Card");
        System.out.println("Bike "+pro.brand+" CC - "+pro.cc+"CC Insurance cost - "+pro.insurance+"/- Paid "+pro.pay);

        FourWheeler pro2 = new FourWheeler("Scorpio",2000,6857.52,"Via UPI");
        System.out.println("Bike "+pro2.brand+" CC - "+pro2.cc+"CC Insurance cost - "+pro2.insurance+"/- Paid "+pro2.pay);

        FourWheeler pro3 = new FourWheeler("Toyota Fortuner",4000,8674.88,"Via Credit Card");
        System.out.println("Bike "+pro3.brand+" CC - "+pro3.cc+"CC Insurance cost - "+pro3.insurance+"/- Paid "+pro3.pay);

    }
}
