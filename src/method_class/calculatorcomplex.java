package method_class;

public class calculatorcomplex {
    public void addmethod(){
        int a=25;
       int b=36;
     int result =a+b;
        System.out.println("addition is : " +result);
    }
    public void submethod(){
        int a=6589;
        int b=125;
        int result=a-b;
        System.out.println("subtraction is :" +result);
    }
    public void multimethod(){
        int a=125;
        int b=256;
        int result=a*b;
        System.out.println("multiplication is "+result);
    }
    public void dividemethod(){
        int a=12545;
        int b=1244;
        double result=(double)a/b;
        System.out.println("divide is" +result);

    }

    public static void main(String[] args) {
        calculatorcomplex obj=new calculatorcomplex();
        obj.addmethod();
        obj.submethod();
        obj.multimethod();
        obj.dividemethod();
    }







}
