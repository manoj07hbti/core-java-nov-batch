package Method;

public class EvenOddParam {

    public void evenmethod(int a){
        if(a%2==0)
        System.out.println("The number is even :"+a);
        else
            System.out.println("The number is odd:"+a);
    }

    public static void main(String[]args){
        EvenOddParam obj= new EvenOddParam();

        obj.evenmethod(8);
    }
}
