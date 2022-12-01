package functions_methods;

public class armstrongM {

    //method

    public void armstrongMethod(){

        int n=153;
        int remainder, sum=0;
        int newNumber=n; //newNumber=153


        while (n>0){

            remainder = n%10;
            sum = (remainder*remainder*remainder) + sum;
            n=n/10;
        }
        if (newNumber== sum ){
            System.out.println(newNumber +" is armstrong");
        }else
            System.out.println(newNumber +" is not armstrong");
    }

    public static void main(String[] args) {
        armstrongM obj = new armstrongM();
        obj.armstrongMethod();
    }
}
