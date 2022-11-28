package loops;

public class DoWhileEVENorODD {
    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println("even or odd ");
        }
        while (i < 100);
        {

            if (i % 2 == 0) {
                System.out.println("EVEN " + i);
            } else {
                System.out.println("ODD " + i);
            }

        }
    }

}
