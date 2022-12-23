package oops.abstraction;
// while create a public class import with extends the abstract class then implements.....

public class ChildCollege extends College{

    //then write the method in which class the created....
    @Override
    public void collegeabstract() {
        System.out.println("This is a College Abstract ");

    }

    public static void main(String[] args) {
        ChildCollege obj = new ChildCollege();
        obj.college1();
        obj.college2();
        obj.collegeabstract();

    }
}
