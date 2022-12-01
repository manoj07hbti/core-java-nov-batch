package methods;

public class Demo {

    // WRITE A METHOD TO CHECK EVEN OR ODD NUMBER

    public void checkEvenOdd () {

        for(int i =1; i<=100; i++){

            if(i%2==0) {
                System.out.println("EVEN NUMBER : "+i);
            } else {
                System.out.println("ODD NUMBER : "+i);
            }
        }
    }

    // WRITE A METHOD TO CALCULATE PERCENTAGE
    public void calculatePercentage() {

        int number = 145;
        int percent = 15;
         double result = (double) (number*percent)/100;
        System.out.println(" Percentage is "+result);
    }


    // // WRITE A METHOD TO CALCULATE CUBE OF NUMBER
    public void calculateNumber(){

        int number = 3;
        System.out.println("CUBE OF 3 IS :"+number*number*number);
    }

    public static void main(String[] args) {
         Demo obj = new Demo();
         obj.checkEvenOdd();
         obj.calculatePercentage();
         obj.calculateNumber();

    }
}
