package oops.inheritance;



public class DemoC extends DemoB {

    public void m4(){

        System.out.println("THis is m4 method of DEMO C CLASS");
    }

    public static void main(String[] args) {

        DemoC obj= new DemoC();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
