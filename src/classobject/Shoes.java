package classobject;

public class Shoes {

    String brand="puma";
    double price= 12000;
    int model=2021;


    public static void main(String[]args){

        Shoes obj=new Shoes();
         System.out.println("The brand of the shoes is="+obj.brand);
        System.out.println("The price of the shoes is="+obj.price);
        System.out.println("The model of the shoes is="+obj.model);

        System.out.println("The brand ="+obj.brand+"   price="+obj.price+"   model="+obj.model);
    }
}
