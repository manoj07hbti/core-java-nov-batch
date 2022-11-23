package conditional_statments;

public class Evenodd {
    public static void main(String[] args) {


        int i;
        int number= 2;

        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) { //even
                System.out.println(i + "=" + "even");
            } else {
                System.out.println(i + "=" + "odd");
            }
        }
    }
}











