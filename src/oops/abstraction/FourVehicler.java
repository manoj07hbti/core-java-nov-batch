package oops.abstraction;

public class FourVehicler extends VehicleABS {
        @Override
        public void pricing() {
            System.out.println("This Pricing for Four Wheeler Vehicle ");
        }

        @Override
        public void servicing() {
            System.out.println("This servicing for Four Wheeler Vehicle ");
        }

        public static void main(String[] args) {

            System.out.println("Welcome to four wheeler Management System");

            FourVehicler obj= new FourVehicler();
            obj.vehicleInfo();
            obj.pricing();
            obj.servicing();
        }
    }

