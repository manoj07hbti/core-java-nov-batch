package model_class.Hashset;

import model_class.Employee;

import java.util.HashSet;

public class EmployeeHashSet {

    public HashSet<Employee> createEmployeeHashSet(){

        //   SYNTAX: ClassName objName = new ClassName();
        //   HashSet <DATATYPE> objName = New ClassName();

        HashSet<Employee> employeeHashSet = new HashSet<>();

        // create Employee Data

        Employee employee1 = new Employee("Sonu kumar", 35, 35000.35);
        System.out.println("Hashcode of Employee 1 : " +employee1.hashCode());

        Employee employee2 = new Employee("Ravi kumar", 45, 45000.45);
        System.out.println("Hashcode of Employee 2 : " +employee2.hashCode());

        Employee employee3 = new Employee("Rahul kumar", 40, 40000.40);
        System.out.println("Hashcode of Employee 3 : " +employee3.hashCode());

        Employee employee4 = new Employee("Mohit kumar", 30, 30000.30);
        System.out.println("Hashcode of Employee 4 : " +employee4.hashCode());

        Employee employee5 = new Employee("Raaj kumar", 25, 25000.25);
        System.out.println("Hashcode of Employee 5 : " +employee5.hashCode());

        Employee employee6 = new Employee("Sonu kumar", 35, 35000.35);
        System.out.println("Hashcode of Employee 6 : " +employee6.hashCode());

        Employee employee7 = new Employee("Ravi kumar", 45, 45000.45);
        System.out.println("Hashcode of Employee 7 : " +employee7.hashCode());

        Employee employee8 = new Employee("Rahul kumar", 40, 40000.40);
        System.out.println("Hashcode of Employee 8 : " +employee8.hashCode());


        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
        employeeHashSet.add(employee4);
        employeeHashSet.add(employee5);
        employeeHashSet.add(employee6);
        employeeHashSet.add(employee7);
        employeeHashSet.add(employee8);

        return employeeHashSet;
    }

    public static void main(String[] args) {
        //   SYNTAX: ClassName objName = new ClassName();
        EmployeeHashSet obj = new EmployeeHashSet();
        HashSet<Employee> employeeHashSet = obj.createEmployeeHashSet();

        for (Employee var : employeeHashSet){
            System.out.println("Printing all data :: " +var.getName() + " Age :: "  +var.getAge() + " Salary : "  +var.getSalary());
        }

    }
}
