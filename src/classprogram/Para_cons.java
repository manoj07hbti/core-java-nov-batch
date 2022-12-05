package classprogram;

public class Para_cons {
    String name;
    float height;
    int age;

    public Para_cons(String name, float height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;

    }

    public static void main(String[] args) {
        Para_cons obj = new Para_cons("siddharth",30.5F,30);
        System.out.println("Siddharth's detail :"+obj.name);
        System.out.println("siddharth's height is :"+obj.height);
        System.out.println("siddharth's age is :"+obj.age);
        Para_cons obj1= new Para_cons("Karan",15.5F, 25);
        System.out.println("Student's name is :"+obj1.name);
        System.out.println("Student's height is :"+obj1.height);
        System.out.println("Student's age is :"+obj1.age);
    }
    }

