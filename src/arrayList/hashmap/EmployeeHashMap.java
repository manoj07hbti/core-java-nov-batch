package arrayList.hashmap;

import arrayList.model.Employee;

import java.util.HashMap;

public class EmployeeHashMap {

    public HashMap<Integer, Employee> createEmployeeHashMap() {

        // SYNTAX : HashMap <Datatype_key, Datatype_value> objName = new HashMap<>();

        HashMap<Integer, Employee> EmployeeMap = new HashMap<>();

        Employee employee1 = new Employee("Vineet", 1, 21911.63);
        Employee employee2 = new Employee("Amit", 2, 2084.84);
        Employee employee3 = new Employee("Rakesh", 3, 2515.15);
        Employee employee4 = new Employee("Nazim", 4 , 51521.15);
        Employee employee5 = new Employee("Singh", 5 , 51541.15);

        EmployeeMap.put(1,employee1);
        EmployeeMap.put(2,employee2);
        EmployeeMap.put(3,employee3);
        EmployeeMap.put(4,employee4);

        EmployeeMap.put(null, employee3); // null value
        EmployeeMap.put(1, employee5); // duplicate value
        System.out.println("Printing Map "+EmployeeMap);

        return EmployeeMap;
    }

    public static void main(String[] args) {

        EmployeeHashMap obj = new EmployeeHashMap();
        HashMap<Integer, Employee> EmployeeMap = obj.createEmployeeHashMap();

        for (Integer var : EmployeeMap.keySet()) {
            System.out.println("Printing name : "+EmployeeMap.get(var).getName()+", Id : "+EmployeeMap.get(var).getId()+", Salary : "+EmployeeMap.get(var).getSalary());
        }
    }
}
