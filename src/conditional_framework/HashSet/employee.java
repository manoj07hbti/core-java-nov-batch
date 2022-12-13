package conditional_framework.HashSet;

import conditional_framework.model.Employee_M;

import java.util.HashSet;

public class employee {

    public HashSet<Employee_M> createemployeeset(){

        // HashSet <DATATYPE> objName= new ClassName();

        HashSet<Employee_M> employeesHashSet = new HashSet<>();


        Employee_M E1 =new Employee_M("Sandeep",25,22.50);
        Employee_M E2 =new Employee_M("Rahul",33,33.23);
        Employee_M E3 =new Employee_M("Siddharth",26,25.50);
        Employee_M E4 = new Employee_M("raj",22,33.33);
        Employee_M E5 =new Employee_M("Rahul",33,33.23);
        Employee_M E6 =new Employee_M("Siddharth",26,25.50);
        Employee_M E7 = new Employee_M("raj",22,33.33);

        employeesHashSet.add(E1);
        employeesHashSet.add(E2);
        employeesHashSet.add(E3);
        employeesHashSet.add(E4);
        employeesHashSet.add(E5);
        employeesHashSet.add(E6);
        employeesHashSet.add(E7);

        return employeesHashSet;


    }

    public static void main(String[] args) {

        employee obj = new employee();

        HashSet<Employee_M> dataemployeeset =obj.createemployeeset();

        for (Employee_M var : dataemployeeset){

            System.out.println("Name = " + var.getName()+ "\n  Age = "+ var.getAge()+"\n  Salary = "+ var.getSalary());
        }

    }
}
