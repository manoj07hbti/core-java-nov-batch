package HashMap;

import model_class.Employee;

import java.util.HashMap;

public class EmployeeHashMap {

    public HashMap<Integer, Employee> createEmployeeHashMap() {

        // HashMap <Datatype_key, Datatype_Value > objName= new HashMap<>();

        HashMap<Integer, Employee> EmployeeHashMap = new HashMap<>();

        // data of student
        Employee employee1 = new Employee("Sonu kumar", 35, 35000.35);
        Employee employee2 = new Employee("Ravi kumar", 45, 45000.45);
        Employee employee3 = new Employee("Rahul kumar", 40, 40000.40);
        Employee employee4 = new Employee("Mohit kumar", 30, 30000.30);
        Employee employee5 = new Employee("Raaj kumar", 25, 25000.25);
        Employee employee6 = new Employee("Suraj kumar", 50, 30000.30);
        Employee employee7 = new Employee("Arun kumar", 50, 30000.30);



        EmployeeHashMap.put(1, employee1);
        EmployeeHashMap.put(2, employee2);
        EmployeeHashMap.put(3, employee3);
        EmployeeHashMap.put(4, employee4);
        EmployeeHashMap.put(5, employee5);
        EmployeeHashMap.put(null, employee6);
        EmployeeHashMap.put(1, employee7);// duplicate key used
        System.out.println("Printing Employee  HashMap : " + EmployeeHashMap);

        return EmployeeHashMap;
    }

    public static void main(String[] args) {

        EmployeeHashMap obj= new EmployeeHashMap();
        HashMap <Integer, Employee> EmployeeHashMap= obj.createEmployeeHashMap();

        for(Integer var : EmployeeHashMap.keySet()){

            System.out.println("Printing Employee HashMap Name: "+EmployeeHashMap.get(var).getName()+ " Age : "+EmployeeHashMap.get(var).getAge()+" Salary: "+EmployeeHashMap.get(var).getSalary());

        }

    }
}


