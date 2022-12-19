package oops.inheritance;

public class DemoC extends DemoB{

    public void m4(){
        System.out.println("This is M4 class of DemoC");
    }
    public static void main(String[] args) {

        DemoC obj = new DemoC();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
        System.out.println(obj.name);
    }
}
