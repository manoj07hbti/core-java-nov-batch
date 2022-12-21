package oops.abstraction;

public class GooglePay implements Payment{
    @Override
    public void checkBalance() {
        System.out.println("Checking Balance...");
    }

    @Override
    public void transferMoney() {
        System.out.println("Transferring money....");
    }

    @Override
    public void lastTenTransaction() {
        System.out.println("Checking last Ten Transaction.....");
    }

    @Override
    public void changeProfilePhoto() {
        System.out.println("Changing profile photo of Google Pay...");
    }

    public static void main(String[] args) {
        GooglePay obj = new GooglePay();
        obj.checkBalance();
        obj.transferMoney();
        obj.lastTenTransaction();

    }
}
