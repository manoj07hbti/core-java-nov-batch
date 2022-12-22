package oops.inheritance;

public class DemoC extends DemoB implements MyInterface{

    // Java does not support Multiple Inheritance Directly but Interface can provide Multiple Inheritance Indirectly
    // Multiple Inheritance : A class will have more than one parent class
    // Here in this class two parent class---- 1) extends DemoB  2) implements MyInterface

    // Here we will implement abstract method of interface (MyInterface) otherwise it will give an error

    @Override
    public void myMethod1() {

        System.out.println("This is implemented method1.....");

    }

    @Override
    public void myMethod2() {

        System.out.println("This is implemented method2.....");

    }



   // Main method to run program
   public static void main(String[] args) {

       // Step1: Created an object of class (DemoC)----classname object_name = new classname();
        DemoC demoC = new DemoC();

       // Step2: To call method -----object_name.method_name();

       demoC.m1(); // method of DemoA class
       demoC.m2(); // method of DemoA class
       demoC.m3(); // method of DemoA class
       demoC.m4(); // method of DemoB class

       System.out.println("Printing the value :"+demoC.name); // name-----variable of demoA class


   }






}
