package oops.Inheritance;

public class School {

    String name = "SCHOOLS" ;

    public void school1(){
        System.out.println(" This is school 1 ");

    }
    public void school2 (){

        System.out.println( " This is school 2 ");

    }
    public void school3 (){

        System.out.println(" This is school 3 ");
    }


    public static void main(String[] args) {
        School obj = new School();
        obj.school1();
        obj.school2();
        obj.school3();

        System.out.println(obj.name);


    }
}
