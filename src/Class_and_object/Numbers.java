package Class_and_object;

public class Numbers {
    // Datamember or properties
    String name = "numbers";
     int digit=10;
     String odd= "odd 1,3.5.....";
     String even = " Even 2,4,6,8......";
     String natural ="Natural 1,2,3,4,5,6,7,8....... ";

    public static void main(String[] args) {
    // Syntax:class name obj name = new class name ();
    Numbers obj = new Numbers  ();
    // object name.properties name
        System.out.println("Numbers are:"+ obj.name);
        System.out.println("Numbers are:"+ obj.digit);
        System.out.println("Numbers are:"+obj.odd);
        System.out.println("Numbers are:"+ obj.even);
        System.out.println("Numbers are:"+obj.natural);
    }
}
