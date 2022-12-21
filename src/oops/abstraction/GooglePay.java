package oops.abstraction;

public class GooglePay implements Payment {

    @Override
    public void checkBalance() {

        System.out.println("GOOGLE PAY CHECK BALANCE");
    }

    @Override
    public void transferMoney() {

        System.out.println("GOOGLE PAY TRANSFER MONEY LOGIC");
    }

    @Override
    public void lastTenTransactions() {

        System.out.println("GOOGLE PAY LAST TRANSACTIONS ");
    }

    @Override
    public void changeProfilePhoto() {
        System.out.println("GOOGLE PAY changeProfilePhoto ");
    }
}
