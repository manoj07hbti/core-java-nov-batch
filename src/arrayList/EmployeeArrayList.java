package arrayList;

import model.Employee;

import java.util.ArrayList;

public class EmployeeArrayList {

    public ArrayList <Employee> createEmployeeList(){


        // SYNTAX : ArrayList <Employee> objName = new ArrayList();

        ArrayList <Employee> employees = new ArrayList<>();

        // create student list
        Employee employee = new Employee("Vineet", 24, 54215.84);
        Employee employee1 = new Employee("Amit", 12, 48421.46);
        Employee employee2 = new Employee("Ram", 23, 784161.44);

        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);

        return employees;
    }

    public static void main(String[] args) {

        EmployeeArrayList obj = new EmployeeArrayList();
        ArrayList <Employee> employeesList = obj.createEmployeeList();

        for (Employee employee : employeesList) {

            System.out.println("Printing Employee name : " + employee.getName());
            System.out.println(" ID : " + employee.getID());
            System.out.println(" Salary : " + employee.getSalary());

            System.out.println("Employee name : " + employee.getName() + ", ID : " + employee.getID()+ ", Salary : " + employee.getSalary());

        }

    }
}
