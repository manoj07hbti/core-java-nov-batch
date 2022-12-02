package methods;

public class EvenOddMethod {
    public void evenodd(int num){

        if (num%2==0){
            System.out.println(num+" is a EVEN Number");
        }
        else {
            System.out.println(num+" is a ODD Number");
        }
    }

    public static void main(String[] args) {
        EvenOddMethod obj = new EvenOddMethod();
        obj.evenodd(16);
    }
}
