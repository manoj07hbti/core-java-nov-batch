package exception;

public class Calculator2 {

    public int divide (int a, int b) {
        System.out.println("Divide method Started");

        int result = 0;
        try {
             result = a / b;
        }
        catch(Exception e) {
            System.out.println("Exception is Occurred "+e);
        }
        System.out.println("Result is calculated : "+result);
        return result;
    }

    public static void main(String[] args) {
        Calculator2 obj = new Calculator2();

        System.out.println("Object is Created");
        int result = obj.divide(9,0);
        System.out.println("Divide is : "+result);

    }
}
