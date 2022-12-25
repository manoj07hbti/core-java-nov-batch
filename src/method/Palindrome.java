package method;

public class Palindrome {
    public void palindromemethod(){
        int n = 817;
        int newno=n;
        int r;
        int s=0;
        while (n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(newno==s){
            System.out.println("the no. is palindrome :"+newno);

        }
        else
            System.out.println("the no. is not palindrome :" +newno);

    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        obj.palindromemethod();
    }
}
