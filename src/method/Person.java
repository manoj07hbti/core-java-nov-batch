package method;

public class Person {

    // Data Member
    String name;
    int age;
    String home_address;
    String city;


    // method

    //study
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void walk(){

        System.out.println("The Person is walking on the park...........");
    }


    public void eat(){

        System.out.println("The Person is eating the food.....");

    }


    public void sleep(){
        System.out.println("The person is sleeping on the bed............");
    }


    public static void main(String[] args) {

        //STEP 1 create object
        Person person = new Person();

        // STEP 2  objName.methodName();
        person.walk();
        person.eat();
        person.sleep();


    }

}


