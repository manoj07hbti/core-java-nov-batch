package method;

import java.util.Scanner;
public class Cal_App_Switch_Statement {

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

        // Create object name;
        Scanner calculator = new Scanner(System.in);

        String flag = "Y";

        while (flag.equals("Y")) {

            System.out.println("Please Enter Value of a : ");
            int a = calculator.nextInt();

            System.out.println("Please Enter Value of b : ");
            int b =calculator.nextInt();


            System.out.println("Enter Choice"+"\n"+"1. For Add"+"\n"+"2. For Sub"+"\n"+"3. For Multiply"+"\n"+"4. For Div");
            Scanner calci1 = new Scanner(System.in);
            int choice = calci1.nextInt();

            Cal_App_Switch_Statement obj= new Cal_App_Switch_Statement();
            int result = 0;

            // Switch statements
            switch (choice){
                case 1 : result = obj.add(a,b);
                    System.out.println("These numbers are adding up "+result);
                    break;
                case 2 : result = obj.sub(a,b);
                    System.out.println("These numbers are subtracting up "+result);
                    break;
                case 3 : result = obj.multiply(a,b);
                    System.out.println("These numbers are multiplying up "+result);
                    break;
                case 4 : result = obj.div(a,b);
                    System.out.println("These numbers are dividing up "+result);
                    break;
                default:
                    System.out.println("You entered invalid Value or Choice");
            }
            Scanner calci2 = new Scanner(System.in);
            System.out.println("Do you want to continue to use Calculator press: Y for continue or press any key for exit");

            flag = calci2.nextLine();
        }
    }
}


