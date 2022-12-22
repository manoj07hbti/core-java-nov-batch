package oops.inheritance;

public class ChildCALCULATOR extends Dchild implements Myinterface {


    @Override
    public void calculator() {     // this method is over ridden from myinterface

        System.out.println(" this calculator is made by child");
    }

    public static void main(String[]args){
        ChildCALCULATOR obj=new ChildCALCULATOR();
        double c = 0;
        c = obj.add(3, 4);
        System.out.println("SUM IS:" + c);


        c = obj.sub(5, 3);
        System.out.println("SUB is :" + c);

        c = obj.mul(7, 3);
        System.out.println("Multiply of number is :" + c);

        c = obj.div(4.2, 2.1);
        System.out.println("Division of number is :" + c);

        obj.calculator();
    }
}
