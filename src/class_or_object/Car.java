package class_or_object;

public class Car {

    String name = "ALTO 800";
    String color = "WHITE";
    int model = 2021;
    double price = 408543.46;
    int seat = 4;
    int wheel = 4;

    public static void main(String[] args) {
        Car obj = new Car();
        System.out.println("Car Name = "+obj.name+", and Color is "+obj.color+", and Model is "+obj.model+", and Price of the car is "+obj.price+", and Seats in car are "+obj.seat+", and Wheels in the car are "+obj.wheel);
    }
}
