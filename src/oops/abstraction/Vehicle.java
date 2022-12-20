package oops.abstraction;

import java.util.Scanner;

public abstract class Vehicle {
    public void model (){

       // Scanner model = new Scanner(System.in);
        System.out.println("Please Enter Vehicle Model Name : ");
       // String modelinfo = model.nextLine();

    }
    public abstract void pricing();
    public abstract void servicing();
}
