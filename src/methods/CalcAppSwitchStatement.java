package methods;

import java.util.Scanner;

public class CalcAppSwitchStatement {
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

        String flag = "Y";

        while (flag.equals("Y")) {

        System.out.println("Please Enter Value of a : ");
        int a = calci.nextInt();  //Storing the value of a

        System.out.println("Please Enter Value of b : ");
        int b = calci.nextInt();


        System.out.println("Enter Choice"+"\n"+"1 For Addition"+"\n"+"2 For Subtraction"+"\n"+"3 For Multiplication"+"\n"+"4 For Divide");
            Scanner calci1 = new Scanner(System.in);
        int choice = calci1.nextInt();

        CalcAppSwitchStatement obj= new CalcAppSwitchStatement();
        int result = 0;

        // using switch statement
        switch (choice){
            case 1 : result = obj.add(a,b);
                System.out.println("Addition is "+result);
                break;
            case 2 : result = obj.sub(a,b);
                System.out.println("Subtraction is "+result);
                break;
            case 3 : result = obj.multiply(a,b);
                System.out.println("Multiplication is "+result);
                break;
            case 4 : result = obj.div(a,b);
                System.out.println("divide is "+result);
                break;
            default:
                System.out.println("You entered invalid Value or Choice");
        }
            Scanner calci2 = new Scanner(System.in);
            System.out.println("Do you want to continue to use Calculator press: Y for continue OR press any key for exit");

            flag = calci2.nextLine();
    }
}}
