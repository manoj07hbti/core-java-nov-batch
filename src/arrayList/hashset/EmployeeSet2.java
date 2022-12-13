package arrayList.hashset;

import arrayList.model.Employee;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class EmployeeSet2 {

    public HashSet<Employee> createEmployeeSet2(){

        LinkedHashSet <Employee> employeeHashSet = new LinkedHashSet<>();

        Employee employee1 = new Employee("Vineet", 2, 45182.84);
        System.out.println("Hashcode of Employee1 : "+employee1.hashCode());

        Employee employee2 = new Employee("Anni", 5, 457412.85);
        System.out.println("Hashcode of Employee2 : "+employee2.hashCode());

        Employee employee3 = new Employee("Vinod", 4, 102182.51);
        System.out.println("Hashcode of Employee3 : "+employee3.hashCode());

        Employee employee4 = new Employee("Vikas", 3, 95482.74);
        System.out.println("Hashcode of Employee4 : "+employee4.hashCode());

        Employee employee5 = new Employee("Ravi", 1, 87182.10);
        System.out.println("Hashcode of Employee5 : "+employee5.hashCode());

        Employee employee6 = new Employee("Prem", 9, 25182.23);
        System.out.println("Hashcode of Employee6 : "+employee6.hashCode());

        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
        employeeHashSet.add(employee4);
        employeeHashSet.add(employee5);
        employeeHashSet.add(employee6);

        return employeeHashSet;
    }


    public static void main(String[] args) {

        EmployeeSet2 obj = new EmployeeSet2();
        HashSet <Employee> employeeHashSet = obj.createEmployeeSet2();
        for (Employee var : employeeHashSet) {
            System.out.println("Printing Employee Name : "+var.getName()+", ID : "+var.getID()+", Salary : "+var.getSalary());
        }
    }
}
