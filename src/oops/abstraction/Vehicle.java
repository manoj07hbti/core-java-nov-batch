package oops.abstraction;

import java.util.Scanner;

public abstract class Vehicle {
    public String model (){

       Scanner model = new Scanner(System.in);
        System.out.println("Please Enter Vehicle Model Name : ");
       String modelinfo = model.nextLine();
       return modelinfo;

    }
    public abstract void pricing();
    public abstract void servicing();
}
