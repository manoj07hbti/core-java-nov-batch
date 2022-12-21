package oops.abstraction;

public class PhonePe implements Payment {
    @Override
    public void checkBalance() {

        System.out.println("PHONE PE CHECK BALANCE");
    }

    @Override
    public void transferMoney() {
        System.out.println("PHONE PE TRANSFER MONEY LOGIC");
    }

    @Override
    public void lastTenTransactions() {
        System.out.println("PHONE PE LAST TRANSACTIONS ");
    }

    @Override
    public void changeProfilePhoto() {
        System.out.println("PHONE PE changeProfilePhoto ");
    }
}
