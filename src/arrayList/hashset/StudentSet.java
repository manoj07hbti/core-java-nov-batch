package arrayList.hashset;

import arrayList.model.Student;

import java.util.HashSet;

public class StudentSet {


    public HashSet<Student> createStudentSet () {

        //SYNTAX : HashSet <DATATYPE> objName = new ClassName();
        HashSet <Student> studentHashSet = new HashSet<>();

        Student student0 = new Student("Ramesh", 5, "civil");
         Student student1 = new Student("Vineet", 24, "CSe");
         Student student2 = new Student("Amit", 12, "EE");
         Student student3 = new Student("Ram", 23, "Civil");
        Student student4 = new Student("Ramesh", 5, "civil");
        Student student5 = new Student("Vineet", 24, "CSe");
        Student student6 = new Student("Amit", 12, "EE");
        Student student7 = new Student("Ram", 23, "Civil");

        studentHashSet.add(student0);
        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);
        studentHashSet.add(student5);
        studentHashSet.add(student6);
        studentHashSet.add(student7);

        return studentHashSet;
    }

    public static void main(String[] args) {

        StudentSet obj = new StudentSet();
        HashSet <Student> studentHashSet = obj.createStudentSet();

        for (Student var : studentHashSet) {
            System.out.println("Printing Student Name : "+var.getName()+", Roll no : "+var.getRollNo()+", Section : "+var.getSection());
        }
    }
}
