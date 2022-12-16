package collection.hashmap;

import collection.model.Student;

import java.util.HashMap;

public class StudentHashMap {

   public HashMap<Integer, Student> createStudentMap(){

       // HashMap <Datatype_key, Datatype_Value > objName= new HashMap<>();

       HashMap <Integer, Student> studentHashMap= new HashMap<>();

       // data of student

       Student student1= new Student("Raj",1,"CS");
       Student student2= new Student("Jatin",2,"IT");
       Student student3= new Student("Rakesh",3,"CS");
       Student student4= new Student("Robin",4,"IT");
       Student student5= new Student("Rahul",5,"CS");
       Student student6= new Student("Mohit",6,"CS");

       studentHashMap.put(1,student1);
       studentHashMap.put(2,student2);
       studentHashMap.put(3,student3);
       studentHashMap.put(4,student4);
       studentHashMap.put(null,student5);
       studentHashMap.put(1,student6);// duplicate key used
       System.out.println("Printing map "+studentHashMap);

       return studentHashMap;

   }

    public static void main(String[] args) {

       StudentHashMap obj= new StudentHashMap();
        HashMap <Integer, Student> studentHashMap= obj.createStudentMap();

        for(Integer var : studentHashMap.keySet()){

            System.out.println("Printing student map Name: "+studentHashMap.get(var).getName()+ " Roll no : "+studentHashMap.get(var).getRoll_no()+" Section: "+studentHashMap.get(var).getSection());

        }

    }
}
