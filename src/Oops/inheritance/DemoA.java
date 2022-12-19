package Oops.inheritance;

public class DemoA {

    // single class of inheritance
    // inheritance class of child and parent
  // Syntax : child extents parents{....code...}

   String name = "Student";
   String name2 = "Doctor";
       public void a1 () {
            System.out.println("This is a Inheritance a1 class");
    }

         public void a2 (){
              System.out.println("This is a inheritance a2 class ");

    }

    public static void main(String[] args) {

       DemoA obj = new DemoA();
       obj . a1();
       obj .a2();

        System.out.println(obj.name);
    }

}

