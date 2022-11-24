package loops;

public class WhileEven {

    public static void main(String[] args) {
        int i = 0;

        while (i < 100){
            i++;
            if(i%2==0){
                System.out.println("your number is a even number "+i);
            }
            if(i%2==1){
                System.out.println("your number is a odd number"+i);
            }
        }
    }
}
