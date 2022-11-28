package class_and_object;

public class Bike {
    String brand = "TVS Apache RTR 160 4v";      //they are data member which written before main method
    int cc = 160;
    double insurance = 3649.49;
    String pay = "Via UPI.";

    public static void main(String[] args) {
        //SYNTAX: ClassName objName= new ClassName();
        Bike pro = new Bike();

        // Accessing new object  - Syntax - objName.propertyname;
        System.out.println("Bike "+pro.brand+" CC - "+pro.cc+"CC Insurance cost - "+pro.insurance+"/- Paid "+pro.pay);
    }
}
