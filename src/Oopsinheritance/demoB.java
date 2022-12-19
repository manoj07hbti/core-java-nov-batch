package Oopsinheritance;

public class demoB extends demoA {
    public void m3(){
        System.out.println("this is m3 method");

    }


    public static void main(String[] args) {
        demoB obj =new demoB();
        obj.m1();
        obj.m2();
        obj.m3();


    }
}
