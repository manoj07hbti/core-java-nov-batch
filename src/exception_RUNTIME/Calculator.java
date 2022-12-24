package exception_RUNTIME;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Welcome to the Calculator -----");

        int a = 10;
        int b = 0;
        int divide = 0;

        try {
            divide = a/b;
        }
        catch (Exception e){
            System.out.println("RESULT OF DIVISION IS "+ e);
        }
        System.out.println("the result is "+ divide+"\n");

        System.out.println("THE ARRAY TYPE DATA ------");

        String array[] = {"Sandeep","Siddharth","Sanjay","Sudheer"};

        try {
            System.out.println(array[5]);
        }
        catch (Exception e){
            System.out.println("THE array data member is "+e);
        }
        System.out.println("THE ARRAY IS PRINTED AFTER EXCEPTION ");



    }
}
