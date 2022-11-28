package class_and_object;

public class Mobile {
    String brand = "Oneplus";            //they are data member which written before main method
    int ram = 16;
    double price = 59999.00;

    public static void main(String[] args) {

        //SYNTAX: ClassName objName= new ClassName();

        Mobile feature = new Mobile();  // feature object is created

        // Accessing new object  - Syntax - objName.propertyname;

        System.out.println("Mobile Brand : "+feature.brand+" With Ram : "+feature.ram+"GB price @ :"+feature.price);


    }
}
