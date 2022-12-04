package functions_methods;

public class odd_evenM {

    // method

    public void oddevenM(int a ){

        if (a%2==0){
            System.out.println(a + "  is even no.");
    }else {
            System.out.println(a + "  is odd no. ");
        }
}

    public static void main(String[] args) {
        odd_evenM obj=new odd_evenM();
        obj.oddevenM(10);
    }
}
