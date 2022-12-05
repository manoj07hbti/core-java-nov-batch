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
    public int div(int a , int b){
        return a/b;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ADDITION
        System.out.println("Value of a :");
        int a = scanner.nextInt();

        System.out.println("Value of b :");
        int b = scanner.nextInt();

        System.out.println("Enter Choice : 1- Addition , 2- Subtract, 3 - Multiplication , 4- Divide");
        int choice = scanner.nextInt(); //  reads choices

        Calculator obj = new Calculator();
        int result = 0;

        if(choice == 1) {
            result = obj.addition(a,b);
            System.out.println("Sum is "+result);
        }
        else if(choice ==2){
            result = obj.subtract(a,b);
            System.out.println("Sub is "+result);
        }
        else if(choice == 3) {
            result = obj.Multi(a,b);
            System.out.println("Multi is "+result);
        }
        else if(choice == 4){
            result = obj.div(a,b);
            System.out.println("Div is "+result);
        }
    }

}
