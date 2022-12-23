package oops.abstraction.Apps;

public class PhonePE implements PaymentSoftwareDesign{

    public void Phonepe(){
        System.out.println("WELCOME TO THE PHONE PE APP--\n");
    }
    @Override
    public void Transfermoney() {
        System.out.println("Press for Transfer money");
    }

    @Override
    public void Checkbalance() {
        System.out.println("Press for Check balance");
    }

    @Override
    public void Mobilerecharge() {
        System.out.println("Press for Mobile Recharge");
    }

    public static void main(String[] args) {
        PhonePE obj = new PhonePE();
        obj.Phonepe();
        obj.Transfermoney();
        obj.Checkbalance();
        obj.Mobilerecharge();
    }
}
