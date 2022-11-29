package Class_and_object;

public class Fan {
    // data member or properties
    String brand = "Bajaj";
    String colour = "Black";
    int num = 5;

    public static void main(String[] args) {
        //Syntax: classname obj name=new class name ();
        Fan obj = new Fan();
        //object name.properties name
        System.out.println("Good fans are " + obj.brand);
        System.out.println("Good fans are " + obj.colour);
        System.out.println("Good fans are " + obj.num);

    }
}