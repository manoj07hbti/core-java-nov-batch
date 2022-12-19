package oops.inheritance;

public class Dog extends Animal{

   // Syntax of Java Inheritance : class Subclass_name extends Superclass_name{methods and fields}-------class Child extends Parent {method and field}
   // Subclass----Child class-----Dog
   // Superclass-----Parent class ----Animal
   // extends keyword:  The extends keyword indicates that we are making a new class that derives from an existing class.
   // The meaning of "extends" is to increase functionality.
   // The Child class inherits all properties and methods of the Parent class
   // Single Inheritance : Parent<-------inheritance------->Child


    public void bark (){

     System.out.println(" Dog is barking .....");
    }

  // main method to run program
  public static void main(String[] args) {

     // Step1 : Created an object of class (Dog) ------classname object_name = new classname ();

      Dog dog = new Dog();

      // Step2: To call method -----object_name.method_name();

      dog.eat();
      dog.sleep();
      dog.bark();




      System.out.println(" Properties of Animal :"+ dog.breed + dog.color+ dog.height);


  }


}
