package calculator;

public class Even_odd {
    public void evenodd(int a){
        if (a%2==0){
            System.out.println("The no. is even :"+a);

        }
        else{
            System.out.println("The no. is odd :"+a);

        }

    }

    public static void main(String[] args) {
        Even_odd obj= new Even_odd();
        obj.evenodd(19);
    }
}
