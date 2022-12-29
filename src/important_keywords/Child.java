package important_keywords;

public class Child extends DemoStatic{

    public static void m1() {

        System.out.println("Child : This is a static method..."); // this is static method
    }

    public static void main(String[] args) {
        Child.m1();

    }

}
