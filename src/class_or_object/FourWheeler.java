package class_or_object;

public class FourWheeler {

    // DATA MEMBER
    String Car;
    int Gear;
    String Power;

    // PARAMETERIZED CONSTRUCTOR


    public FourWheeler(String car, int gear, String power) {
        Car = car;
        Gear = gear;
        Power = power;
    }

    public static void main(String[] args) {
        FourWheeler obj = new FourWheeler("BMW", 4, "4000hp");
        System.out.println("Car Name = "+obj.Car+", Gear = "+obj.Gear+", Power ="+obj.Power);

        // SECOND OBJECT
        FourWheeler obj2 = new FourWheeler("Alto 800", 5, "400hp");
        System.out.println("Car Name = "+obj2.Car+", Gear = "+obj2.Gear+", Power ="+obj2.Power);

        // THIRD OBJECT
        FourWheeler obj3 = new FourWheeler("Audi", 5, "1500hp");
        System.out.println("Car Name = "+obj3.Car+", Gear = "+obj3.Gear+", Power ="+obj3.Power);

        // FOURTH OBJECT
        FourWheeler obj4 = new FourWheeler("JAGUAR", 4, "2000HP");
        System.out.println("Car Name = "+obj4.Car+", Gear = "+obj4.Gear+", Power ="+obj4.Power);

        // FIFTH OBJECT
        FourWheeler obj5 = new FourWheeler("Land Rover", 4, "2100hp");
        System.out.println("Car Name = "+obj5.Car+", Gear = "+obj5.Gear+", Power ="+obj5.Power);
    }
}
