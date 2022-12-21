package oops.polyMorphism;

public class PolymorphismDay1 {
    public void method1 (){
        System.out.println("This is Student Data Structure");
    }
    //Override
    public void method1 (String Name){
        System.out.println("Student Name is : "+Name);
    }
    //Override again
    public void method1 (int Class){
        System.out.println("Class of Student : "+Class);
    }
    //Override again
    public void method1 (double fees){
        System.out.println("Fees of per student : "+fees);
    }
    //Override again
    public void method1 (String section, int seatnumber){
        System.out.println("Section of student : "+section+" & Seat Number is "+seatnumber);
    }

    public static void main(String[] args) {
        PolymorphismDay1 obj = new PolymorphismDay1();
        obj.method1();
        obj.method1("A",25);
        obj.method1(9);
        obj.method1("Akash");
        obj.method1(25600.22);

    }
}
