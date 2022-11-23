package forloop;

public class Day12_5Table {
    /*for(initialization 0; condition<5; increment ++){
                       //statement or code to be executed
                    }
     */
                   //WAP to print table of 5
    public static void main(String[] args) {
        int num=5;
        System.out.println("Table of "+num);
        for(int i=1; i<=10; i++){
            int result = num*i;
            System.out.println(num+ "X"+i+" = "+result);
        }
    }

}
