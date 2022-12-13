package conditional_framework.HashSet;

import conditional_framework.model.Employee_M;

import java.util.HashSet;

public class employeeHashcode {

    public HashSet<Employee_M> employeeMHashSet (){

        HashSet<Employee_M> employhashcode = new HashSet<>();

        Employee_M E1 = new Employee_M("Raju",34,44.54);
        System.out.println("Hashcode of employee 1 : "+E1.hashCode());

        Employee_M E2 =new Employee_M("Rahul",33,33.23);
        System.out.println("Hashcode of employee 2 : "+E2.hashCode());

        Employee_M E3 =new Employee_M("Siddharth",26,25.50);
        System.out.println("Hashcode of employee 3 : "+E3.hashCode());

        Employee_M E4 = new Employee_M("raj",22,33.33);
        System.out.println("Hashcode of employee 4 : "+E4.hashCode());

        Employee_M E5 =new Employee_M("Rahul",33,33.23);
        System.out.println("Hashcode of employee 5 : "+E5.hashCode());

        Employee_M E6 =new Employee_M("Siddharth",26,25.50);
        System.out.println("Hashcode of employee 6 : "+E6.hashCode());

        Employee_M E7 = new Employee_M("raj",22,33.33);
        System.out.println("Hashcode of employee 7 : "+E7.hashCode());

        Employee_M E8 = new Employee_M("Raju",34,44.54);
        System.out.println("Hashcode of employee 8 : "+E8.hashCode());

        Employee_M E9 =new Employee_M("Rahul",33,33.23);
        System.out.println("Hashcode of employee 9 : "+E9.hashCode());

        Employee_M E10 =new Employee_M("Siddharth",26,25.50);
        System.out.println("Hashcode of employee 10 : "+E10.hashCode());

        employhashcode.add(E1);
        employhashcode.add(E2);
        employhashcode.add(E3);
        employhashcode.add(E4);
        employhashcode.add(E5);
        employhashcode.add(E6);
        employhashcode.add(E7);
        employhashcode.add(E8);
        employhashcode.add(E9);
        employhashcode.add(E10);

        return employhashcode;

    }

    public static void main(String[] args) {

        employeeHashcode obj = new employeeHashcode();
        HashSet<Employee_M> employeecode = obj.employeeMHashSet();

        for (Employee_M var : employeecode){
            System.out.println("* Name = " + var.getName()+ "\n  Age =  "+ var.getAge()+ "\n  Salary = " + var.getSalary());
        }
    }
}
