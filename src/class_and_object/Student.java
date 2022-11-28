package class_and_object;

public class Student {

    // Properties or Data members ---------name, age ,rollNo, branch,address,email address

    String name = "ABC";
    int age = 25;
    int rollNo = 7;
    String branch = "IT";
    String address = "xyz";
    String email_address = "PQR";


    public static void main(String[] args) {

        // To create an object of class(Student) using default constructor
        // Syntax : classname  object_name = new classname();

        Student student = new Student();

        System.out.println("Student Name is :"+student.name);
        System.out.println("Student Age is :"+student.age);
        System.out.println("Student Roll number  is :"+student.rollNo);
        System.out.println("Student Branch is :"+student.branch);
        System.out.println("Student Address is :"+student.address);
        System.out.println("Student Email Address is :"+student.email_address);



        System.out.println("Name is :"+ student.name + "Age is :"+ student.age + "Roll number is :"+student.rollNo + "Branch is :"+student.branch +"Address is :"+student.address + "Email Address is :"+student.email_address);




    }



}
