package method;

public class Doctor {


    // Data Member
    String name;
    int id;
    String speciality;


     // method

    //study
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void treatmentMethod(){

        System.out.println("The doctor is treating...");


    }



    public void operationMethod(){

        System.out.println("The doctor is operating....");
    }




    public void feeMethod(){

        System.out.println("The doctor is charging...");


    }


    // Main method to run program

    public static void main(String[] args) {

        //STEP 1 create object
        Doctor doctor = new Doctor();

        // STEP 2  objName.methodName();
        doctor.treatmentMethod();
        doctor.operationMethod();
        doctor.feeMethod();


    }

}
