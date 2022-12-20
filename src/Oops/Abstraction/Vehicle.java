package Oops.Abstraction;

// it is a abstract class....and we have to declare it abstract.... so mention abstract
public abstract class Vehicle {

     //Abstract  : hiding internal details or process to the users
    // In Every abstract class should have at least one abstract method
    // Abstract class has no {...code/body...}

    public void vehicleInfo(){
        System.out.println("Print vehicle information");
    }
    // abstract method  is creating
    // An abstract method can implement only  one abstract method in a time
    public abstract void price();
    public abstract void colour ();


}
