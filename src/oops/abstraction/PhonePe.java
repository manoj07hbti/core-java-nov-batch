package oops.abstraction;

public class PhonePe implements Payment{
    @Override
    public void checkBalance() {
        System.out.println("checking Balance of PhonePe.....");
    }

    @Override
    public void transferMoney() {
        System.out.println("Transferring money by PhonePe.....");
    }

    @Override
    public void lastTenTransaction() {
        System.out.println("Checking last Ten Transaction.......");
    }

    @Override
    public void changeProfilePhoto() {
        System.out.println("Changing profile photo of PhonePe...");
    }

    public static void main(String[] args) {
        PhonePe obj = new PhonePe();
        obj.checkBalance();
        obj.transferMoney();
        obj.lastTenTransaction();
    }
}
