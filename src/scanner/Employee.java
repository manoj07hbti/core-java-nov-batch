package scanner;

import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {

        // CREATE EMPLOYEE DATA
        Scanner scanner = new Scanner(System.in);


        // Reading String Data
        System.out.println("Enter name : ");
        String name = scanner.nextLine();
        System.out.println("Employee name is : "+name);


        // Reading Integer Data
        System.out.println("Enter Id :");
        int Id = scanner.nextInt();
        System.out.println("Employee Id :"+Id);


        // Reading Double data
        System.out.println("Enter Salary : ");
        double Salary = scanner.nextDouble();
        System.out.println("Employee Salary : "+Salary);
    }
}
