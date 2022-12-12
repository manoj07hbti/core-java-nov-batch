package collection.hashset;

import collection.model.Student;

import java.util.HashMap;
import java.util.HashSet;

public class StudentSet {

    public HashSet <Student>  createStudentSet(){

        // HashSet <DATATYPE> objName= new ClassName();

        HashSet <Student> studentHashSet = new HashSet<>();

        //create student data

        Student student1= new Student("Raj",1,"CS");
        Student student2= new Student("Jatin",2,"IT");
        Student student3= new Student("Rakesh",3,"CS");
        Student student4= new Student("Robin",4,"IT");
        Student student5= new Student("Mukesh",5,"CIVIL");
        Student student6= new Student("Raj",1,"CS");
        Student student7= new Student("Jatin",2,"IT");
        Student student8= new Student("Rakesh",3,"CS");

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);
        studentHashSet.add(student5);
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
