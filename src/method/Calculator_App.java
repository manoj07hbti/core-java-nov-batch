package method;

import java.util.Scanner;

public class Calculator_App {


    public int addition (int a, int b){

        int result = a+b;
        return result;
    }

    public int subtraction (int a, int b){
        int result = a-b;
        return result;

    }

    public int multi (int a, int b){
        int result=a*b;
        return result;

    }

    public double divide (int a, int b){
        double result = a/b;
        return result;

    }

    // Create object Scanner class

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your value of a...");
        int a = scanner.nextInt();

        System.out.println("Please enter your value of b....");
    }








}
