package oops.abstraction;

public class BHIM implements Payment {

    // Interface will implement
    // Child class-----BHIM
    // Parent class----Payment

    // Now we will implement (@Override) the abstract methods of interface---Payment



    @Override
    public void checkBalance() {

        System.out.println(" BHIM check balance ......");

    }

    @Override
    public void transferMoney() {

        System.out.println(" BHIM transfer money......");

    }

    @Override
    public void checkLastTenTransaction() {

        System.out.println(" BHIM checkLastTenTransaction......");

    }

    @Override
    public void changeProfilePhoto() {

        System.out.println(" BHIM changeProfilePhoto......");


    }

    // Main method to run program

    public static void main(String[] args) {


        // Step1: Created an object of class (BHIM)-----------classname object_name = new classname();
        BHIM bhim = new BHIM();

        // Step2: To call method -----object_name.method_name();

        bhim.checkBalance();
        bhim.transferMoney();
        bhim.checkLastTenTransaction();
        bhim.changeProfilePhoto();



    }

}
