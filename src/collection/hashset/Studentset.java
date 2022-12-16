package collection.hashset;

import collection.model.Studentlist;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;            //link hashset to follow the sequence order
import java.util.Scanner;
// to avid non pramitive data type repeatation naame ..= use equals and hashcode command in model class

public class Studentset {

    //LinkedHashset<modelclass>method name(){
    LinkedHashSet<Studentlist>names() {

        //LinkedHashset<model class name>object name=new LinkedHashset<>();
        LinkedHashSet<Studentlist> student = new LinkedHashSet<>();

        Studentlist student1 = new Studentlist("Varun", 45, "cs");
        System.out.println("Hashcode is 1:"+student1.hashCode());

        Studentlist student2 = new Studentlist("Arun", 34, "me");
        System.out.println("Hashcode is 2:"+student2.hashCode());

        Studentlist student3 = new Studentlist("Tarun", 55, "ec");
        System.out.println("Hashcode is 3:"+student3.hashCode());

        Studentlist student4 = new Studentlist("Varun", 45, "cs");
        System.out.println("Hashcode is 4:"+student4.hashCode());

        Studentlist student5 = new Studentlist("Shiva", 35, "ee");
        System.out.println("Hashcode is :"+student5.hashCode());

        Studentlist student6 = new Studentlist("Arun", 45, "cs");
        System.out.println("Hashcode is 6:"+student6.hashCode());

        Studentlist student7 = new Studentlist("Vikash", 5, "ec");
        System.out.println("Hashcode is 7:"+student7.hashCode());


        // scanner start

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter name of student: ");
        String name=scanner.nextLine();                         // use of scanner class


        System.out.println("Please enter roll no: ");
        int rollno=scanner.nextInt();

        System.out.println("Please enter SECTION of student: ");
        Scanner scanner1= new Scanner(System.in);
        String section= scanner1.nextLine();

        //scanner use

        student.add(student1);
        student.add(student2);
        student.add(student3);
        student.add(student4);
        student.add(student5);
        student.add(student6);
        student.add(student7);

        return student;

    }

    //public void inputfromscanner(){

    //    LinkedHashSet<Studentlist>studentlists=new LinkedHashSet<>();

    //    Scanner scanner=new Scanner(System.in);
    //     String Choice="y";
     //    while(Choice.equals("y")){

     //        System.out.println("please enter the value");

       //      String value=scanner.nextLine();
         //    Integer Value1=scanner.nextInt();
           //  String value2=scanner.nextLine();

          //   studentlists.size();

        //     System.out.println("Press Y to add more elements or press any key to exit " );
        //     Choice = scanner.nextLine();
          //   Choice= scanner.nextLine();
         //    Choice=scanner.nextLine();

     //    }
       // System.out.println("TreeSet Create by user is : " + studentlists);

   // }



     public static void main(String[]args){


          // P.. classname obj1= P... classname
             Studentset obj= new Studentset();


         //    obj.inputfromscanner();

             //Hashset<modelclass>obj2=obj1.methodname();
             HashSet <Studentlist>  studentHashSet=  obj.names();

             for(Studentlist var : studentHashSet){     //for(model.class.name   variable : obj2

                 System.out.println("Printing Student HashSet: "+var.getName() +" Rollno: "+var.getRollNo()+" Section: " +var.getSection());
             }


         }

}
