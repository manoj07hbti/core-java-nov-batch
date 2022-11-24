package loops;

public class do_while_oddeven {
    public static void main(String[] args) {

        int i=1;

        do {
            if (i % 2 == 0) { //even
                System.out.println(i + "=" + "even");
            } else {
                System.out.println(i + "=" + "odd");
            }i++;
        }   while (i <=100);
    }
}





