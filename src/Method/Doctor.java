package Method;

public class Doctor {

    String name;
    double salary;
    String department;



    public void treatmentmethod(){

        System.out.println("this a treatment method");

    }
    public void operationmethod(){

        System.out.println("This is operation method");
    }

    public void feemethod(){

        System.out.println("This is fees method");
    }

    public static void main(String[]args){

        Doctor obj=new Doctor();


        obj.treatmentmethod();
        obj.operationmethod();
        obj.feemethod();
    }


}

