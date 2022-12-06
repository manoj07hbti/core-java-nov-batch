package methods;


import java.util.Scanner;

public class CalculatorApp {

    public int addition(int a, int b) {

        int result = a + b;

        return result;
    }

    public int subtraction(int a, int b) {

        int result = a - b;

        return result;
    }

    public int multi(int a, int b) {

        int result = a * b;

        return result;
    }

    public double divide(int a, int b) {

        double result = (double) a / b;

        return result;
    }

    public static void main(String[] args) {

        // create Scanner object

        Scanner scanner = new Scanner(System.in);

        String flag = "Y";

        while (flag.equals("Y")) {

            System.out.println("**************** WELCOME TO CALCULATOR APP ********************");
            System.out.println("Please enter value of a: ");
            int a = scanner.nextInt();

            System.out.println("Please enter value of b: ");
            int b = scanner.nextInt();

            System.out.println("Please enter CHOICE: + for Addition, - for Subtraction, * for Multiplication and / for Divide");
            Scanner scanner1 = new Scanner(System.in);
            String choice = scanner1.nextLine();// reads String input

            CalculatorApp obj = new CalculatorApp();
            int result = 0;

            if (choice.equals("+")) {
                result = obj.addition(a, b);
                System.out.println("SUM is: " + result);

            } else if (choice.equals("-")) {

                result = obj.subtraction(a, b);
                System.out.println("SUB is : " + result);
            } else if (choice.equals("*")) {

                result = obj.multi(a, b);
                System.out.println("Multi is : " + result);
            } else if (choice.equals("/")) {

                double output = obj.divide(a, b);
                System.out.println("Division  is : " + output);
            } else {
                System.out.println("Invalid choice , please correct choice from given option");
            }

            System.out.println("Do you want to continue to use Calculator press: Y for continue OR press any key for exit");

            flag = scanner1.nextLine();
        }

        System.out.println("**************** THANKS FOR USING CALCULATOR APP ********************");


    }
}
