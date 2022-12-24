package exception;

public class Calculator {

    public int divide(int a, int b){

        System.out.println("Divide method started ");

        int result=0;
        try{

            result = a/b;
        }
        catch (Exception e){
            System.out.println("Exception occurred "+e);
        }



        System.out.println("Result is calculated :"+result);

        return result;
    }

    public static void main(String[] args) {

        Calculator obj= new Calculator();
        System.out.println("Object is created ");
        int result = obj.divide(10,0);

        System.out.println("DIVIDE is : "+result);


        String arr[]= {"Java","Java8","Spring ","Spring boot"};

        try {
            System.out.println(arr[5]);
        }
        catch (Exception e){

            System.out.println(e);
        }

        System.out.println("Array printed");


    }

}
