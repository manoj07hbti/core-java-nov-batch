package oops.abstraction;

public  abstract class VehicleABS {


        public void vehicleInfo(){
            // Scanner specification=new Scanner
            System.out.println("Vehicle details are as follow: ");
            // String specification = model.nextLine();
        }

        public abstract void pricing();// abstract as it will be different for every type of vehicle

        public abstract void servicing();

    }
