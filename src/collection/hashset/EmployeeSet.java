package collection.hashset;

import collection.model.Employee;

import java.util.HashMap;
import java.util.HashSet;

public class EmployeeSet {

     HashSet<Employee>Employ(){

        HashSet<Employee>obj=new HashSet<>();

        Employee obj1=new Employee("King","CS",87,86877.76);
        System.out.println("Hashcode is :"+obj1.hashCode());

        Employee obj2=new Employee("Singh","CS",87,86877.76);
         System.out.println("Hashcode is :"+obj2.hashCode());


         Employee obj3=new Employee("Ring","EC",77,9877.76);
         System.out.println("Hashcode is :"+obj3.hashCode());



         Employee obj4=new Employee("King","CS",87,86877.76);
         System.out.println("Hashcode is :"+obj4.hashCode());

         Employee obj5=new Employee("Singh","CS",87,86877.76);
         System.out.println("Hashcode is :"+obj5.hashCode());

         Employee obj6=new Employee("Bring","IT",87,76877.76);
         System.out.println("Hashcode is :"+obj6.hashCode());

         Employee obj7=new Employee("alok","CS",87,98877.76);
         System.out.println("Hashcode is :"+obj7.hashCode());


         obj.add(obj1);
        obj.add(obj2);
        obj.add(obj3);
        obj.add(obj4);
        obj.add(obj5);
        obj.add(obj6);
        obj.add(obj7);

        return obj;
    }





    public static void main(String[]args){

         EmployeeSet obj=new EmployeeSet();

         HashSet<Employee>OBJ2=obj.Employ();

         for(Employee var:OBJ2){

             System.out.println("Name :"+var.getName()+"\tDepatment:"+var.getDepartment()+"\tID :"+var.getId()+"\tsalary:"+var.getSalary());
         }


    }
}
