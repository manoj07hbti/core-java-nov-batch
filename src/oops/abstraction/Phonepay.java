package oops.abstraction;

public class Phonepay implements Payment {

    @Override
    public void checkBalance() {
        System.out.println("The remaining balance is :");
    }

    @Override
    public void transferMoney() {
        System.out.println("Click here for money transfer");

    }

    @Override
    public void lastTenTransactions() {
        System.out.println("Your last ten transition are :");

    }

    @Override
    public void changeProfilePhoto() {
        System.out.println("Click here to update ur profile picture");

    }

    public static void main(String[] args) {
        Phonepay obj= new Phonepay();
        obj.changeProfilePhoto();
        obj.checkBalance();
        obj.lastTenTransactions();


    }
}