package Oops.Abstraction;

public class Paytm implements Payment {


    @Override
    public void checkbalance() {
        System.out.println("please enter the balance");
    }

    @Override
    public void transfermoney() {
        System.out.println("please enter the transfer money");

    }

    @Override
    public void lasttransaction() {
        System.out.println("please enter the last 10 transaction");

    }

    @Override
    public void changeprofilephoto() {
        System.out.println("please change profile photo");
    }

    public static void main(String[] args){
        Paytm obj = new Paytm();
        obj.checkbalance();
        obj.lasttransaction();
        obj.transfermoney();
    }
}
