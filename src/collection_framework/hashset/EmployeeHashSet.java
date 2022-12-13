package collection_framework.hashset;

import collection_framework.model.Employee;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class EmployeeHashSet {

    public HashSet<Employee> employeeMethod(){
        // SYNTAX: ClassName <DATATYPE>  objName = new ClassName();
        // HashSet <DATATYPE> objName= new ClassName();
        LinkedHashSet<Employee> employeeData = new LinkedHashSet();

        // Create Employee Data parameterized constructor

        Employee employee1 = new Employee("Ajeet","IT",5);
        System.out.println("HashCode of Employee 1 : "+employee1.hashCode());

        Employee employee2 = new Employee("Swati", "Accounts",12);
        System.out.println("HashCode of Employee 2 : "+employee2.hashCode());

        Employee employee3 = new Employee("Ankur", "HR",1);
        System.out.println("HashCode of Employee 3 : "+employee3.hashCode());

        Employee employee4 = new Employee("Patanjali", "developer",15);
        System.out.println("HashCode of Employee 4 : "+employee4.hashCode());

        Employee employee5 = new Employee("Philip", "designer",11);
        System.out.println("HashCode of Employee 5 : "+employee5.hashCode());

        Employee employee6 = new Employee("Ankur", "HR",1);             // copy of 3
        System.out.println("HashCode of Employee 6 : "+employee6.hashCode());

        Employee employee7 = new Employee("Patanjali", "Manager",15);   // copy of 4 department change
        System.out.println("HashCode of Employee 7 : "+employee7.hashCode());

        Employee employee8 = new Employee("Philip", "developer",13);    // copy of 5 dep & desk change
        System.out.println("HashCode of Employee 8 : "+employee8.hashCode());

        Employee employee9 = new Employee("Swati", "Accounts",10);      // copy of 1 desk change
        System.out.println("HashCode of Employee 9 : "+employee9.hashCode());


        employeeData.add(employee1);
        employeeData.add(employee2);
        employeeData.add(employee3);
        employeeData.add(employee4);
        employeeData.add(employee5);
        employeeData.add(employee6);
        employeeData.add(employee7);
        employeeData.add(employee8);
        employeeData.add(employee9);


        return employeeData;
    }

    public static void main(String[] args) {
        EmployeeHashSet obj = new EmployeeHashSet();
        HashSet<Employee> employeedataobj = obj.employeeMethod();
        int i=1;
        for (Employee var : employeedataobj){
            System.out.println("Details of Employee "+i+" : Name : "+var.getName()+", Department : "+var.getDepartment()
            +", Desk No. : "+var.getDesk());
            i++;
        }

    }
}
