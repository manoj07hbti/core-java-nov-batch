package oops.inheritance;

public class Son extends Father{

    public void M4() {
        System.out.println("And I am the new owner of these all properties.");
    }

    public static void main(String[] args) {
        System.out.println("    ***** HERE MY ALL PROPERTIES *****");

        Son obj = new Son();
        obj.M1();
        obj.M2();
        obj.M3();
        obj.M4();
    }
}
