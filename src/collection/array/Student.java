package collection.array;

import collection.model.Studentlist;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    public ArrayList<Studentlist> studenmethod(){

        ArrayList<Studentlist>student=new ArrayList<>();

        Studentlist student1=new Studentlist("varun",65,"A");
        Studentlist student2=new Studentlist("Arun",51,"B");
        Studentlist student3=new Studentlist("Gagan",44,"C");
        Studentlist student4=new Studentlist("Vishal",34,"D");

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter name of student: ");
        String name=scanner.nextLine();                         // use of scanner class


        System.out.println("Please enter roll no: ");
        int rollno=scanner.nextInt();

        System.out.println("Please enter SECTION of student: ");
        Scanner scanner1= new Scanner(System.in);
        String section= scanner1.nextLine();


        student.add(student1);
        student.add(student2);
        student.add(student3);
        student.add(student4);

        return student;



    }



    public static void main(String[]args) {

        Student var = new Student();
        ArrayList<Studentlist> studentmethod = var.studenmethod();


        for (int i = 0; i < studentmethod.size(); i++) {


            System.out.println("Printing student Name :" + studentmethod.get(i).getName());
            System.out.println("Printing student Roll :" + studentmethod.get(i).getRollNo());
            System.out.println("Printing student Section :" + studentmethod.get(i).getSection());



            System.out.println("Printing student Name :" + studentmethod.get(i).getName() +"\t Roll number:"+studentmethod.get(i).getRollNo()+"\n Section is:"+studentmethod.get(i).getSection());




        }

    }
}
