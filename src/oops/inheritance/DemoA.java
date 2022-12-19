package oops.inheritance;

public class DemoA {

    String name="Java";

    public void m1(){

        System.out.println("This is Demo M1 method of DemoA class");
    }

    public void m2(){

        System.out.println("This is Demo M2 method of DemoA class");
    }

    public static void main(String[] args) {

        DemoA obj = new DemoA();
        obj.m1();
        obj.m2();

    }


}
