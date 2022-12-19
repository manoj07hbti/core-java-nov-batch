package oops.inheritance;

public class BabyDog extends Dog{

     // MULTI LEVEL INHERITANCE : Parent<-------inheritance------->Child----------inheritance------->Grand Child--------inheritance------->Grand Grand child
     //  Parent<-------inheritance------->Child----------inheritance------->Grand Child
     //  Animal<-------inheritance------->Dog----------inheritance------->BabyDog

     public void weep (){

     System.out.println(" BabyDog is weeping .........");

     }

    // main method to run program

    public static void main(String[] args) {

        // Step1 : Created an object of class (BabyDog) ------classname object_name = new classname ();

        BabyDog babyDog = new BabyDog();


        // Step2: To call method -----object_name.method_name();


        babyDog.eat();   // Method of Parent class
        babyDog.sleep(); // Method of Parent class

        babyDog.bark(); // Method of Child class
        babyDog.weep(); // Method of Grand Child class


        System.out.println(" Printing the properties :"+babyDog.breed+babyDog.color+babyDog.height);


    }



}
