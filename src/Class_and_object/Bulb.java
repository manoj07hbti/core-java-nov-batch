package Class_and_object;

public class Bulb {
    // data member or properties
    int number= 1000;
    String colour ="Yellow";
    String invented="Humphry Davy";
     int year = 1806;
     String institute = "Royal institute in great Britain ";

    public static void main(String[] args) {
     // Syntax;class name obj name = new class name ();
     Bulb obj = new Bulb();
        System.out.println(" bulb is  " + obj.number);
        System.out.println(" colour"+obj.colour);
        System.out.println(" He "+obj.invented);
        System.out.println(" In this year " +obj.year);
        System.out.println(" He belongs to "+obj.institute);
    }
}
