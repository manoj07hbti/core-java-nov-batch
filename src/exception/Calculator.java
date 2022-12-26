package exception;

public class Calculator {

    public int divide(int a, int b) {
        System.out.println("Divide method started");

        int result = 0;

        try {
            result = a / b;
        } catch (Exception e) {
            System.out.println("Exception Occurred : " + e);
        }
        finally{
            System.out.println("This is finally block");
        }

        System.out.println("Result is Calculated : " + result);
        return result;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println("Object is Created");
        int result = obj.divide(5, 0);
        System.out.println("Divide is : " + result);
    }
}
