package methods;

public class Demo {

    public void checkEvenOdd(){

        for (int i=1; i<=100; i++){

            if(i%2==0){

                System.out.println("Number is even: "+i);
            }
            else {

                System.out.println("Number is ODD: "+i);
            }
        }

    }

    public void calculatePercentage(){

        int number=124;
        int percent=10;

        double result= (double) (number*percent)/100;

        System.out.println("Percentage is "+result);

    }

    public void cube(){

        int number=3;

        System.out.println("Cube is : "+number*number*number);

    }


    public static void main(String[] args) {

        Demo obj= new Demo();
        obj.checkEvenOdd();

        obj.calculatePercentage();

        obj.cube();
    }

}
