package oops.Inheritance;

//if you want to make inheritance class then use 'extends' keywords----
public class SchoolA extends School {
    // you can add your own method by adding --

    public void School4 (){

        System.out.println(" This is school 4 ");
    }

    public static void main(String[] args) {
    SchoolA obj = new SchoolA();
    obj.school1();
    obj.school2();
    obj.school3();
    obj.School4();

        System.out.println(obj.name);

    }
}
