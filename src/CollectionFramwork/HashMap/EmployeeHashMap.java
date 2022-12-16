package CollectionFramwork.HashMap;

import CollectionFramwork.Model.Employee;

import java.util.HashMap;

public class EmployeeHashMap {
    public HashMap<Integer, Employee> createEmployeeMap() {

        // HashMap <Datatype key, Datatype_Value/data > objName= new HashMap<>();

        HashMap<Integer, Employee> EmployeeHashMap = new HashMap<>();

        // WE ARE PRINTING EMPLOYEE DATA

        Employee employee1 = new Employee("Shivam", 70000, "It");
        Employee employee2 = new Employee("Shivani", 75000, "mnc");
        Employee employee3 = new Employee("Shiva", 66700, "hr");
        Employee employee4 = new Employee("robin", 575700, "cs");
        Employee employee5 = new Employee("Rohi", 57500, "Sony");
        Employee employee6 = new Employee("robin", 5757500, "cs");

        EmployeeHashMap.put(1, employee1);
        EmployeeHashMap.put(2, employee2);
        EmployeeHashMap.put(3, employee3);
        EmployeeHashMap.put(4, employee4);
        EmployeeHashMap.put(null, employee5); // by taking a null value for checking null output
        EmployeeHashMap.put(1, employee6); //  by taking duplicate key for checking data and their output

        System.out.println("Print details about employee " + EmployeeHashMap);

        return EmployeeHashMap;

    }

    public static void main(String[] args) {

        EmployeeHashMap obj = new EmployeeHashMap();
        HashMap<Integer, Employee> EmployeeHashMap = obj.createEmployeeMap();

        for (Integer var : EmployeeHashMap.keySet()) {

            System.out.println("Printing student map Name: " + EmployeeHashMap.get(var).getName() + " Salary : " + EmployeeHashMap.get(var).getSalary() + " Company: " + EmployeeHashMap.get(var).getCompany());


        }

    }
}