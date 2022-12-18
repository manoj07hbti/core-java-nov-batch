package arrayList.hashmap;

import arrayList.model.Student;

import jdk.nashorn.internal.parser.Scanner;

import java.util.HashMap;

public class StudentHashMap {

    public HashMap<Integer, Student> createStudentMap() {

        // SYNTAX : HashMap <Datatype_key, Datatype_value> objName = new HashMap<>();
        HashMap<Integer, Student> StudentMap = new HashMap<>();

        // Data of Student
        Student student = new Student("Vineet", 24, "CSe");
        Student student1 = new Student("Amit", 12, "EE");
        Student student2 = new Student("Ram", 23, "Civil");
        Student student3 = new Student("Rahul", 3, "Cs");
        Student student4 = new Student("Ramesh", 4, "Cs");

        StudentMap.put(1,student);
        StudentMap.put(2,student1);
        StudentMap.put(3,student2);
        StudentMap.put(null,student3);
        StudentMap.put(1,student4); // duplicate key
        System.out.println("Printing Map "+StudentMap);

        return StudentMap;
    }

    public static void main(String[] args) {

        StudentHashMap obj = new StudentHashMap();
        HashMap<Integer, Student> StudentHashMap = obj.createStudentMap();

        for(Integer var : StudentHashMap.keySet()) {
            System.out.println("StudentMap, Name : "+StudentHashMap.get(var).getName()+", Roll no - "+StudentHashMap.get(var).getRollNo()
            +", Section - "+StudentHashMap.get(var).getSection());
        }
    }
}
