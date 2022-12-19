package Oops.inheritance;

public class DemoC extends DemoB {

// multi Level Inheritance
// Syntax : child extents parents{....code...}

    public void a4() {

        System.out.println("THis is a4  inheritance clas");
    }
    public static void main(String[] args) {

        DemoC obj = new DemoC();
        obj.a1();
        obj.a2();
        obj.a3();

        System.out.println(obj.name);
    }

        }

