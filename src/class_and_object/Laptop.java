package class_and_object;

public class Laptop {
    String brand = "HP Elitebook";            //they are data member which written before main method
    int ram = 32;
    int ssd = 1;
    double price = 149999.00;

    public static void main(String[] args) {

        //SYNTAX: ClassName objName= new ClassName();

        Laptop feature = new Laptop();  // feature object is created

        // Accessing new object  - Syntax - objName.propertyname;

        System.out.println("Brand : " + feature.brand + " With Ram : " + feature.ram +"GB, "+
                feature.ssd+"TB SSD price @ :" + feature.price+"0/- Rs. Only");
    }
}
