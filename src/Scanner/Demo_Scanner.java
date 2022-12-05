package Scanner;

// To create Scanner class

  import java.util.Scanner;

 public class Demo_Scanner {

     public static void main(String[] args) {

         // To creating  Scanner object

         Scanner Scanner = new Scanner(System.in);
         System.out.println("Please enter country name : ");

         // For reading data


         String counrty = Scanner.nextLine();
         System.out.println("Country  name is :" + counrty);


         System.out.println("Please enter country name : ");

         String Country = Scanner.nextLine();
         System.out.println("Our Country name is :" + Country);

     }
 }





