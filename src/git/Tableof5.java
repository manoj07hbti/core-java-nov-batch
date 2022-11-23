package git;

public class Tableof5 {
    public static void main(String[] args) {
        int number=5;
        int result;
        for(int i=1; i<=10; i++ ){
            result=number*i;
            System.out.println(number+"*"+i+"="+result);
        }

        number=6;
        for(int a=1; a<=10; a++){
            result=number*a;
            System.out.println(number+"*"+a+"="+result);
        }
        number=9;

        for(int b=1; b<=10; b++){
            result=number*b;
            System.out.println(number+"*"+b+"="+result);
        }
        number=10;
        for(int c=1;c<=10; c++){
            result=number*c;
            System.out.println(number+"*"+c+"="+result);

        }
    }
}
