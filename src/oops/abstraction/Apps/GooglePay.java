package oops.abstraction.Apps;
//While you add the paymentsoftwaredesign interface then it shows error then you make it implements----

public class GooglePay implements PaymentSoftwareDesign {

    public void Googlepay(){
        System.out.println("WELCOME TO THE Google Pay APP--\n");
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
        GooglePay obj = new GooglePay();
        obj.Googlepay();
        obj.Transfermoney();
        obj.Checkbalance();
        obj.Mobilerecharge();
    }
}
