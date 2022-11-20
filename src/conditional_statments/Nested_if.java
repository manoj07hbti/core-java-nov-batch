package conditional_statments;

public class Nested_if {
   public static void main(String[] args) {

      int marks = 70;
      if (marks > 60) {

         System.out.println("First division");
      }
      if (marks < 60) {
         if (marks > 48) {
            System.out.println("Second division");
         }
      }

      if (marks <48) {
         if (marks >33) {

            System.out.println("Third division");
         }


      }
   }
    }
















































