package Method;

public class Employee {

    String name;

     public void workmethod(){
         System.out.println("This is work method");
     }
     public void salarymethod(){
         System.out.println("This is salary method");
     }
     public void eatmethod(){
         System.out.println("This is eat method");
     }

     public static void main(String[]args){

         Employee obj=new Employee();

         obj.workmethod();
         obj.salarymethod();
         obj.eatmethod();
     }
}
