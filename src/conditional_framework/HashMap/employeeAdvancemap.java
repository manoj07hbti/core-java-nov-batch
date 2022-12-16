package conditional_framework.HashMap;

import conditional_framework.model.Employee_M;

import java.util.HashMap;

public class employeeAdvancemap {

    public HashMap<Integer, Employee_M> employeeADmap (){

        //SYNTAX: HashMap <DATATYPE_Key, DATATYPE_Value> objName= new HashMap<>();

        HashMap<Integer, Employee_M> employeeMHashMap = new HashMap<>();

        //create class

        Employee_M E1 =new Employee_M("Sandeep",25,22.50);
        Employee_M E2 =new Employee_M("Rahul",33,33.23);
        Employee_M E3 =new Employee_M("Siddharth",26,25.50);
        Employee_M E4 = new Employee_M("raj",22,33.33);

        //for insertion/add in hashmap ( use .put)

        employeeMHashMap.put(1,E1);
        employeeMHashMap.put(2,E2);
        employeeMHashMap.put(3,E3);
        employeeMHashMap.put(4,E4);

        return employeeMHashMap;

    }

    public static void main(String[] args) {
        employeeAdvancemap obj = new employeeAdvancemap();
        HashMap<Integer, Employee_M> dataemployeemap =obj.employeeADmap();

        System.out.println("THE DETAILS OF EMPLOYEES------->\n");

        for (Integer var : dataemployeemap.keySet()){
            System.out.println("* Name = " + dataemployeemap.get(var).getName()+"\n   Age " + dataemployeemap.get(var).getAge()
            +"\n   Salary " + dataemployeemap.get(var).getSalary());
        }

    }
}
