package oops.abstraction;

public class Girl extends Student{
    @Override
    public void name() {
        System.out.println("My Name is Anjali,");
    }

    @Override
    public void Section() {
        System.out.println("My Section is CSE,");
    }

    @Override
    public void age() {
        System.out.println("I am 20 years old,");
    }

    @Override
    public void Roll_no() {
        System.out.println("And my roll no is 1..");
    }

    public static void main(String[] args) {
        System.out.println("***** Welcome to my Profile *****");

        Girl obj = new Girl();

        obj.Student_Details();
        obj.name();
        obj.Section();
        obj.age();
        obj.Roll_no();
    }
}
