package oops.polymorphism;

public class DemoMethodOverLoading {

    public void m1(){

        System.out.println("This is normal method m1");
    }

    // overload
    public void m1(int age){

        System.out.println("This is OverLoad  method m1 "+age);
    }

    // overload again
    public void m1(String name){

        System.out.println("This is again  OverLoad  method m1 "+name);
    }

    // overload again
    public void m1(double price){

        System.out.println("This is again  OverLoad  method m1 "+price);
    }

    // overload again with multiple param
    public void m1(double price,String name){

        System.out.println("This is again  OverLoad  method m1 multiple param "+price);
    }


    public static void main(String[] args) {

        DemoMethodOverLoading obj= new DemoMethodOverLoading();

        obj.m1();
        obj.m1(33);
        obj.m1(25.6,"Java");
        obj.m1("Java");
    }

}
