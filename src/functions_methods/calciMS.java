package functions_methods;

import java.util.Scanner;

public class calciMS {

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
        System.out.println( "enter the Value of a");
        int a = sc.nextInt();

        System.out.println("enter the vale of b");
        int b = sc.nextInt();

        System.out.println("Please enter CHOICE: 1 for Addition, 2 for Subtraction, 3 for Multiplication and 4 for Divide");
        int choice= sc.nextInt();// reads integer input

        calciMS obj = new calciMS();

        switch (choice){

            case 1:
            System.out.println("Sum is " + obj.add(a,b));
                break;
            case 2:
                System.out.println("Subtraction is " + obj.sub(a,b));
                break;
            case 3:
                System.out.println("Product is " + obj.multi(a,b));
                break;
            case 4:
                System.out.println("Divide is " + obj.divide(a,b));
        }




    }


}