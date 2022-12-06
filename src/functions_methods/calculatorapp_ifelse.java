package functions_methods;

import java.util.Scanner;

public class calculatorapp_ifelse {

    //add,sub,multi,divide

    public int add (int a,int b){
        int result = a+b;
        return result;
    }
    public int sub (int a, int b){
        int result = a-b;
        return result;
    }
    public int multi(int a , int b){
        int result = a*b;
        return result;
    }
    public double divide (int a , int b){
        double result = (double) a/b;
        return result;
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        String flag = "y";

        while (flag.equals("y")){

            System.out.println("**** Welcome to the Calculator Application*****");

        System.out.println( "enter the Value of a");
        int a = sc.nextInt();

        System.out.println("enter the vale of b");
        int b = sc.nextInt();

        System.out.println("Please enter CHOICE: + for Addition, - for Subtraction, * for Multiplication and / for Divide");
        Scanner sc1 = new Scanner(System.in);
        String choice = sc1.nextLine();  // reads String input

        calculatorapp_ifelse obj = new calculatorapp_ifelse();


        if (choice.equals("+")){
            System.out.println("sum is  " + obj.add(a,b));

        } else if (choice.equals("-")) {
            System.out.println("sub is " + obj.sub(a,b));

        } else if (choice.equals("*")) {
            System.out.println("product is " + obj.multi(a,b));

        } else if (choice.equals("/")) {
            System.out.println("divide is  "+ obj.divide(a,b));

        }else {
            System.out.println("INVALLID OPTION");
        }
            System.out.println("Do you want to continue use Calculator press: y for continue OR press any key for exit");

            flag = sc1.nextLine();
        }
        System.out.println("*******Thanks for using application*****");
    }
}
