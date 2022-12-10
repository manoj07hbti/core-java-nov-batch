package conditional_framework.arraylist;

import conditional_framework.model.Vehicle_M;

import java.util.ArrayList;

public class vehicle_list {

    //method
    public ArrayList<Vehicle_M> vehiclelist(){

        //syntax --- ArrayList<datatype> classname = new classname():

        ArrayList<Vehicle_M> vehicle = new ArrayList<>();

        //create vehicle class

        Vehicle_M V1 = new Vehicle_M("Hero Honda",55000.56,"Bike");
        Vehicle_M V2 = new Vehicle_M("Verna",700000.666,"Car");
        Vehicle_M V3 = new Vehicle_M("BMW",80000000.678,"Car");

        vehicle.add(V1);
        vehicle.add(V2);
        vehicle.add(V3);

        return vehicle;
    }

    public static void main(String[] args) {

        vehicle_list obj =new vehicle_list();

        ArrayList<Vehicle_M> data = obj.vehiclelist();

        for (int i=0; i<data.size(); i++){
            System.out.println("Name = "+data.get(i).getName());
            System.out.println("Price = "+data.get(i).getPrice());
            System.out.println("Type = "+data.get(i).getType());
            System.out.println("\n");
        }

    }
}
