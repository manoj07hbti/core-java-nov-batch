package method;

public class Cubee {
public void vedic(int number){
    int vedic= number*number*number;
    System.out.println("the cube of no. is" +vedic);

}

    public static void main(String[] args) {
        Cubee obj= new Cubee();
        obj.vedic(9);
    }
}

