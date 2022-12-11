package collection.array;

import collection.model.Employee;

import java.util.ArrayList;

public class Employlist {

    public ArrayList<Employee> employemethod() {

        ArrayList<Employee> makeinindiaemploye = new ArrayList<>();


        Employee makeinindia1 = new Employee("Ajay", "cs", 454, 3432.44);
        Employee makeinindia2 = new Employee("Vijay", "ec", 54, 3332.84);
        Employee makeinindia3 = new Employee("Praveen", "me", 44, 3232.47);
        Employee makeinindia4 = new Employee("jay", "ee", 874, 3132.44);


        makeinindiaemploye.add(makeinindia1);
        makeinindiaemploye.add(makeinindia2);
        makeinindiaemploye.add(makeinindia3);
        makeinindiaemploye.add(makeinindia4);

        return makeinindiaemploye;


    }






    public static void main(String[]args){

        Employlist var=new Employlist();
        ArrayList<Employee>employees= var.employemethod();

        for(int i=0;i<employees.size();i++){

            System.out.println("The employ data is :"+ employees.get(i).getName());
            System.out.println("The employ data is :"+ employees.get(i).getDepartment());
            System.out.println("The employ data is :"+ employees.get(i).getId());
            System.out.println("The employ data is :"+ employees.get(i).getSalary());



            System.out.println("The employ data is :"+ employees.get(i).getName()+"\tDepartment :"+employees.get(i).getDepartment()+"\t id :"+employees.get(i).getId()+"\tSalary:"+employees.get(i).getSalary());
        }


    }
}
