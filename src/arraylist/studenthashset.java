package arraylist;
import model.student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class studenthashset {
    public HashSet<student> createstudentlist(){
       LinkedHashSet <student>studentHashSet=new LinkedHashSet<>();
        student student1=new student("gaurang",25,"commerce");
        System.out.println("printing of hashcode " +student1.hashCode());

        student student2=new student("arun",26,"art");
        System.out.println("printing of hashcode " +student2.hashCode());

        student student3=new student("rohit",26,"it");
        System.out.println("printing of hashcode " +student3.hashCode());

        student student4=new student("himanshu",24,"civil");
        System.out.println("printing of hashcode " +student4.hashCode());

        student student5=new student("gaurang",25,"commerce");
        System.out.println("printing of hashcode " +student5.hashCode());

        student student6=new student("arun",26,"art");
        System.out.println("printing of hashcode " +student6.hashCode());

        student student7=new student("rohit",26,"it");
        System.out.println("printing of hashcode " +student7.hashCode());


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
        studenthashset obj=new studenthashset();
       HashSet <student> studentHashSet=obj.createstudentlist();
       for(student var:studentHashSet){
           System.out.println("printing of student list in hashset : " +var.getName()+" age " +var.getAge()+ " section "+ var.getSection());

       }

    }








}
