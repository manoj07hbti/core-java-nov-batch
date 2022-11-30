package classprogram;

public class Object {
    //data member or properties of the class

    String name="Fruits";
    int price = 80;
    String colour= "red";

    public static void main(String[] args) {
        Object fr= new Object();

        System.out.println("The colour of fruit is"+fr.colour);
        System.out.println("The price of fruit is"+fr.price);
        System.out.println("The name of fruit is"+fr.name);

        Object fr1= new Object();

        System.out.println("The colour of fruit is"+fr1.colour);
        System.out.println("The price of fruit is"+fr1.price);
        System.out.println("The name of fruit is"+fr1.name);
    }
}
