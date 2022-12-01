package Method;

public class Armstrong {

    public void armstrongmethod(){

        int number=376;
        int realvalue,remainder,result=0;

        realvalue=number;

        while(realvalue!=0){

            remainder=realvalue %10;
            result+= Math.pow(remainder,3);
            realvalue /=10;
        }
        if(result==number)

            System.out.println("This number is ARMSTRONG Number");

            else
                System.out.println("This number is not ARMSTRONG Number");

     }

     public static void main(String[]args){

        Armstrong obj=new Armstrong();

        obj.armstrongmethod();
     }
    }

