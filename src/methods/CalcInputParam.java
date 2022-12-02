package methods;

public class CalcInputParam {

    public void addition(int a, int b){

        int result=a+b;

        System.out.println("SUM is :"+result);
    }


    public static void main(String[] args) {
        CalcInputParam obj= new CalcInputParam();

        obj.addition(4,67);
        obj.addition(55,12);
        obj.addition(33,576);

    }
}
