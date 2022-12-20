package oops.abstraction;

public abstract class Hospital {

    // Syntax for Method : access_specifier return_type  function or method_name(parameter){code}
    // Parameter-----an input parameter that is optional

    // Hospital Management System:
    // Hospital information-----common -------normal or standard method
    // Process------ different----abstract method
    // Surgery------different----abstract method
    // Study----different ----abstract method

     public void hospitalInformation(){

          System.out.println(" Hospital information is as follows.... ");

     }


       public abstract void process(); //abstract method

       public abstract void surgery(); // abstract as it will be different for every type of hospital

       public abstract void study();


    public static void main(String[] args) {

        /*  We can not create an object of an abstract class because the abstract method does not contain a body or code

         // Step : create an object of class------classname object_name = new classname();
                   Hospital obj = new Hospital();
                   obj.process(); // abstract method does not contain a body or code

                     */



    }





}
