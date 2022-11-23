package dailyassignment;

public class TableOfFive {

    public static void main(String[] args) {

        /**
         *  Write a program to print the table of 5
         5x1=5, 5x2=10, 5x3=15, 5x4=20, 5x5=25, 5x6=30, 5x7=35, 5x8=40, 5x9=45, 5x10=50

         *  first we will take variable------number,result
         *  Syntax for Variable : Datatype variable_name = value;
         **/

        int number = 5;
        int result;

        // Syntax For_Loop: for(initialization; condition; increment/decrement){code}

        for(int i =1; i<=10; i++){

            result =number*i;

            System.out.println(number + "x"+i + "=" +result);

        }





    }
}
