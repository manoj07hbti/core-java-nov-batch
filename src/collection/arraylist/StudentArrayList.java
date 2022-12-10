package collection.arraylist;



import collection.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList {

   public  ArrayList <Student>  createStudentList(){

       // SYNTAX :  ArrayList <Datatype> objName= new ArrayList()

       ArrayList <Student> students= new ArrayList<>();

       //create student data

       Student student1= new Student("Raj",1,"CS");
       Student student2= new Student("Jatin",2,"IT");
       Student student3= new Student("Rakesh",3,"CS");
       Student student4= new Student("Robin",4,"IT");

       Scanner scanner= new Scanner(System.in);
       System.out.println("Please enter name of student: ");
       String name=scanner.nextLine();

       System.out.println("Please enter roll no: ");
       int rollno=scanner.nextInt();

       System.out.println("Please enter SECTION of student: ");
       Scanner scanner1= new Scanner(System.in);
       String section= scanner1.nextLine();

       Student student5= new Student(name,rollno,section);

       students.add(student5);



       students.add(student1);
       students.add(student2);
       students.add(student3);
       students.add(student4);

       return students;
   }


    public static void main(String[] args) {

        StudentArrayList obj= new StudentArrayList();

      ArrayList<Student> studentsList= obj.createStudentList();

      for (int i=0; i<studentsList.size(); i++){

         System.out.println("printing student  NAME : "+studentsList.get(i).getName());

         System.out.println("printing student  Roll no : "+studentsList.get(i).getRoll_no());

         System.out.println("printing student  SECTION : "+studentsList.get(i).getSection());


         System.out.println(" NAME :"+studentsList.get(i).getName() + " Roll no :"+studentsList.get(i).getRoll_no()+ " Section : "+studentsList.get(i).getSection());
      }


    }
}
