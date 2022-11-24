package loops;

public class WhileFactorial {

    public static void main(String[]args){
         int facto=1;
         int i=5;
         while(i>1) {

             facto = facto * i;

             System.out.println("The factor of 5! is " + "=" + facto);
             i--;
         }
    }
}

// with increment operator
 //public static void main(String[]args){
  //  int facto = 1;
 //   int i = 1;
 //   while (i < 5) {
 //       i++;
 //       facto = facto * i;
  //  }
 //   System.out.println("The factor of 5! is " + "=" + facto);

//}
