package model_class;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeArraylist {

    public ArrayList <Employee> createEmployeeArraylist(){

        // SYNTAX :  ArrayList <Datatype> objName= new ArrayList();

        ArrayList <Employee> employees = new ArrayList<>();

        // create employee data

        Employee employee1 = new Employee("Sonu kumar", 35, 35000.35);
        Employee employee2 = new Employee("Ravi kumar", 45, 45000.45);
        Employee employee3 = new Employee("Rahul kumar", 40, 40000.40);
        Employee employee4 = new Employee("Mohit kumar", 30, 30000.30);
        Employee employee5 = new Employee("Raaj kumar", 25, 25000.25);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter employee name : ");
        String name = scanner.nextLine();

        System.out.println("Please enter employee age : ");
        int age = scanner.nextInt();

        System.out.println("Please enter employee name : ");
        double salary = scanner.nextDouble();


        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        return employees;
    }


    public static void main(String[] args) {

        EmployeeArraylist obj= new EmployeeArraylist();

        ArrayList <Employee> employeeList = obj.createEmployeeArraylist();

        for (int i=0; i<employeeList.size(); i++){
            System.out.println("Printing all employee name : " + employeeList.get(i).getName());

            System.out.println("Printing all employee age : " + employeeList.get(i).getAge());

            System.out.println("Printing all employee salary : " + employeeList.get(i).getSalary());

            System.out.println("Name : " + employeeList.get(i).getName() + " Age : " + employeeList.get(i).getAge() + " Salary : " + employeeList.get(i).getSalary());
        }

    }
}
