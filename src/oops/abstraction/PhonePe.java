package oops.abstraction;

public class PhonePe implements Payment {

    // Interface will implement
    // Child class-----PhonePe
    // Parent class----Payment

    // Now we will implement (@Override) the abstract methods of interface---Payment


    @Override
    public void checkBalance() {

        System.out.println(" PhonePe check balance ......");


    }

    @Override
    public void transferMoney() {

        System.out.println(" PhonePe transfer money......");

    }

    @Override
    public void checkLastTenTransaction() {

        System.out.println(" PhonePe checkLastTenTransaction......");

    }

    @Override
    public void changeProfilePhoto() {

        System.out.println(" PhonePe changeProfilePhoto......");

    }


    // Main method to run program
    public static void main(String[] args) {

        // Step1: Created an object of class (PhonePe)-----------classname object_name = new classname();

        PhonePe phonePe = new PhonePe();

        // Step2: To call method -----object_name.method_name();

        phonePe.checkBalance();
        phonePe.transferMoney();
        phonePe.checkLastTenTransaction();
        phonePe.changeProfilePhoto();




    }




}
