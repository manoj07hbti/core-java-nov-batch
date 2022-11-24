package loops;

public class DOWhileFACTO {

    public static void main(String[]args){
        int facto=1;
        int i=5;
        do{
            facto=facto*i;


            i--;
        }while(i>0);

        System.out.println("The factor of 5! is " + "=" + facto);
    }
}
