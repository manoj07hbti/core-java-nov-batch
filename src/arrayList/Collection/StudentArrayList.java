package arrayList.Collection;

import arrayList.model.Student;

import java.util.ArrayList;

public class StudentArrayList {

    public ArrayList <Student> createStudentList(){


        // SYNTAX : ArrayList <Student> objName = new ArrayList();

        ArrayList <Student> students = new ArrayList<>();

        // create student list
        Student student = new Student("Vineet", 24, "CSe");
        Student student1 = new Student("Amit", 12, "EE");
        Student student2 = new Student("Ram", 23, "Civil");

        students.add(student);
        students.add(student1);
        students.add(student2);

        return students;
    }

    public static void main(String[] args) {

        StudentArrayList obj = new StudentArrayList();
        ArrayList <Student> studentsList = obj.createStudentList();

        for (Student student : studentsList) {

            System.out.println("Printing Student name : " + student.getName());
            System.out.println("Printing Student name : " + student.getRollNo());
            System.out.println("Printing Student name : " + student.getSection());

            System.out.println("Student name : " + student.getName() + ", Roll no : " + student.getRollNo() + ", Section : " + student.getSection());

        }

    }
}







