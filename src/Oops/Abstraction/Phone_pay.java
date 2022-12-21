package Oops.Abstraction;

public class Phone_pay implements Payment {
    @Override
    public void checkbalance() {
        System.out.println("please enter check balance");
    }

    @Override
    public void transfermoney() {
        System.out.println("please enter the money for transfer");

    }

    @Override
    public void lasttransaction() {
        System.out.println("please enter the last transaction ");

    }

    @Override
    public void changeprofilephoto() {
        System.out.println("please cghange profile photo");
    }

    public static void main(String[] args) {
        Phone_pay obj = new Phone_pay();
        obj.checkbalance();
        obj.lasttransaction();
        obj.transfermoney();
    }
}