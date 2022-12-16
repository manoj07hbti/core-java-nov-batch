package collection_framework.hashmap;

import collection_framework.model.Employee;

import java.util.HashMap;

public class EmpHashMapReturnType {
    public HashMap<Integer, Employee> empHashMapMethod (){
        // HashMap <Datatype_key, Datatype_Value > objName= new HashMap<>();
        HashMap<Integer, Employee> Employeeobject = new HashMap<>();

        // Create Employee Data

        Employee emp1 = new Employee("Pranjul","IT",1);
        Employee emp2 = new Employee("Shubh", "Accounts",2);
        Employee emp3 = new Employee("Aniket", "HR",3);
        Employee emp4 = new Employee("Bhullar", "Accounts",4);
        Employee emp5 = new Employee("Anna", "HR",5);
        Employee emp6 = new Employee("Aman", "Accounts",6);
        Employee emp7 = new Employee("Umang", "HR",7);
        Employee emp8 = new Employee("Popatlal", "Press",8);

        Employeeobject.put(1,emp1);
        Employeeobject.put(2,emp2);
        Employeeobject.put(3,emp3);
        Employeeobject.put(null,emp4);
        Employeeobject.put(4,emp5);
        Employeeobject.put(5,emp6);
        Employeeobject.put(6,emp7);
        Employeeobject.put(1,emp8);

        return Employeeobject;
    }

    public static void main(String[] args) {
        EmpHashMapReturnType obj = new EmpHashMapReturnType();
        HashMap<Integer, Employee> emphasmapoutput = obj.empHashMapMethod();
        for (Integer var : emphasmapoutput.keySet()){
            System.out.println("Employee Name : "+emphasmapoutput.get(var).getName()+" Department : "+emphasmapoutput.get(var).getDepartment()
                    +" Desk No. : "+emphasmapoutput.get(var).getDesk());
        }

    }

}
