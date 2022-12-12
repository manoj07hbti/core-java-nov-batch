package CollectionFramwork.Arraylist;

import CollectionFramwork.Arraylist.Model.Employee;

import java.util.ArrayList;

public class EmployeeArrayList {

    public ArrayList<Employee> createEmployeeList() {

        // SYNTAX :  ArrayList <Datatype> objName= new ArrayList();
        ArrayList<Employee> Employeee = new ArrayList<>();
// create Employee data
        Employee employee1 = new Employee("Raghav", 66000, "Microsoft");

        Employee employee2 = new Employee("Herry", 200000, "Google");

        Employee employee3 = new Employee("Harshit", 210000, "Apple");

        Employeee.add(employee1);
        Employeee.add(employee2);
        Employeee.add(employee3);
        return Employeee;
    }


    public static void main(String[] args) {

        EmployeeArrayList obj = new EmployeeArrayList();

        ArrayList<Employee> EmployeeeList = obj.createEmployeeList();

            for (int i = 0; i < EmployeeeList.size(); i++) {

            System.out.println("Employee name " + EmployeeeList.get(i).getName());
            System.out.println("Employee salary " + EmployeeeList.get(i).getSalary());
            System.out.println("Employee Company " + EmployeeeList.get(i).getCompany());


        }
    }
}
