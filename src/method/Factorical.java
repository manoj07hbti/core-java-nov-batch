package method;

public class Factorical {
    public void vedic(){
        int i;
        int m=10;
        int f=1;

            for (i=m;i>=1;i--)
            {
                f=f*i;
            }
        System.out.println("Factorial of 10 is=" +f);
    }

    public static void main(String[] args) {
        Factorical obj=new Factorical();
        obj.vedic();
    }
}
