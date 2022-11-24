package loops;

public class DOWhileEVEN {
    public static void main(String[]args){
        int i=1;
        do{
            if(i%2==0) {
                System.out.println("your number is even " + i);
            }
                else{
                    System.out.println("your number is odd" + i);
                }

                    i++;


        } while(i<=100);
    }
}
