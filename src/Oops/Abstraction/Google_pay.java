package Oops.Abstraction;

public class Google_pay implements Payment {
    @Override
    public void checkbalance() {
        System.out.println("please enter balance");
    }

    @Override
    public void transfermoney() {
        System.out.println("please enter money for transfer");

    }

    @Override
    public void lasttransaction() {
        System.out.println("please enter last 10 transaction");

    }

    @Override
    public void changeprofilephoto() {
        System.out.println("please change profile photo");
    }

    public static void main(String[] args) {
        Google_pay obj = new Google_pay();
        obj.checkbalance();
        obj.lasttransaction();
        obj.transfermoney();
    }
}
