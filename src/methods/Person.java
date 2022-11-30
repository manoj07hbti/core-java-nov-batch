package methods;

public class Person {

// DATA MEMBER

    String walk;
    String eat;
    int sleep;

    // methods

    public void setWalkMethod() {

        System.out.println("This is Walk Method");
    }

    public void setEatMethod() {

        System.out.println("This is Eat Method");
    }

    public void setSleepMethod() {

        System.out.println("This is Sleep Method");
    }


    // SYNTAX

    public static void main(String[] args) {

        Person obj = new Person();

        obj.setWalkMethod();
        obj.setEatMethod();
        obj.setSleepMethod();

    }
}
