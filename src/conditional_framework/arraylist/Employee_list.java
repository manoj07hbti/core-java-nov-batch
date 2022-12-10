package conditional_framework.arraylist;

import conditional_framework.model.Employee_M;

import java.util.ArrayList;


public class Employee_list {

    //method
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public ArrayList<Employee_M> employeeslist(){

        //syntax--  ArrayList <Datatype> objName= new ArrayList()

        ArrayList<Employee_M> employeedata = new ArrayList<>();

        //create employee class

        Employee_M E1 =new Employee_M("Sandeep",25,22.50);
        Employee_M E2 =new Employee_M("Rahul",33,33.23);
        Employee_M E3 =new Employee_M("Siddharth",26,25.50);

        employeedata.add(E1);
        employeedata.add(E2);
        employeedata.add(E3);

        return employeedata;
    }


    public static void main(String[] args) {

        Employee_list obj = new Employee_list();

        ArrayList<Employee_M> data = obj.employeeslist();

            for (int i=0; i<data.size(); i++){

                System.out.println("Name = "+data.get(i).getName());
                System.out.println("Age = "+data.get(i).getAge());
                System.out.println("Salary "+data.get(i).getSalary());
                System.out.println("\n");
            }
    }
}
