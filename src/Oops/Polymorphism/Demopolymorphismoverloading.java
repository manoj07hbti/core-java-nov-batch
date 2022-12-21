package Oops.Polymorphism;

public class Demopolymorphismoverloading {
    public void m1(){
        System.out.println("this is simple method");

    }
    public void m1(int age){
        System.out.println("this is method with age " +age);

    }
    public void m1(String name ){

        System.out.println("this is method with anme " +name);
    }
    public void m1(String name ,int age ){
        System.out.println("name is : " +name +" age is "+ age);
    }

    public static void main(String[] args) {
        Demopolymorphismoverloading obj = new Demopolymorphismoverloading();
        obj.m1();
        obj.m1(25);
        obj.m1("gaurang" );
        obj.m1("Gaurang",25);
    }
}
