package functions_methods;

public class PersonM {

    String personName;
    int age;
    String place;

    //method
    // Walk,run,exercise,sleep

    public void walk(){
        System.out.println("A person should walk 5 km daily ");
    }
    public void run(){
        System.out.println("A person should run daily atleast 1 km ");
    }
    public void exercise(){
        System.out.println("A person should do exercise daily ");
    }
    public void sleep(){
        System.out.println("A person should take sleep at least 6 hours daily ");
    }

    public static void main(String[] args) {
        PersonM obj=new PersonM();
        obj.walk();
        obj.run();
        obj.exercise();
        obj.sleep();
    }

}
