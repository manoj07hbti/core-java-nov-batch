package loops;

public class odd_even_while {
    public static void main(String[] args) {


        int i=1;

        while (i<100){
            i++;
            if (i%2==0){ //even
                System.out.println(i+"=" + "even");
            }else {
                System.out.println(i+"=" + "odd");
            }
        }

    }
}

