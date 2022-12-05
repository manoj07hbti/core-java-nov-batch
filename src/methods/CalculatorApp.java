package methods;

import java.util.Scanner;

public class CalculatorApp {
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
        Scanner calci = new Scanner(System.in);  //calci is object name can be anything but meaningful
        System.out.println("Please Enter Value of a : ");
        int a = calci.nextInt();  //Storing the value of a

        System.out.println("Please Enter Value of b : ");
        int b = calci.nextInt();


        System.out.println("Enter Choice"+"\n"+"1 For Addition"+"\n"+"2 For Subtraction"+"\n"+"3 For Multiplication"+"\n"+"4 For Divide");
        int choice = calci.nextInt();

        CalculatorApp obj= new CalculatorApp();
        int result = 0;

        if (choice == 1){
            result = obj.add(a,b);
            System.out.println("Addition is "+result);
        } else if (choice == 2) {
            result = obj.sub(a,b);
            System.out.println("Subtraction is "+result);
        } else if (choice == 3) {
            result = obj.multiply(a,b);
            System.out.println("Multiplication is "+result);
        } else if (choice == 4) {
            result = obj.div(a,b);
            System.out.println("divide is "+result);
        }



    }
}
// how to use +-*/ for choice instead of number 1234

/*System.out.println("Enter Choice"+"\n"+"+ Addition"+"\n"+"- Subtraction"+"\n"+"* Multiplication"+"\n"+"/ Divide");
         String choice = calci.nextLine();

        CalculatorApp obj= new CalculatorApp();
        int result = 0;

        if (choice == "+"){
            System.out.println("Addition is "+result);
        } else if (choice == "-") {
            System.out.println("Subtraction is "+result);
        } else if (choice == "*") {
            System.out.println("Multiplication is "+result);
        } else if (choice == "/") {
            System.out.println("divide is "+result);
        }*/