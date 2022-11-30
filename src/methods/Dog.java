package methods;

public class Dog {

    // Properties or Data members or instance variables of class (Dog) -------breed,age,height,color---etc

      String breed;
      int age;
      int height;
      String color;


    // Syntax of Method or Function: access_specifier  return_type  method or function_name (input parameters/optional){code}
    // Member function or Method is the capabilities of class
    // Class-----Dog------capabilities(Method)--------->bark ,run ,play

    // Method1:
    public void bark(){

       System.out.println(" Dog is barking...");

    }

    // Method2:
    public void run(){
        System.out.println("Dog is running....");


    }

    // Method3:
    public void play(){

     System.out.println("Dog is playing......");

    }

    // Main method to run program
    public static void main(String[] args) {
        // Step1:  Created an object of class---------- classname object_name = new classname();

        Dog dog = new Dog();

        // Step2: To call method--------------------object_name.method_name


        dog.bark();
        dog.run();
        dog.play();

    }





}
