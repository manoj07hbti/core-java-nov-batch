package loops;

public class DOWhileTable {

     public static void main(String[]args) {
         int number = 10;
         int result;
         int i = 1;
         do {
             result = number * i;

             System.out.println(number + "x" + i + "=" + result);
             i++;
         }
             while (i <= 10) ;

     }
}
