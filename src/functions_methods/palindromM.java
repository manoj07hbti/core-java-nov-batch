package functions_methods;

public class palindromM {

    //method

    public void palindromeMethod(){

        int n=616;
        int newNumber=n;
        int r;
        int s=0;

        while (n>0){

            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if (newNumber==s){
            System.out.println( newNumber + " is palindrome");
        }else
            System.out.println(newNumber + " is not palindrome");
    }

    public static void main(String[] args) {
        palindromM obj = new palindromM();
        obj.palindromeMethod();
    }
}
