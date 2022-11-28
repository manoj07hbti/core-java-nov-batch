package class_and_object;

public class Pen {
    String brand = "Flair Submarine";
    int price = 99;
    String color = "Blue Ball Pen";

    public static void main(String[] args) {
        Pen specs = new Pen();
        System.out.println("Name - "+specs.brand+", "+specs.color+", Price - "+specs.price+"/- Rs Only");

    }
}
