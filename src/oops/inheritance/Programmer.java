package oops.inheritance;

public class Programmer extends Employee{

    // Syntax of Java Inheritance : class Subclass_name extends Superclass_name{methods and fields}-------class Child extends Parent {method and field}
    // The Child class inherits all properties and methods of the Parent class
    // extends keyword:  The extends keyword indicates that we are making a new class that derives from an existing class.
    // Subclass----Child class-----Programmer
    // Superclass-----Parent class ----Employee
    // Single Inheritance : Parent<-------inheritance------->Child

    int bonus = 10000;



    // Main method to run program
    public static void main(String[] args) {

        // Step1 : Created an object of class (Programmer) ------classname object_name = new classname ();

        Programmer programmer = new Programmer();

        System.out.println("Programmer name : "+programmer.name +"  Department :"+programmer.department+" Id :"+programmer.id +" Bonus :"+programmer.bonus);


    }





}
