package oops.abstraction;

public class Paytm implements Payment {
    @Override
    public void checkBalance() {
        System.out.println("{PAYTM CHECK BALANCE");
    }

    @Override
    public void transferMoney() {
        System.out.println("PAYTM TRANSFER MONEY LOGIC");
    }

    @Override
    public void lastTenTransactions() {
        System.out.println("PAYTM PE LAST TRANSACTIONS ");
    }

    @Override
    public void changeProfilePhoto() {
        System.out.println("PAYTM changeProfilePhoto ");
    }
}
