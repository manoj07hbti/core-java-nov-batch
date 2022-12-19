package Oopsinheritance;

public class demoC extends demoB {
    public void m4(){
        System.out.println("this is m4 method");

    }


    public static void main(String[] args) {
        demoC obj =new demoC();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();

    }
}
