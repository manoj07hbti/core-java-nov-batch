package loops;

public class EVENorODD {
    public static void main(String[] args) {

        int number = 1;
        for(int i =1; i <100; i++){
            if (i%2==0){
                System.out.println("EVEN "+i);
            }
            else{
                System.out.println("ODD +"+i);
            }
        }
    }
}
