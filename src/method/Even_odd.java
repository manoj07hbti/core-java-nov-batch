package method;

public class Even_odd {
    public void evenodd() {

        for (int i = 0; i <= 499; i++) {
            if (i % 2 == 0) {
                System.out.println("the no. is even :"+i);
            }
            else {
                System.out.println("The no. is odd :"+i);
            }
        }
    }


    public static void main(String[] args) {
Even_odd obj=new Even_odd();
obj.evenodd();
    }
}