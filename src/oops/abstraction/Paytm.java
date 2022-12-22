package oops.abstraction;

public class Paytm implements Payment{

    // Interface will implement
    // Child class-----Paytm
    // Parent class----Payment

    // Now we will implement (@Override) the abstract methods of interface---Payment


    @Override
    public void checkBalance() {

        System.out.println(" Paytm check balance ......");


    }

    @Override
    public void transferMoney() {

        System.out.println(" Paytm transfer money......");

    }

    @Override
    public void checkLastTenTransaction() {

        System.out.println(" Paytm checkLastTenTransaction......");

    }

    @Override
    public void changeProfilePhoto() {

        System.out.println(" Paytm changeProfilePhoto......");


    }

    // Main method to run program

    public static void main(String[] args) {

        // Step1: Created an object of class (Paytm)-----------classname object_name = new classname();

        Paytm paytm = new Paytm();

        // Step2: To call method -----object_name.method_name();
        paytm.checkBalance();
        paytm.transferMoney();
        paytm.checkLastTenTransaction();
        paytm.changeProfilePhoto();



    }



}
