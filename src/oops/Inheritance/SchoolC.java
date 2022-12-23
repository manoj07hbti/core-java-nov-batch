package oops.Inheritance;

     // TODO (java does not support multilevel inheritance directly)
//  more than one class does not support --and move forward to the abstraction method
//TODO but interface can provide multilevel inheritance---

public class SchoolC extends SchoolB implements Schoolinterface{
    @Override
    public void inteface() {
        System.out.println(" THIS IS MULTILEVEL INHERITANCE BY USING INTERFACE ");
    }

    public static void main(String[] args) {
        SchoolC obj = new SchoolC();
        obj.inteface();
        obj.school1();
        obj.school2();
        obj.school3();
        obj.School4();
        obj.School5();
    }
}
