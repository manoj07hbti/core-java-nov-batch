package oops.abstraction;

public class MentalCollege extends Hospital{


    // Child class or Subclass can implement methods of abstract class
    // Child class or Sub class-------MentalCollege
    // Parent class or Super class----Hospital
    // Single inheritance : Parent-----inheritance-------child
    // extends keyword:  The extends keyword indicates that we are making a new class that derives from an existing class.


    @Override
    public void process() {

   System.out.println(" The process of mental related cases are : ");


    }

    @Override
    public void surgery() {

        System.out.println(" The surgery of mental related cases are : ");

    }

    @Override
    public void study() {

        System.out.println(" The study of mental related cases are : ");

    }

    // main method to run program
    public static void main(String[] args) {

        // Step1 : Created an object of class-----classname object_name = new classname();

         MentalCollege mentalCollege = new MentalCollege();

        // Step2: To call method : object_name.method_name();

        mentalCollege.hospitalInformation();
        mentalCollege.process();
        mentalCollege.study();
        mentalCollege.surgery();

    }



}
