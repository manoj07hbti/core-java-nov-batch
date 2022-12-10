package collection_framework.arraylist;

import collection_framework.model.Employee;

import java.util.ArrayList;

public class EmployeeArrayList {

    public ArrayList <Employee> employeeList (){
        // SYNTAX :  ArrayList <Datatype> objName= new ArrayList();
        ArrayList <Employee> employees = new ArrayList<>();

        // Create Employee Data

        Employee emp1 = new Employee("Ajeet","IT",5);
        Employee emp2 = new Employee("Swati", "Accounts",12);
        Employee emp3 = new Employee("Ankur", "HR",1);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        return employees;
    }

    public static void main(String[] args) {
        EmployeeArrayList obj = new EmployeeArrayList();
        ArrayList <Employee> employeelist = obj.employeeList();

        for (int i=0; i<employeelist.size();i++){
            System.out.println("Employee Name : "+employeelist.get(i).getName());
            System.out.println("Employee Department : "+employeelist.get(i).getDepartment());
            System.out.println("Employee Desk No. : "+employeelist.get(i).getDesk());
            System.out.println("Employee All Details Name : "+employeelist.get(i).getName()+", Department : "+employeelist.get(i).getDepartment()
            +", Desk No. : "+employeelist.get(i).getDesk());
        }

    }
}
