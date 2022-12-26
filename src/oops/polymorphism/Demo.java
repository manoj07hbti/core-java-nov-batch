package oops.polymorphism;

public class Demo {
    public void method () {

        System.out.println("Car Showroom Data");
    }
    //Override
    public void Polymorphis (String Name) {

        System.out.println("Car Name  : " + Name);
    }


    //Override again
    public void Polymorphis (int model){

        System.out.println("Model is  : "+model);

    }
    //Override again
    public void Polymorphis (double price) {

        System.out.println("Price of the car is  : " + price);
    }
   // Override again
   public void Polymorphism (String series, int discount){

        System.out.println(" Series is  : "+series+"       Discount is :"+discount);

   }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.method();
        obj.Polymorphis("varun");
        obj.Polymorphis(2050);
        obj.Polymorphis(8888888.9918);
        obj.Polymorphism("s",1);




    }


    }

