package dowhileloop;

public class Day13_EvenOdd {
                         /* Do while loop:
                         do {
                          CODE;
                          ++ or --;
                          } while(condition);       */
    //WAP to Print even and odd number between 1 and 100

    public static void main(String[] args) {
        int i=1;
        do{
            if(i%2==0){
                System.out.println(i+" is a Even Number");
            }
            else{
                System.out.println(i+" is a Odd Number");
            }
            i++;
        }while(i<=100);
    }
}
