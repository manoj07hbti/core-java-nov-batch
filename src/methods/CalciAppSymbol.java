package methods;

import java.util.Scanner;

public class CalciAppSymbol {
    public int add (int a, int b){
        int result = a+b;
        return result;
    }

    public int sub (int a, int b){
        int result = a-b;
        return result;
    }

    public int multiply (int a, int b){
        int result = a*b;
        return result;
    }

    public int div (int a, int b){
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        // how to use +-*/ for choice instead of number 1234
        Scanner calci = new Scanner(System.in);  //calci is object name can be anything but meaningful
        System.out.println("Please Enter Value of a : ");
        int a = calci.nextInt();  //Storing the value of a

        System.out.println("Please Enter Value of b : ");
        int b = calci.nextInt();

        System.out.println("Enter Choice"+"\n"+"+ Addition"+"\n"+"- Subtraction"+"\n"+"* Multiplication"+"\n"+"/ Divide");
        Scanner calci1 = new Scanner(System.in);
        String choice = calci1.nextLine();

        CalculatorApp obj= new CalculatorApp();
        int result = 0;

        if (choice.equals("+") ){
            result = obj.add(a,b);
            System.out.println("Addition is "+result);

        } else if (choice.equals("-")) {
            result = obj.sub(a,b);
            System.out.println("Subtraction is "+result);

        } else if (choice.equals("*")) {
            result = obj.multiply(a,b);
            System.out.println("Multiplication is "+result);

        } else if (choice.equals("/")) {
            result = obj.div(a,b);
            System.out.println("divide is "+result);
        }
    }
}
