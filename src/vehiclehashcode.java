import java.util.HashSet;
import model.vehicle;

public class vehiclehashcode {
    public HashSet<vehicle> createvehiclelist(){
        HashSet<vehicle>vehicleHashSet=new HashSet<>();
        vehicle vehicle1= new vehicle("bullet",350,250000);
        vehicle vehicle2= new vehicle("bajaj",180,180000);
        vehicle vehicle3= new vehicle("tvs",150,150000);
        vehicle vehicle4= new vehicle("bullet",350,250000);
        vehicle vehicle5= new vehicle("bajaj",180,180000);
        vehicle vehicle6= new vehicle("tvs",150,150000);

        vehicleHashSet.add(vehicle1);
        vehicleHashSet.add(vehicle2);
        vehicleHashSet.add(vehicle3);
        vehicleHashSet.add(vehicle4);
        vehicleHashSet.add(vehicle5);
        vehicleHashSet.add(vehicle6);
        return vehicleHashSet ;

    }

    public static void main(String[] args) {
        vehiclehashcode obj =new vehiclehashcode();
        HashSet<vehicle>vehicleHashSet= obj.createvehiclelist();
        for(vehicle var: obj.createvehiclelist()){
            System.out.println("printing of vehicle list : "+ var.getName() + " cc "+var.getCc() +" price "+var.getPrice());
        }

    }



}
