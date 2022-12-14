package conditional_framework.arraylist;

import conditional_framework.model.Employee_M;

import java.util.ArrayList;
import java.util.*;

public class employee_SC {

    public ArrayList<Employee_M> employeelist() {

        //method
        ArrayList<Employee_M> employees = new ArrayList<>();

        //create class

        Scanner e1 = new Scanner(System.in);
        Scanner e2 = new Scanner(System.in);
        Scanner e3 = new Scanner(System.in);


        Scanner sc = new Scanner(System.in);

        String flag = "y";
        while (flag.equals("y")) {


            System.out.println("Please enter Name");
            String name = e1.nextLine();

            System.out.println("please enter your age");
            int age = e2.nextInt();

            System.out.println("Please enter your Salary");
            double salary = e3.nextDouble();

            Employee_M e4 = new Employee_M(name, age, salary);
            employees.add(e4);

            System.out.println("Press y to add more elements or press any key to exit ");
            flag = sc.nextLine();
            System.out.println("\n");

        } return employees;

    }


    public static void main(String[] args){

            employee_SC obj = new employee_SC();
            ArrayList<Employee_M> data = obj.employeelist();

        System.out.println("THE DETAILS OF EMPLOYEES ---------\n");

        //we can use for loop OR advance for loop

            for (int i = 0; i < data.size(); i++) {
                System.out.println(data.get(i).getName());
                System.out.println(data.get(i).getAge());
                System.out.println(data.get(i).getSalary());
                System.out.println("\n");
            }
        }
    }


