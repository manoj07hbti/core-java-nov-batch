package methods;

public class Student {

    // Data member

    String name;
    int rollNo;
    String section;

    // method

    //study
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void studyMethod(){

      System.out.println("This is Study Method");
    }

    public void playMethod(){

        System.out.println("This is Play Method");
    }

    public void runMethod(){

        System.out.println("This is Run Method ..");

    }

    public static void main(String[] args) {

        //STEP 1 create object
        Student obj= new Student();
        // STEP 2  objName.methodName();

        obj.studyMethod();// call study method
        obj.playMethod();// call play method
        obj.runMethod(); // call run method

    }

}
