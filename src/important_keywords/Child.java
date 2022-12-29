package important_keywords;

public class Child extends DemoStatic {

    public static void m1(){

        System.out.println("CHILD : This is static method and it can call without creating object ");
    }


    public static void main(String[] args) {


        Child.m1();
    }
}
