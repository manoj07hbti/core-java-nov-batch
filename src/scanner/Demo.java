package scanner;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        // create  Scanner object
        Scanner scanner = new Scanner(System.in);

        // reading string data
        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); // reads string input data

        System.out.println("Your name is :"+name);


        // new scanner
        System.out.println("Enter your age: ");
        int age = scanner.nextInt(); // reads string input data

        System.out.println("Your age is :"+age);


        // decimal value
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble(); // reads string input data

        System.out.println("Your salary is :"+salary);

    }

}
