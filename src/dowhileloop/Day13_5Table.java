package dowhileloop;

public class Day13_5Table {
    public static void main(String[] args) {
                         /* Do while loop:
                         do {
                          CODE;
                          ++ or --;
                          } while(condition);       */
        //WAP to print table of 5

        int num = 5;
        int i = 1;
        do{
            int table =num*i;
            System.out.println(num+"X"+i+" = "+table);
            i++;
        } while(i<=10);

    }
}
