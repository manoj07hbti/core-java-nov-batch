package oops.polymorphism;

public class DemoMethodOverload {

    public void m1() {

        System.out.println("This is normal method m1.");
    }

    // overload

    public void m1(int age) {

        System.out.println("This is overload method m1 : "+age);
    }

    // again overload

    public void m1(String name) {

        System.out.println("This is again overload m1 : "+name);
    }

    // again overload

    public void m1(Double price) {

        System.out.println("This is again overload m1 : "+price);
    }

    // again with multiple parameter

    public void m1(String name, int age) {

        System.out.println("This is multiple overload m1 : "+name+", "+age);
    }

    public static void main(String[] args) {
        DemoMethodOverload obj = new DemoMethodOverload();

        obj.m1();
        obj.m1(21);
        obj.m1("Java");
        obj.m1(654.15);
        obj.m1("Java",21);
    }
}
