package oops.abstraction;

public class PayTm implements Payment{
    @Override
    public void checkBalance() {
        System.out.println("Paytm balance....");
    }

    @Override
    public void transferMoney() {
        System.out.println("Transferring money by Paytm....");
    }

    @Override
    public void lastTenTransaction() {
        System.out.println("Last 10 transaction og Paytm.....");
    }

    @Override
    public void changeProfilePhoto() {
        System.out.println("Changing profile photo of Paytm...");
    }

    public static void main(String[] args) {
        PayTm obj = new PayTm();
        obj.checkBalance();
        obj.transferMoney();
        obj.lastTenTransaction();
    }
}
