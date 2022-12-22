package oops.inheritance;

public class DemoA {

    // Syntax for Variable : DataType variable_name = value;

    String name = " Java";

    // Syntax for Method : access_specifier return_type function or method_name (parameter){code}
    // Parameter-----an input parameter that is optional

    public void m1 (){

    System.out.println("This is m1 method.....");
    }



    public void m2 (){

        System.out.println("This is m2 method.....");
    }


    public void m3 (){

        System.out.println("This is m3 method.....");
    }



   // Main method to run program

    public static void main(String[] args) {

       // Step1: Created an object of class----classname object_name = new classname();

        DemoA obj = new DemoA();

       // Step2: To call method -----object_name.method_name();
        obj.m1();
        obj.m2();
        obj.m3();

        System.out.println("Printing variable value :"+obj.name);



    }



}
