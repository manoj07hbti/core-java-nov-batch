package CollectionFramwork.Hashset;

import CollectionFramwork.Model.Employee;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class EmployeeHashSet {
    public HashSet<Employee> createEmployeeHashSet() {

        // we are using linked hashset
        //  when we want to print our data  in sequence  that time we use linked hashset

        LinkedHashSet<Employee> EmployeeHashSet = new LinkedHashSet<>();

       // creating data by parameter constructor

        Employee emp1 = new Employee("Shrasti", 6600000, "Google");
        System.out.println("HashCode of Employee 1 : " + emp1.hashCode());

        Employee emp2 = new Employee("Tanu", 780000, "Microsoft ");
        System.out.println("HashCode of Employee 2 : " + emp2.hashCode());

        Employee emp3 = new Employee("Sonam", 2254444, "Ibm");
        System.out.println("HashCode of Employee 3 : " + emp3.hashCode());

        Employee emp4 = new Employee("Sona", 2254444, "Ibm");
        System.out.println("HashCode of Employee 4 : " + emp4.hashCode());

        Employee emp5 = new Employee("Sonali", 2254454, "Sony");
        System.out.println("HashCode of Employee 5 : " + emp5.hashCode());

        // Knowingly we are printing data for checking

        Employee emp6 = new Employee("Shrasti", 6600000, "Google");
        System.out.println("HashCode of Employee 6 : " + emp6.hashCode());

        Employee emp7 = new Employee("Tanu", 780000, "Microsoft ");
        System.out.println("HashCode of Employee 7 : " + emp7.hashCode());

        Employee emp8 = new Employee("Sonam", 2254444, "Ibm");
        System.out.println("HashCode of Employee 8: " + emp8.hashCode());


        EmployeeHashSet.add(emp1);
        EmployeeHashSet.add(emp2);
        EmployeeHashSet.add(emp3);
        EmployeeHashSet.add(emp4);
        EmployeeHashSet.add(emp5);
        EmployeeHashSet.add(emp6);
        EmployeeHashSet.add(emp7);
        EmployeeHashSet.add(emp8);

        return EmployeeHashSet;
    }

// use hashcode & equals in your model class
 //  when we use hashcode and equals.......we avoid to repetition of data or duplicate data

    public static void main(String[] args) {

        EmployeeHashSet obj = new EmployeeHashSet();
        HashSet<Employee> EmployeeHashSet = obj.createEmployeeHashSet();

        // By using Advance for loop

        for (Employee var : EmployeeHashSet) {
            System.out.println("all data of employee  Hashset  name: " + var.getName() + " Salary  : " + var.getSalary() + " company  : " + var.getCompany());



        }

    }
}