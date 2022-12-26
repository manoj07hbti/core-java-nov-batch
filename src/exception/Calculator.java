package exception;

public class Calculator {

    public int divide (int a, int b){

        System.out.println("Divide method is started : ");

        int result = 0;

        try {
            result =a/b;
        }
        catch (Exception e){
            System.out.println("Exception occurred is here : ");
        }
        finally {
            System.out.println("This is finally block : ");
        }

        System.out.println("Result is calculated : " + result);

        return result;
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();
        System.out.println("object is created : ");
        int result = obj.divide(10,0);

        System.out.println("Divide is here : " +result);


    }
}
