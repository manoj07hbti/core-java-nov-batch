package collection.hashset;

import collection.model.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class StudentSet {

    public HashSet <Student>  createStudentSet(){

        // HashSet <DATATYPE> objName= new ClassName();

        LinkedHashSet <Student> studentHashSet = new LinkedHashSet<>();

        //create student data

        Student student1= new Student("Raj",1,"CS");

        System.out.println("Hashcode of student1: "+student1.hashCode());

        Student student2= new Student("Jatin",2,"IT");
        System.out.println("Hashcode of student2: "+student2.hashCode());

        Student student3= new Student("Rakesh",3,"CS");
        System.out.println("Hashcode of student3: "+student3.hashCode());

        Student student4= new Student("Robin",4,"IT");
        System.out.println("Hashcode of student4: "+student4.hashCode());


        Student student6= new Student("Raj",1,"CS");
        System.out.println("Hashcode of student6: "+student6.hashCode());

        Student student7= new Student("Jatin",2,"IT");
        System.out.println("Hashcode of student7: "+student7.hashCode());

        Student student8= new Student("Rakesh",3,"CS");
        System.out.println("Hashcode of student8: "+student8.hashCode());

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);
        studentHashSet.add(student6);
        studentHashSet.add(student7);
        studentHashSet.add(student8);

        return studentHashSet;
    }


    public static void main(String[] args) {

        StudentSet obj= new StudentSet();
        HashSet <Student>  studentHashSet=  obj.createStudentSet();

        for(Student var : studentHashSet){

            System.out.println("Printing Student HashSet: "+var.getName() +" Rollno: "+var.getRoll_no()+" Section: " +var.getSection());
        }

    }
}
