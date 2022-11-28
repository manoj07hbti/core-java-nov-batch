package class_and_object;

public class Mobile {

    // Properties or Data members----------brand ,color ,camera

    String brand = "Realme";
    String color = "Silver";
    int camera   = 64;


    public static void main(String[] args) {

        // To create an object of class(Mobile) using default constructor
        // Syntax : classname  object_name = new classname();

        Mobile mobile = new Mobile();

        System.out.println("Brand is :"+ mobile.brand);
        System.out.println("Color is :"+mobile.color);
        System.out.println("Camera is :"+mobile.camera);






    }







}
