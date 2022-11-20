package git;

public class Moduler {
    public static void main(String[] args) {
        int number=25;
        int result=number%2;
        System.out.println("remainder is "+result);
        result=number%8;
        System.out.println("remainder is  "+result);

        number=24;
        result=number%5;
        System.out.println("remainder is even");

        number=8;
        result=number%3;
        if(result==2){
            System.out.println("remainder is even "+result);

        }



    }
}
