package collection.hashset;

import collection.model.Studentlist;

import java.util.HashSet;

public class Studentset {

    HashSet<Studentlist>names() {

        HashSet<Studentlist> student = new HashSet<>();

        Studentlist student1 = new Studentlist("Varun", 45, "cs");
        Studentlist student2 = new Studentlist("Arun", 34, "me");
        Studentlist student3 = new Studentlist("Tarun", 55, "ec");
        Studentlist student4 = new Studentlist("Varun", 45, "cs");
        Studentlist student5 = new Studentlist("Shiva", 35, "ee");
        Studentlist student6 = new Studentlist("Arun", 45, "cs");
        Studentlist student7 = new Studentlist("Vikash", 5, "ec");

        student.add(student1);
        student.add(student2);
        student.add(student3);
        student.add(student4);
        student.add(student5);
        student.add(student6);
        student.add(student7);

        return student;

    }

     public static void main(String[]args){



             Studentset obj= new Studentset();
             HashSet <Studentlist>  studentHashSet=  obj.names();

             for(Studentlist var : studentHashSet){

                 System.out.println("Printing Student HashSet: "+var.getName() +" Rollno: "+var.getRollNo()+" Section: " +var.getSection());
             }


         }

}
