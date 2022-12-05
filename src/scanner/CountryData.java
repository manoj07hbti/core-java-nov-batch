package scanner;

import java.util.Scanner;

public class CountryData {

    public static void main(String[] args) {

        // create Country object
        Scanner scanner = new Scanner(System.in);

        // reading string data
        System.out.println("Enter your Country name: ");
        String Country  = scanner.nextLine(); // reads string input data

        System.out.println("Your name is :"+Country);


        // new  int scanner
        System.out.println("Enter your State: ");
        int State = scanner.nextInt(); // reads string input data

        System.out.println("Your age is :"+State);


        // decimal value
        System.out.println("Enter your State Population: ");
        double Population = scanner.nextDouble(); // reads string input data

        System.out.println("Your State Population  is :"+Population);

    }
}
