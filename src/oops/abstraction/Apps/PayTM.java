package oops.abstraction.Apps;

public class PayTM implements PaymentSoftwareDesign {

    public void paytm(){
        System.out.println("WELCOME TO THE PayTM APP--\n");
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
        PayTM obj = new PayTM();
        obj.paytm();
        obj.Transfermoney();
        obj.Checkbalance();
        obj.Mobilerecharge();
    }
}
