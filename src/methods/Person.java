package methods;

public class Person {

    // Properties or Data members or instance variables of class (Person) -------name,age,city,home_address,---etc
    String name;
    int age;
    String home_address;
    String city;


    // Syntax of Method or Function: access_specifier  return_type  method or function_name (input parameters/optional){code}
    // Member function or Method is the capabilities of class
    // Class-----Person------capabilities(Method)--------->walk ,eat ,sleep

    // Method1:
    public void walk(){

        System.out.println("The Person is walking......");
    }

    // Method2:
    public void eat(){

      System.out.println("The Person is eating the food.....");

    }

    // Method3:

    public void sleep(){
        System.out.println("The person is sleeping......");
    }

    // Main method to run program
    public static void main(String[] args) {

        // Step1:  Created an object of class---------- classname object_name = new classname();

        Person person = new Person();

        // Step2: To call method--------------------object_name.method_name

        person.walk();
        person.eat();
        person.sleep();


    }




}
