package oops.inheritance;

public class Grand_Father {

    String name = "         Name is Grand Father...";

    public void M1 () {
        System.out.println("  I have 50 lack rupees");
    }

    public void M2 () {
        System.out.println("  I am more than 4 Cars.");
    }

    public static void main(String[] args) {
        System.out.println("    ***** HERE MY ALL PROPERTIES *****");

        Grand_Father obj = new Grand_Father();
        obj.M1();
        obj.M2();

        System.out.println(obj.name);
    }
}
