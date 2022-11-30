package Method;

public class Dog {

    String name;

    public void barkmethod(){

        System.out.println("This is bark method");
    }

    public void runmethod(){
        System.out.println("This is run method");
    }
    public void playmethod(){
        System.out.println("This is play method");
    }

    public static void main(String[]args){

        Dog obj=new Dog();

        obj.barkmethod();
        obj.playmethod();
        obj.runmethod();
    }
}
