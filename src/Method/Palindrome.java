package Method;

public class Palindrome {

    public void palindromemethod(){

        int number=434,reverse=0,rem;

        int realvalue=number;

        while(number!=0){
            rem=number%10;
            reverse=reverse*10+rem;
            number/=10;
        }

        if(realvalue==reverse)
            System.out.println("This number is a palindrome Number");
        else
            System.out.println("This number is not a palindrome Number");
    }


    public static void main(String[]args){

        Palindrome obj=new Palindrome();

        obj.palindromemethod();
    }
}
