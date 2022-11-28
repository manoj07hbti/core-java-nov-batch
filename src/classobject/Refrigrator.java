package classobject;

public class Refrigrator {


    String brand = "samsung";
    double price = 5500.89;
    int capacity = 40;
    int model = 2022;


    public static void main(String[] args) {


        Refrigrator obj = new Refrigrator();


        System.out.println("The brand of the product is"+obj.brand);
        System.out.println("The capacity of product is"+ obj.capacity);
        System.out.println("The model of the product is"+obj.model);
        System.out.println("The price of the product is"+obj.price);



        System.out.println("brand ="+obj.brand+"capacity ="+obj.capacity+"model="+obj.model+"price="+obj.price);
    }
}

