package arrayList.hashset;

import arrayList.model.Employee;

import java.util.HashSet;

public class EmployeeSet {

    public HashSet <Employee> createEmployeeSet(){

        HashSet <Employee> employeeHashSet = new HashSet<>();

        Employee employee1 = new Employee("Vineet", 2, 45182.84);
        Employee employee2 = new Employee("Anni", 5, 457412.85);
        Employee employee3 = new Employee("Vinod", 4, 102182.51);
        Employee employee4 = new Employee("Vikas", 3, 95482.74);
        Employee employee5 = new Employee("Ravi", 1, 87182.10);
        Employee employee6 = new Employee("Prem", 9, 25182.23);

        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
        employeeHashSet.add(employee4);
        employeeHashSet.add(employee5);
        employeeHashSet.add(employee6);

        return employeeHashSet;
    }


    public static void main(String[] args) {

        EmployeeSet obj = new EmployeeSet();
        HashSet <Employee> employeeHashSet = obj.createEmployeeSet();
        for (Employee var : employeeHashSet) {
            System.out.println("Printing Employee Name : "+var.getName()+", ID : "+var.getID()+", Salary : "+var.getSalary());
        }
    }
}
