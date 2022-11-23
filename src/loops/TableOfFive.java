package loops;

public class TableOfFive {
    public static void main(String[] args) {

        int number = 5;
        int result;

        for (int i = 1; i<=10; i++){

            result = number*i;
            System.out.println(number+ " x " +i+ " = "+result);
        }
    }
}
