package methods;

public class CalCReturnType {

    public int add(int a, int b){

        int sum=a+b;

        return sum;
    }


    public static void main(String[] args) {

        CalCReturnType obj= new CalCReturnType();
       int result= obj.add(34,21);

       System.out.println("SUM is "+result);

    }
}
