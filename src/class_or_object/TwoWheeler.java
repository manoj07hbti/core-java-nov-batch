package class_or_object;

public class TwoWheeler {

    // DATA MEMBER

    String name;
    int model;
    double price;

    public TwoWheeler(String name, int model, double price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public static void main(String[] args) {
        TwoWheeler obj =new TwoWheeler("Pulsar", 2019, 78000.00);
        System.out.println("Bike name = "+obj.name+", Model = "+obj.model+", Price = "+obj.price);

        //SECOND OBJECT
        TwoWheeler obj2 = new TwoWheeler("Star City", 2020, 56000.00);
        System.out.println("Bike name = "+obj2.name+", Model = "+obj2.model+", Price = "+obj2.price);

        // THIRD OBJECT
        TwoWheeler obj3 = new TwoWheeler("Passion Pro",  2018,60000.00);
        System.out.println("Bike name = "+obj3.name+", Model = "+obj3.model+", Price = "+obj3.price);

        // FOURTH OBJECT
        TwoWheeler obj4 = new TwoWheeler("Bullet", 2022, 102000.00);
        System.out.println("Bike name = "+obj4.name+", Model = "+obj4.model+", Price = "+obj4.price);

        // FIFTH OBJECT
        TwoWheeler obj5 = new TwoWheeler("Java", 2022, 140000.00);
        System.out.println("Bike name = "+obj5.name+", Model = "+obj5.model+", Price = "+obj5.price);
    }
}
