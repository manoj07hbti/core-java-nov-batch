package method;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {

        // Create object of Scanner

        Scanner scanner = new Scanner(System.in);

        // Reading data with String
        System.out.println("Please enter your country name......" );
        String name= scanner.nextLine();
        System.out.println("You have entered your country name " + name);

        // Reading data with int
        System.out.println("Please enter your state number...." );
        int state= scanner.nextInt();
        System.out.println("You have entered your state " + state);

        // Reading data with long
        System.out.println("Please enter your total population......");
        long population=scanner.nextLong();
        System.out.println("You have entered your country population..." +population);





    }

}
