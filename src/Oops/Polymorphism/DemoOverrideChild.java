package Oops.Polymorphism;

public class DemoOverrideChild extends DemoOverriding {
    public void a1(){
        System.out.println("This is a1 method of child class");

    }
    public void a2(){
        System.out.println("This is a2 method of child class");
    }

    /*public void a3()
    public  void a4;

    both can not be overridden because - final modifier has own final value that neither change nor replace
                                         Private-- has own limit it do not share his data publicly or others
            */
    public  DemoOverrideChild  createObject() {
        return new DemoOverrideChild();

    }

    public static void main(String[] args) {
       DemoOverriding  obj  = new DemoOverriding();

        obj .a1();
        obj.a2();  // it is object of parent class that's why it is showing parent class data


        DemoOverriding  obj2 = new DemoOverrideChild();
         obj2. a1();
         obj2.a2(); // if we want to print child class data so have to initialize child class into parent class
        // child class can not  store parent class within  his method because..... child class is always small to parent class
    }
}