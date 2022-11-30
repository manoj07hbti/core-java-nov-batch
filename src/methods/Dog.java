package methods;

public class Dog {

// DATA MEMBER

    String bark;
    String run;
    int play;

    // methods

    public void setBarkMethod() {

        System.out.println("This is Bark Method");
    }

    public void setRunMethod() {

        System.out.println("This is Run Method");
    }

    public void setPlayMethod() {

        System.out.println("This is Play Method");
    }


    // SYNTAX

    public static void main(String[] args) {

        Dog obj = new Dog();

        obj.setBarkMethod();
        obj.setRunMethod();
        obj.setPlayMethod();

    }
}
