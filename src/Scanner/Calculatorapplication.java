package Scanner;

import java.util. Scanner;
public class Calculatorapplication {


    public int addition(int a, int b) {
        int result = a + b;
        return result;

    }

    public int subtraction(int a, int b) {
        int result = a - b;
        return result;
    }

    public int multiple(int a, int b) {
        int result = a * b;
        return result;
    }

    public int Division(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String flag = "Y";
        while (flag.equals("Y")) {
            System.out.println("***** WELCOME TO CALCULATOR APP *****");

            System.out.println("Please enter value of :  a");
            int a = sc.nextInt();
            System.out.println("Please enter value of :  b");
            int b = sc.nextInt();
            System.out.println("Enter choice: Press (+) for Addition, Press (-) for Subtraction ,Press (*) ///for Multiple, Press (/) for Division  ");
            Scanner Sc = new Scanner(System.in);
            String choice = Sc.nextLine();
            Calculatorapplication obj = new Calculatorapplication();
            int result = 0;
            if (choice.equals("+")) {
                result = obj.addition(a, b);
                System.out.println("Addition is " + result);


            } else if (choice.equals("-")) {
                result = obj.subtraction(a, b);
                System.out.println("Subtraction is " + result);

            } else if (choice.equals("*")) {
                result = obj.multiple(a, b);
                System.out.println("Multiplication is " + result);

            } else if (choice.equals("/")) {
                result = obj.Division(a, b);
                System.out.println("divide is " + result);
            } else {
                System.out.println("Invalid choice , please correct choice from given option");
            }

            System.out.println(" If you want to continue to use Calculator press: Y for continue OR press any other key for exit");


            flag = Sc.nextLine();


        }
        System.out.println("***** THANKS FOR USING CALCULATOR APP *****");

    }
}








