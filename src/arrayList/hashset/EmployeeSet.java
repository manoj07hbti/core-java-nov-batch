package arrayList.hashset;

import arrayList.model.Employee;

import java.util.HashSet;

public class EmployeeSet {

    public HashSet<Employee> createEmployeeSet() {

        // SYNTAX : HashSet <Datatype> objName = new HashSet<>();
        HashSet <Employee> employeeHashSet = new HashSet<>();

        Employee employee0 = new Employee("Vineet", 1, 451.64);
        System.out.println("Printing Hashcode of Employee0 : "+employee0.hashCode());

        Employee employee1 = new Employee("Raj", 2,4831.265);
        System.out.println("Printing Hashcode of Employee1 : "+employee1.hashCode());

        Employee employee2 = new Employee("Ramesh", 3, 794513.66);
        System.out.println("Printing Hashcode of Employee2 : "+employee2.hashCode());

        Employee employee3 = new Employee("San", 4, 4789423.16);
        System.out.println("Printing Hashcode of Employee3 : "+employee3.hashCode());

        Employee employee4 = new Employee("Sara", 5, 84512.45);
        System.out.println("Printing Hashcode of Employee4 : "+employee4.hashCode());

        Employee employee5 = new Employee("Sara", 5, 84512.45);
        System.out.println("Printing Hashcode of Employee5 : "+employee5.hashCode());

        Employee employee6 = new Employee("Sara", 5, 84512.45);
        System.out.println("Printing Hashcode of Employee6 : "+employee6.hashCode());

        Employee employee7 = new Employee("Sara", 5, 84512.45);
        System.out.println("Printing Hashcode of Employee7 : "+employee7.hashCode());

        employeeHashSet.add(employee0);
        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
        employeeHashSet.add(employee4);
        employeeHashSet.add(employee5);
        employeeHashSet.add(employee6);
        employeeHashSet.add(employee7);

        return employeeHashSet;
    }

    public static void main(String[] args) {

        EmployeeSet obj = new EmployeeSet();
        HashSet <Employee> employeeHashSet = obj.createEmployeeSet();

        for(Employee var : employeeHashSet) {
            System.out.println("Printing Student Name : "+var.getName()+", Roll no : "+var.getId()+", Section : "+var.getSalary());
        }
    }
}
