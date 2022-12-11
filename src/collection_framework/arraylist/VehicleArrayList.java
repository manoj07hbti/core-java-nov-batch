package collection_framework.arraylist;

import collection_framework.model.Vehicle;

import java.util.ArrayList;

public class VehicleArrayList {

    public ArrayList <Vehicle> createVehicleList(){
        // return_type---- ArrayList of Vehicle --------- ArrayList <Vehicle>



        // Syntax for Generics : ArrayList <DataType> object_name = new ArrayList <DataType> ();
        // Generics: It tells the DataType------String , Integer ,Double ,and Float or other
        // Generics : It is used to create an object of the ArrayList class


        ArrayList <Vehicle> vehicles = new ArrayList<>(); // Here DataType-----Vehicle

        // First,We will create Employee Data

        Vehicle vehicle1 = new Vehicle("Hero Splendor Plus",70954,"97.2cc","9.8L");
        Vehicle vehicle2 = new Vehicle("Honda Shine",83914,"124cc","10.5L");
        Vehicle vehicle3 =new Vehicle("Hero Passion Pro",77408,"113.2cc","10L");
        Vehicle vehicle4 = new Vehicle(" Tata Tiago XZ Plus",776338,"1199cc","35L");


        // For creating the vehicle list we will add vehicle's data to an object of ArrayList of Vehicle and use the add method.
        // add method : add(value);
        // Syntax for add method : object_name.add_method (); ----------object_name.add(value);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        vehicles.add(vehicle3);
        vehicles.add(vehicle4);


         return vehicles;







    }

    // Main method to run program

    public static void main(String[] args) {

        // Step1: Created an object of the class (VehicleArrayList) -------- classname object_name = new classname ();
        VehicleArrayList obj = new VehicleArrayList();

        // Step2: To call method ------ object_name.method_name();

       ArrayList<Vehicle> vehicleList =  obj.createVehicleList();  // Taken a variable ---- vehicleList------ of ArrayList <Vehicle>
                                                                   // Stored the output in-------- vehicleList----- variable
        // Using the for loop
        // Syntax for for_loop : for (initialization; condition; increment or decrement){code}

        for(int i = 0; i<vehicleList.size(); i++){

            System.out.println("Printing the Vehicle brand :"+" at index :"+ i +" :"+vehicleList.get(i).getBrand());
            System.out.println("Printing the Vehicle brand :"+" at index :"+ i +" :"  +vehicleList.get(i).getPrice());
            System.out.println("Printing the Vehicle brand :"+" at index :"+ i +" :"+vehicleList.get(i).getEngine_capacity());
            System.out.println("Printing the Vehicle brand :"+" at index :"+ i +" :" + vehicleList.get(i).getFuel_tank_capacity());

            // Print all data in a single line
            System.out.println("Brand :"+vehicleList.get(i).getBrand()+" Price :"+vehicleList.get(i).getPrice()+" Engine Capacity :"+vehicleList.get(i).getEngine_capacity()+" Fuel tank capacity : "+vehicleList.get(i).getFuel_tank_capacity());

        }



    }

}
