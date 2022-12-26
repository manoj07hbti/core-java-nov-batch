package oops.inheritance;

public class DemoX extends DemoZ{

    public void m4(){
        System.out.println("OK so here we go to see multilevel inheritance in DemoX this is grand son of DemoY and son of DemoZ");
    }

    public static void main(String[] args) {

        DemoX obj = new DemoX();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }

}
