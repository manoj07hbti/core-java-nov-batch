package methods;

public class EvenODD {

    // EVEN OR ODD NUMBER 1 TO 50

    public void Number(int i){


            if(i % 2 == 0){
                System.out.println("Even number "+i);
            }
            else {
                System.out.println("Odd number "+i);
            }
        }


    public static void main(String[] args) {
        EvenODD obj = new EvenODD();
        obj.Number(45);
        obj.Number(34);
        obj.Number(17);
        obj.Number(24);
        obj.Number(26);
        obj.Number(25);
        obj.Number(31);
        obj.Number(49);
    }
}
