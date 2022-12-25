package method;

public class Armstrong_no {
    public void armstrongM(){
        int n=153;
        int remainder, sum=0;
        int Newno=n;
        while (n>0){
            remainder = n%10;
            sum= (remainder*remainder*remainder)+sum;
            n=n/10;

        }
        if(Newno ==sum) {
            System.out.println("the armstrong no is  :" + Newno);
        }
        else
            System.out.println("the no. is not armstrong :" +Newno);

        }

    public static void main(String[] args) {
        Armstrong_no obj=new Armstrong_no();
        obj.armstrongM();
    }
    }


