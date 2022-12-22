package oops.inheritance;

public class DemoB extends DemoA {

    // Class will extend and Interface will implement ----for parent ----inheritance---child
    // Parent class (Super class)------DemoA
    // Child Class (Sub class)---------DemoB
    // Single inheritance between parent class and child class------>Child class--------inheritance-----Parent class
    // Syntax for Java Inheritance : class Child extends Parent { methods and fields}

    // extends keyword : the extends keyword indicates that we are making a new class that drives from an existing class
    // The Child class will get automatically all things(methods and data members or properties) from the parent class


    public void m4 (){

        System.out.println("This is m4 method.....");

    }



     // main method to run program
     public static void main(String[] args) {

         // Step1: Created an object of class----classname object_name = new classname();
         DemoB obj = new DemoB();

         // Step2: To call method -----object_name.method_name();

         obj.m1();
         obj.m2();
         obj.m3();
         obj.m4();

         System.out.println("Printing variable value :"+obj.name);

     }



}
