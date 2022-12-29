package important_keywords;

public class DemoStatic {

    public static String course="Java Microservice Developer";

    String name="Java"; // this is not static field

    public static void m1(){

        System.out.println("This is static method and it can call without creating object ");
    }


    public static void main(String[] args) {

        //ClassName.MethodName(); // call method
        DemoStatic.m1();

        //ClassName.Variable; // print variable

        System.out.println("Printing variable "+DemoStatic.course);

    }

}
