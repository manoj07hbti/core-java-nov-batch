package method;

public class Dog {

    // Data Member

    String breed;
    int age;
    int height;
    String color;


    // method

    //study
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void bark(){

        System.out.println("The dog is barking......");

    }


    public void run(){
        System.out.println("The dog is running......");


    }


    public void play(){

        System.out.println("The dog is playing..........");

    }



    public static void main(String[] args) {
        //STEP 1 create object
        Dog dog = new Dog();


        // STEP 2  objName.methodName();
        dog.bark();
        dog.run();
        dog.play();

    }

}
