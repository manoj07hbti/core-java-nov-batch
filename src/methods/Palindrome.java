package methods;

public class Palindrome {

    public void palindrome () {

        int r,sum=0,temp;
        int n=151;

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        obj.palindrome();
    }

}

