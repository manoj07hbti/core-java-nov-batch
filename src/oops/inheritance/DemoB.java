package oops.inheritance;

public class DemoB extends DemoA{
    public void demobmethod (){
        System.out.println("This is Demo B Hello");
    }

    public static void main(String[] args) {
        DemoB obj = new DemoB();
        obj.demoamethod();
    }
}
