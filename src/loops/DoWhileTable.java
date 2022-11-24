package loops;

public class DoWhileTable {
    public static void main(String[] args) {

        // TABLE OF FIVE BY USING DO WHILE LOOP
        int i = 1;
        int number = 5;
        int result;

        do{
            result = number*i;
            System.out.println(number + " x " + i + " = " + result);
            i++;
        }
            while (i < 11);

        }
    }

