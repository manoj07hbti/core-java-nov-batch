package oops.Inheritance;
//multilevel inheritance ----

public class SchoolB extends SchoolA{

    public void School5(){
        System.out.println(" This is school 5");
    }

    public static void main(String[] args) {
        SchoolB obj = new SchoolB();
        obj.school1();
        obj.school2();
        obj.school3();
        obj.School4();
        obj.School5();

        System.out.println(obj.name);
    }
}
