package collection.hashmap;

import collection.model.Employee;

import java.util.HashMap;

public class EmployeeMap {

    public HashMap<Integer, Employee> crtmethod() {

        HashMap<Integer, Employee> variable = new HashMap<>();

        Employee obj1 = new Employee("King", "CS", 87, 86877);

        Employee obj2 = new Employee("Singh", "EC", 77, 86875);

        Employee obj3 = new Employee("Ding", "EE", 67, 86867);

        Employee obj4 = new Employee("King", "CS", 87, 86877);

        Employee obj5 = new Employee("Ring", "GS", 97, 86777);


        variable.put(1,obj1);
        variable.put(2,obj2);
        variable.put(3,obj3);
        variable.put(4,obj4);
        variable.put(null,obj1);
        variable.put(1,obj5);

        System.out.println("print map :"+variable);

        return variable;


    }
     public static void main(String[]args){

        EmployeeMap varr=new EmployeeMap();
        HashMap<Integer,Employee>object=varr.crtmethod();

        for(Integer var: object.keySet()){

            System.out.println("printing name:"+object.get(var).getName()+"\t Department:"+object.get(var).getDepartment()+"\t id:"+object.get(var).getId());
        }

     }

}
