package class_and_object;

import javafx.embed.swt.SWTFXUtils;

public class Mobile {

    String Brand = "Xiaomi";
    int Ram = 6;
    double price = 22000.50;

    public static void main(String[] args) {

        //SYNTAX: ClassName objName= new ClassName();

        Mobile obj = new Mobile();

        System.out.println("The brand name is : " + obj.Brand);
        System.out.println("The ram is : " +obj.Ram);
        System.out.println("The price is : " + obj.price);
        System.out.println("Brand : " + obj.Brand + " Ram : " + obj.Ram + " Price : " + obj.price);

        //SYNTAX: ClassName objName= new ClassName();

        Mobile obj2 = new Mobile();

        System.out.println("The brand name is : " + obj2.Brand);
        System.out.println("The ram is : " + obj2.Ram);
        System.out.println("The orice is : " + obj2.price);
        System.out.println("Brand : " + obj2.Brand + " Ram : " + obj2.Ram + "Price : " + obj2.price);
    }



}
