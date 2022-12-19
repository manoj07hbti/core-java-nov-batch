package oops.inheritance;

public class DemoB extends DemoA{

    public void m3(){

        System.out.println("THis is m3 method of DEMO B CLASS");
    }



    public static void main(String[] args) {

        DemoB obj= new DemoB();

        obj.m1();
        obj.m2();

        System.out.println(obj.name);

    }
}
