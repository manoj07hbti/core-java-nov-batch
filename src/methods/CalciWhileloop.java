package methods;

import java.util.Scanner;

public class CalciWhileloop {
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
        Scanner calci = new Scanner(System.in);  //calci is object name can be anything but meaningful


        String flag = "Y";

        while (flag.equals("Y")) {
            System.out.println("-------------Welcome to Calculator App-------------");

            System.out.println("Please Enter Value of a : ");
            int a = calci.nextInt();  //Storing the value of a

            System.out.println("Please Enter Value of b : ");
            int b = calci.nextInt();


            System.out.println("Enter Choice"+"\n"+"+ Addition"+"\n"+"- Subtraction"+"\n"+"* Multiplication"+"\n"+"/ Divide");
            Scanner calci1 = new Scanner(System.in);
            String choice = calci1.nextLine();

            CalciWhileloop obj= new CalciWhileloop();
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

            flag = calci1.nextLine();


        }
        System.out.println("**************** THANKS FOR USING CALCULATOR APP ********************");
    }
}
