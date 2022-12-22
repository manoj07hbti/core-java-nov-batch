package oops.abstraction;

public class GooglePay implements Payment{

    // Interface will implement
    // Child class-----GooglePay
    // Parent class----Payment

    // Now we will implement (@Override) the abstract methods of interface---Payment


    @Override
    public void checkBalance() {

     System.out.println(" GooglePay check balance ......");
    }

    @Override
    public void transferMoney() {

        System.out.println(" GooglePay transfer money......");

    }

    @Override
    public void checkLastTenTransaction() {

        System.out.println(" GooglePay checkLastTenTransaction......");


    }

    @Override
    public void changeProfilePhoto() {

        System.out.println(" GooglePay changeProfilePhoto......");

    }

    // Main method to run program

    public static void main(String[] args) {

        // Step1: Created an object of class (GooglePay)-----------classname object_name = new classname();

        GooglePay googlePay = new GooglePay();

        // Step2: To call method -----object_name.method_name();
        googlePay.checkBalance();
        googlePay.transferMoney();
        googlePay.checkLastTenTransaction();
        googlePay.changeProfilePhoto();

    }



}
