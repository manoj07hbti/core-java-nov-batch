package calculator;

public class Calculate {
    public void add(int a, int b){
        int sum= a+b;
        System.out.println("the sum of a and b are" +sum);
    }
    public void sub(int p, int q){
        int sub=p-q;
        System.out.println("the sub of p and q is" +sub);
    }
    public void mul(int y, int z){
        int mul=y*z;
        System.out.println("the multiplied value of y z are" +mul);
    }
        public void div(int g, int h){
        int div= g/h;
            System.out.println("the division of te two digits is" +div);
        }

    public static void main(String[] args) {
        Calculate obj= new Calculate();
        obj.add(20 , 25);
        obj.sub(50,30);
        obj.mul(30,45);
        obj.div(40,10);
    }


}
