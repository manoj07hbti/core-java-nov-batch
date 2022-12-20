package oops.inheritance;

public class Father extends Grand_Father{

    public void M3 () {
        System.out.println("This is all my After my Father....");
    }

    public static void main(String[] args) {
        System.out.println("    ***** HERE MY ALL PROPERTIES *****");

        Father obj = new Father();
        obj.M1();
        obj.M2();
        obj.M3();
    }
}
