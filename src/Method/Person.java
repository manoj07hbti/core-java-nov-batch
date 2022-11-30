package Method;

public class Person {

    String name;

    public void walkmethod(){
        System.out.println("This is walk method");
    }
    public void eatmethod(){
        System.out.println("This is eat method");
    }
    public void sleepmethod(){
        System.out.println("This is sleep method");
    }
    public static void main(String[]args){
         Person obj=new Person();

         obj.walkmethod();
         obj.eatmethod();
         obj.sleepmethod();
    }
}
