package functions_methods;

public class EngineerM {

    //Data member

    String name;
    int age;
    double salary;
    String branch;

    //method: Capabilities
    //work,eat,sleep

    //Syntax --- access specifier   return type   method name  (parameters) {CODE};

    public void work(){
        System.out.println("The engineer can work 8 hours per day ");
    }

    public void eat(){
        System.out.println("He eats fast food ");
    }
    public void sleep(){
        System.out.println("he sleeps at 9 pm ");
    }

    public static void main(String[] args) {
        //STEP 1 - classname objname = new classname
        //Step 2 - obj.classname;

        EngineerM obj = new EngineerM();
        obj.work();
        obj.eat();
        obj.sleep();
    }

}
