package loops;

public class WhileLoop {

    public static void main(String[] args) {

        // TABLE OF FIVE BY USING WHILE LOOP
        int i = 1;
        int number = 5;
        int result;

        while (i < 11) {

            result = number * i;
            System.out.println(number + " x " + i + " = " + result);
            i++;
        }



    }
}
