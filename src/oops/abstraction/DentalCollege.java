package oops.abstraction;

public class DentalCollege extends Hospital {

    // Child class or Subclass can implement methods of abstract class
    // Child class or Sub class-------DentalCollege
    // Parent class or Super class----Hospital
    // Single inheritance : Parent-----inheritance-------Child
    // extends keyword:  The extends keyword indicates that we are making a new class that derives from an existing class.


    @Override
    public void process() {

        System.out.println(" The process of Dental related cases are : ");

    }

    @Override
    public void surgery() {

        System.out.println(" The surgery of Dental related cases are : ");

    }

    @Override
    public void study() {

        System.out.println(" The study of Dental related cases are : ");

    }



    // main method to run program
    public static void main(String[] args) {

        // Step1 : Created an object of class-----classname object_name = new classname();

       DentalCollege dentalCollege = new DentalCollege();

        // Step2: To call method : object_name.method_name();

        dentalCollege.hospitalInformation();
        dentalCollege.process();
        dentalCollege.surgery();
        dentalCollege.study();

    }



}
