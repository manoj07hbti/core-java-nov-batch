package oops.abstraction;

public abstract class Vehicle {

    public void vehicleInfo(){

        System.out.println("Vehicle details are as follow: ");
    }

    public abstract void pricing();// abstract as it will be different for every type of vehicle

    public abstract void servicing();


}
