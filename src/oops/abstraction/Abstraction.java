package oops.abstraction;

public abstract class Abstraction {    // Abstract class


    // Abstraction : Hiding internal details or information.
    // Real world example of Abstraction : Switch board, two-wheeler,Four-wheeler ,washing machine,cooler etc
    // We can achieve Abstraction in two ways : 1) Using Abstract class , 2) Using Interface
    // Abstract class : A class which have at least one abstract method then it is called an abstract class ,it can have other methods (the normal method means containing body) as well
    // Abstract class provides partial abstraction because it contains both abstract and normal or standard methods
    // Abstract class : We can not create an object of an abstract class because the abstract method does not contain a body or code but Child class can implement methods of abstract class
    // Abstract Method : A method without a method body is called an abstract method
    // Syntax for Abstract Method : access_specifier abstract return_type  function or method_name();
    // Normal or Standard method: public void demo(parameter){code}
    // Abstract method: public abstract void demo();

    // Here Abstract class achieved 33.333 % abstraction (100/3),3----methods------1 abstract method and two normal methods




     public abstract void demo(); // Abstract Method


      public void m1 (){

      System.out.println("This is Normal or Standard m1 method : ");

     }


    public void m2 (){

        System.out.println("This is Normal or Standard m2 method : ");

    }



   // Main method to run program
   public static void main(String[] args) {

    /*  We can not create an object of an abstract class because the abstract method does not contain a body or code

      // Step :  create an object of class------classname object_name = new classname();
                 Abstraction obj = new Abstraction();
                  obj.m1(); // abstract method does not contain a body or code

                     */

   }







}
