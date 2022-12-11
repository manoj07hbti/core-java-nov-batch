package method;

import java.util.Scanner;

public class Calculator_While_Loops {

    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public int div(int a, int b) {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {

        //  Create object name;
        Scanner calculator = new Scanner(System.in);


        String flag = "Y";

        while (flag.equals("Y")) {
            System.out.println("-------------Welcome to Calculator App-------------");

            System.out.println("Please Enter Value of a : ");
            int a =calculator.nextInt();  //Storing the value of a

            System.out.println("Please Enter Value of b : ");
            int b = calculator.nextInt();


            System.out.println("Enter Choice"+"\n"+"+ Add"+"\n"+"- Sub"+"\n"+"* Multiply"+"\n"+"/ Div");
            Scanner calculator1  = new Scanner(System.in);
            String choice = calculator1.nextLine();

            Calculator_While_Loops obj= new Calculator_While_Loops();
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
            }else {
                System.out.println("Invalid choice , please correct choice from given option");
            }

            System.out.println("Do you want to continue to use Calculator press: Y for continue OR press any key for exit");

            flag = calculator1.nextLine();


        }
        System.out.println("******* THANKS FOR USING CALCULATOR APP ******");
    }
}


