package oops.abstraction;

public class Child  extends Abstraction {

    // Child class can implement methods of abstract class



    @Override
    public void demo() {

     System.out.println(" This is an implemented method .....");



    }

    // Main method to run program
    public static void main(String[] args) {

    // Step1 : Created an object of class-----classname object_name = new classname();
    Child child = new Child();

    // Step2: To call method : object_name.method_name();

        child.m1();
        child.m2();
        child.demo();


    }






}
