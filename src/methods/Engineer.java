package methods;

public class Engineer {

// DATA MEMBER

    String work;
    String eat;
    int sleep;

    // methods

    public void setWorkMethod() {

        System.out.println("This is Work Method");
    }

    public void setEatMethod() {

        System.out.println("This is Eat Method");
    }

    public void setSleepMethod() {

        System.out.println("This is Sleep Method");
    }


    // SYNTAX

    public static void main(String[] args) {

        Engineer obj = new Engineer();

        obj.setWorkMethod();
        obj.setEatMethod();
        obj.setSleepMethod();

    }
}
