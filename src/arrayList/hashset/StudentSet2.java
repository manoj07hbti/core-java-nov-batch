package arrayList.hashset;

import arrayList.model.Student;

import java.util.HashSet;

import java.util.LinkedHashSet;

public class StudentSet2 {

    public HashSet<Student> createStudentSet2() {

        //SYNTAX : HashSet <DATATYPE> objName = new ClassName();
        LinkedHashSet <Student> studentHashSet = new LinkedHashSet<>();

        Student student0 = new Student("Rakesh", 3, "civil");
        System.out.println("Hashcode of Student0 : "+student0.hashCode());

        Student student1 = new Student("Vineet", 4, "CSe");
        System.out.println("Hashcode of Student1 : "+student1.hashCode());

        Student student2 = new Student("Amit", 5, "EE");
        System.out.println("Hashcode of Student2 : "+student2.hashCode());

        Student student3 = new Student("Ram", 6, "Civil");
        System.out.println("Hashcode of Student3 : "+student3.hashCode());

        Student student4 = new Student("Ramesh", 7, "civil");
        System.out.println("Hashcode of Student4 : "+student4.hashCode());

        Student student5 = new Student("Vineet", 4, "CSe");
        System.out.println("Hashcode of Student5 : "+student5.hashCode());

        Student student6 = new Student("Amit", 5, "EE");
        System.out.println("Hashcode of Student6 : "+student6.hashCode());

        Student student7 = new Student("Ram", 6, "Civil");
        System.out.println("Hashcode of Student7 : "+student7.hashCode());

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

        StudentSet2 obj = new StudentSet2();
        HashSet <Student> studentHashSet = obj.createStudentSet2();

        for (Student var : studentHashSet) {
            System.out.println("Printing Student Name : "+var.getName()+", Roll no : "+var.getRollNo()+", Section : "+var.getSection());
        }
    }
}
