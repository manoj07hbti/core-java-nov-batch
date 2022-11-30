package Method;

public class Engineer {

    String name;
    int timing;

    public void workmethod(){

        System.out.println("This is a work method");
    }
    public void eatmethod(){
        System.out.println("This is a eat method");
    }
    public void sleepmethod(){
        System.out.println("This is a sleep method");
    }

     public static void main(String[]args){

        Engineer obj=new Engineer();


        obj.workmethod();
        obj.eatmethod();
        obj.sleepmethod();
     }
}
