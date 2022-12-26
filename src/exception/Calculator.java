package exception;

public class Calculator {
      // Syntax  : access_specifier  return_type  function or method_name (parameter) {code}
    public int divide (int a, int b) {
        System.out.println("Divide method started");
                                                                // try and catch method
        int result  = 0;
        try{

            result =  a/b;                           // try block can have more then one catch block

        }
        catch(Exception e){
            System.out.println("Exception Occurred : "+e);
        }
        finally {
            System.out.println("this is finally block which will execute always weather exception occur or not ");
        }

        System.out.println("Result is Calculated : "+result);
        return result;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println("Object is Created");
        int result = obj.divide(5,0);
        System.out.println("Divide is : "+result);

        String arr[] = {"Java", "Java8", "Spring boot"};


        try {
            System.out.println(arr[3]);
        }
        catch(Exception e) {
            System.out.println("Exception Occurred "+e);
        }

        System.out.println("Array Printed");
    }
}
