package methods;

public class Doctor {

    // DATA MEMBER

    String treatment;
    String operation;
    double fees;

    // methods

    public void readMethod() {

        System.out.println("This is read Method");
    }

    public void writeMethod() {

        System.out.println("This is write Method");
    }

    public void feesMethod() {

        System.out.println("This is Fees Method");
    }

    public void operationMethod() {

        System.out.println("This is Operation Method");
    }

    public void treatmentMethod() {

        System.out.println("This is Treatment Method");
    }

    // SYNTAX

    public static void main(String[] args) {

    Doctor obj = new Doctor();

    obj.readMethod();
    obj.writeMethod();
    obj.feesMethod();
    obj.operationMethod();
    obj.treatmentMethod();

    }
}
