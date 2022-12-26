package Oops.Polymorphism;

public class DemoOverriding {

    // Runtime Polymorphism

    public void a1(){
        System.out.println("This is a a1 parent class");

    }
    // protected class is basically use for child and parent class
    protected void a2(){

        System.out.println("This is a2 parent class");
    }
    // it is a final access_modifier.....final method can not be override in any other class

    public final void a3(){
        System.out.println("This ia a3 parent class");

    }
    // we can't use private access modifier in child class

    private void a4(){

        System.out.println("This ia a4 parent class");
    }

    public  DemoOverriding createObject(){

        return new DemoOverriding();
    }

    }

