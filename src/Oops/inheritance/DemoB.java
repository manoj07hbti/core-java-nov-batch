package Oops.inheritance;

public class DemoB extends DemoA{

    public void a3(){

        System.out.println("THis is a3 inheritance class");
    }


    public static void main(String[] args) {

        DemoB obj= new DemoB();

         obj.a1();
         obj.a2();

          System.out.println(obj.name);
          System.out.println(obj.name2);
    }

}
