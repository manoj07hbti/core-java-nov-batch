package conditional_framework.HashSet;

import conditional_framework.model.Employee_M;

import java.util.*;
public class employeeSChset {

    public  HashSet<Employee_M> createSCemployee(){

        // syntax-- HashSet<Datatype> objname = new classname/collection <>();

        HashSet<Employee_M> emmployeeschashset = new HashSet<>();
        //create class

        Scanner E1 = new Scanner(System.in);
        Scanner E2 = new Scanner(System.in);
        Scanner E3 = new Scanner(System.in);


        Scanner sc =new Scanner(System.in);

        String flag = "y";
        while (flag.equals("y")){

            System.out.println("Enter the name of employee");
            String name = E1.nextLine();

            System.out.println("Enter the age of employee");
            int age = E2.nextInt();

            System.out.println("Enter the salary of employee");
            double salary = E3.nextDouble();

            Employee_M E4 = new Employee_M(name, age, salary);
            emmployeeschashset.add(E4);

            System.out.println("Press y to add more elements or press any key to exit ");
            flag = sc.nextLine();
            System.out.println("\n");

        }
        return emmployeeschashset;

    }

    public static void main(String[] args) {
        employeeSChset obj = new employeeSChset();

        System.out.println("THE DETAILS OF EMPLOYEES ---------\n");

        HashSet<Employee_M> data = obj.createSCemployee();

        for (Employee_M var : data){
            System.out.println("Name = "+ var.getName()+"\n Age = " + var.getAge()+ "\n Salary"+ var.getSalary());
        }

    }
}
