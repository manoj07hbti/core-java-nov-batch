package loops;

public class WhileLoopEVENorODD {
    public static void main(String[] args) {

        int i =1;

        while (i<101) {

            if (i%2==0) {
                System.out.println("EVEN " +i);
            }
            else {
                System.out.println("ODD " +i);
            }
            i++;
        }
    }
}
