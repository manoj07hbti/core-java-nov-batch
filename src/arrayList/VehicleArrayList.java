package arrayList;

import model.Vehicle;

import java.util.ArrayList;

public class VehicleArrayList {


        public ArrayList<Vehicle> createVehicleList() {


            // SYNTAX : ArrayList <Vehicle> objName = new ArrayList();

            ArrayList<Vehicle> vehicles = new ArrayList<>();

            // create Vehicle list
            Vehicle vehicle = new Vehicle("SUZUKI", 240000, 30.45);
            Vehicle vehicle1 = new Vehicle("HONDA", 1200000, 25.48 );
            Vehicle vehicle2 = new Vehicle("AUDI", 2300000, 15.86);

            vehicles.add(vehicle);
            vehicles.add(vehicle1);
            vehicles.add(vehicle2);

            return vehicles;
        }

        public static void main(String[] args) {

            arrayList.VehicleArrayList obj = new arrayList.VehicleArrayList();
            ArrayList<Vehicle> vehiclesList = obj.createVehicleList();

            for (Vehicle vehicle : vehiclesList) {

                System.out.println("Printing Car name : " + vehicle.getName());
                System.out.println("Car price : " + vehicle.getPrice());
                System.out.println("Car mileage : " + vehicle.getMileage());

                System.out.println("Car name : " +vehicle.getName() + ", Car price : " +vehicle.getPrice()+", Car mileage : " +vehicle.getMileage());

            }

        }
}
