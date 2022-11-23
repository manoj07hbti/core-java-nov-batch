package loops;

public class Evenorodd {
    public static void main(String[] args) {

        int i;
        int n=2;

        for (i=1; i<=100; i++){
            if (i%2==0){ //even
                System.out.println(i+"=" + "even");
        }else {
                System.out.println(i+"=" + "odd");
            }
        }
    }
}
