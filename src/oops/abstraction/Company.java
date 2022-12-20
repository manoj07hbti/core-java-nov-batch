package oops.abstraction;

public  abstract class Company {

    public void companyname(){

        String name= "\tmahindra";
        System.out.println(" welcome to  :");

    }
    public void employename(){


        System.out.println("The name of the employ is :");
    }

    public void department(){

        System.out.println("DEPARTMENT IS :");
    }
    public abstract void salary(); //  in abstract class make method is not possible that the reason NO {}
    public abstract void holiday();
    public abstract void shift();
}
