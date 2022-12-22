package oops.polymorphism;

public class MethodOverLoading {

    // Syntax for Method : access_specifier  return_type function or method_name(parameter){code}
    // Parameter-------an input parameter that is optional

    // Polymorphism: it is a greek word,it means many forms
    // Definition : The same operation applied to different data ,and it gives different behavior
    // Example of polymorphism : + operator ------ 1)  "Hello" +"World" = HelloWorld  2) 2+3 = 5
    // When we have used + operator with two String ("Hello" +"World") then it will do concatenation (HelloWorld )
    // When we have used the + operator with two integer values (2+3) then it will do the sum of two numbers (5)

    // Types of Polymorphism : 1)Compile time polymorphism  2) Run time polymorphism

    // Compile time polymorphism : It can be achieved by method overloading
    // Method_Overloading : Same method but we will overload with different-different input parameter


        public void m1 (){

        System.out.println(" This is a normal or standard method m1.....no input parameter");

        }

       public void m1 (String name){

        System.out.println(" This is overload  method m1.....with String input parameter  "+name);

       }

        public void m1 (int number){

        System.out.println(" This is overload  method m1.....with integer input parameter  "+number);

       }

       public void m1 (double price){

        System.out.println(" This is overload  method m1.....with double input parameter  "+price);

      }

      public void m1 (String name,int number){

        System.out.println(" This is overload  method m1.....with two input parameter ....String and integer...  "+name +"   "+ number);

      }

     public void m1 (String name,String color){

        System.out.println(" This is overload  method m1.....with two  String input parameter ....String and String....  "+name+ "  " + color);

     }

      public void m1 (double price,double salary){

        System.out.println(" This is overload  method m1.....with two double input parameter .......double and double....  "+price+ "   "+salary);

    }

      public void m1 (int a,int b,int c){

        System.out.println(" This is overload  method m1.....with three integer input parameter ....integer,integer and integer...  "+a+" "+b+" "+c);

    }



     // Main method to run program

    public static void main(String[] args) {

     // Step1 : Created an object of class----classname object_name = new classname();

      MethodOverLoading obj = new MethodOverLoading();


      // Step2 : To call method -------object_name.method_name();

        obj.m1();
        obj.m1(23);
        obj.m1("Java");
        obj.m1(23.50);
        obj.m1("Agra",5);
        obj.m1("Jaipur","Pink");
        obj.m1(45.6,45000.980);
        obj.m1(1,2,3);


    }





}
