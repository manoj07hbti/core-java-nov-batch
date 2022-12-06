package scanner;

import java.util.Scanner;

public class Calculator {

    // ADDITION
    public int addition(int a , int b){
        return a+b;
    }

    // Subtract
    public int subtract(int a , int b){
        return a-b;
    }

    // Multiply
    public int Multi(int a , int b){
        return a*b;
    }

    // Divide
    public double div(int a , int b){
        return (double) a/b;
    }


    public static void main(String[] args) {

        // create scanner object
        Scanner scanner = new Scanner(System.in);

        String flag = "Y";

        while (flag.equals("Y")) {

            System.out.println("********** WELCOME TO CALCULATOR APP **********");

            System.out.println("Value of a :");
            int a = scanner.nextInt();

            System.out.println("Value of b :");
            int b = scanner.nextInt();

            System.out.println("Enter Choice : + for Addition , - for Subtract,  * for Multiplication , / forDivide");
            Scanner scanner1 = new Scanner(System.in);
            String choice = scanner1.nextLine(); //  reads choices

            Calculator obj = new Calculator();
            int result;

            switch (choice) {
                case "+":
                    result = obj.addition(a, b);
                    System.out.println("Sum is " + result);
                    break;
                case "-":
                    result = obj.subtract(a, b);
                    System.out.println("Sub is " + result);
                    break;
                case "*":
                    result = obj.Multi(a, b);
                    System.out.println("Multi is " + result);
                    break;
                case "/":
                    double output = obj.div(a, b);
                    System.out.println("Div is " + output);
                    break;
                default:
                    System.out.println("Invalid choice plEASE choose correct number ");
                    break;
            }


            System.out.println("DO you want t continue to use Calculator press : Y for continue OR for exit press any key");

            flag = scanner1.nextLine();
        }
        System.out.println("********** THANKS FOR USING CALCULATOR APP **********");
    }

}
