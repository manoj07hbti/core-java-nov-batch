package class_and_object;

public class Student {

    //Data member
    String name;
    int rollno;
    String section;

    //parameterized constructor

    public Student(String name, int rollno, String section) {
        this.name = name;
        this.rollno = rollno;
        this.section = section;
    }

    public static void main(String[] args) {

        Student obj= new Student("Rohit",1,"CS");

        System.out.println("Printing Student name: "+obj.name +" RollNo: "+obj.rollno+" Section: "+obj.section );

        Student obj2= new Student("Munesh",2,"IT");
        System.out.println("Printing Student name: "+obj2.name +" RollNo: "+obj2.rollno+" Section: "+obj2.section );

        Student obj3= new Student("Rohit",3,"CS");
        System.out.println("Printing Student name: "+obj3.name +" RollNo: "+obj3.rollno+" Section: "+obj3.section );
    }
}
