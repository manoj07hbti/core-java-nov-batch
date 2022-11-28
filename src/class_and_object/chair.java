package class_and_object;

public class chair {

    String item = "chair";
    String use  = "sit";
    double price = 200.50;

    public static void main(String[] args) {

        //classname obj = new classname ();

        chair obj = new chair();
        System.out.println("ITEM = "+ obj.item);
        System.out.println( " USED FOR = " + obj.use);
        System.out.println( " PRICE = " + obj.price);
    }


}
