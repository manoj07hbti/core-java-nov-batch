package important_keywords;

public class DemoStatic {

    public static String course =  "Java developer services.";

    String name = "Java "; // This is non-static method

    public static void m1() {

        System.out.println("This is a static method..."); // this is static method
    }

    public static void main(String[] args) {

        DemoStatic.m1();
        System.out.println("Printing variable "+DemoStatic.course);
    }
}
