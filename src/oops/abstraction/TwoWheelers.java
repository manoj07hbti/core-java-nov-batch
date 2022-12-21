package oops.abstraction;

public class TwoWheelers extends Vehicle{

    @Override
    public void pricing() {
        System.out.println("Pricing of vehicle is : 123456");
    }

    @Override
    public void servicing() {
        System.out.println("Servicing of vehicle is : Paid");
    }

    public static void main(String[] args) {
        TwoWheelers obj = new TwoWheelers();
      String model =  obj.model();
      System.out.println("Model of Vehicle is : "+model);
        obj.pricing();
        obj.servicing();
    }

}
