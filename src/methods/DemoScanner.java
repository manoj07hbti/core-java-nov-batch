package methods;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {

        //create object of Scanner

        Scanner scanner = new Scanner(System.in);

        // Reading String data

        System.out.println("Please enter your name : ");
        String name= scanner.nextLine(); // reads String input data

        System.out.println("You have entered name as : "+name);

        // reading int data

        System.out.println("Please enter your age : ");
       int age= scanner.nextInt(); // reads int input data

        System.out.println("You have entered age as : "+age);

        // Reading decimal value
        System.out.println("Please enter your salary: ");
          double salary= scanner.nextDouble();// reads decimal value

        System.out.println("You have entered salary as : "+salary);

    }
}
