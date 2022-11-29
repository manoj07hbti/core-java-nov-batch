package Class_and_object;

public class Pen {
    // data member or properties
    String name = "Pen";
    int price = 50;
    String colour = "blue";
    String workofpen = "To write a data";
int numberofpens =1000;
    public static void main(String[] args) {
        // Syntax:class name obj name = new class name ();
        Pen obj = new Pen();
        //obj name. properties name
        System.out.println("details of is: "+ obj.name);
        System.out.println("details of is : "+ obj.price);
        System.out.println("details of is : "+ obj.colour);
        System.out.println("details of is:  "+ obj.workofpen);
        System.out.println("details of is : "+ obj.numberofpens);
    }
}