package Method;

public class Percantage_returntype {

    public double percant(int a, double b) {
        double per = (a*b)/100;
        return per;

    }


    public static void main(String[] args) {


        Percantage_returntype obj = new Percantage_returntype();

        double per= obj.percant(100,20.22);

        System.out.println("Value of the addition is " + per);


    }
}