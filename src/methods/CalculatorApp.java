package methods;

import java.util.Scanner;

public class CalculatorApp {

    public int addition(int a, int b){

        int result=a+b;

        return result;
    }

    public int suntraction(int a, int b){

        int result=a-b;

        return result;
    }

    // sub, multi and div

    public static void main(String[] args) {

        // create Scanner object

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter value of a: ");
        int a= scanner.nextInt();

        System.out.println("Please enter value of b: ");
        int b=scanner.nextInt();

        System.out.println("Please enter CHOICE: 1 for Addition, 2 for Subtraction, 3 for Multiplication and 4 for Divide");
        int choice= scanner.nextInt();// reads integer inpout

        CalculatorApp obj= new CalculatorApp();
        int result=0;

        if(choice==1){
            result= obj.addition(a,b);
            System.out.println("SUM is: "+result);

        }
        else if(choice==2){

            result= obj.suntraction(a,b);
            System.out.println("SUB is : "+result);
        }



    }
}
