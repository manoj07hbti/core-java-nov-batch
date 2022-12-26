package oops.inheritance;

public class DemoZ extends DemoY{

    public void m3(){
        System.out.println("This is m3 method od child class..");
    }

    public static void main(String[] args) {

        DemoZ obj = new DemoZ();
        obj.m1();
        obj.m2();
        obj.m3();
    }

}
