package collection_framework.arraylist;

import collection_framework.model.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleArrayList {

    public ArrayList <Vehicle> vehicleList (){
        // SYNTAX :  ArrayList <Datatype> objName= new ArrayList();
        ArrayList <Vehicle> vehicles = new ArrayList<>();

        //create vehicle data via scanner
        Scanner userVehicleData = new Scanner(System.in);
        Scanner userVehicleData1 = new Scanner(System.in);
        System.out.print(" Please enter how many vehicle details you want to enter : ");
        int i = userVehicleData.nextInt();
        for (int j=0; j<i; j++){
            System.out.print("Enter Vehicle Model : ");

            String model = userVehicleData1.nextLine();

            System.out.print("Enter Vehicle Price : ");
            int price = userVehicleData.nextInt();

            System.out.print("Enter Vehicle Wheels 2 or 4 : ");
            int wheels = userVehicleData.nextInt();

            Vehicle vehicle1 = new Vehicle(model,price,wheels);

            vehicles.add(vehicle1);


        }

        return vehicles;
    }

    public static void main(String[] args) {
        VehicleArrayList obj = new VehicleArrayList();
        ArrayList <Vehicle> vehiclelist = obj.vehicleList();

        for (int i=0; i<vehiclelist.size();i++){
            System.out.println("Vehicle Model : "+vehiclelist.get(i).getModel());
            System.out.println("Vehicle Price : "+vehiclelist.get(i).getPrice());
            System.out.println("Vehicle no of wheels : "+vehiclelist.get(i).getWheels());
            System.out.println("Vehicle All Details Model : "+vehiclelist.get(i).getModel()+", Price : "+vehiclelist.get(i).getPrice()
                    +", no of wheels : "+vehiclelist.get(i).getWheels());
        }

    }
}
