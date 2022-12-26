package oops.inheritance;

public class DemoY {

    public void m1() {

        System.out.println("Hello this is Demo Y method its called parent.");

    }

    public void m2() {
        System.out.println("This m2 method of parent class");
    }

    public static void main(String[] args) {

        DemoY obj = new DemoY();
        obj.m1();
        obj.m2();
    }
}
