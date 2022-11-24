package whileloop;

public class Day13_5Table {
    public static void main(String[] args) {
                         /* while(condition){
                         CODE;
                         ++ or -- ;
                         }                */
        //WAP to print table of 5

        int table = 5;
        int i=1;
        while (i<=10) {
            int result = table*i;

            System.out.println(table+ "X" +i+ " = " +result);
            i++;
        }



    }
}
