package Exception;

public class calculator {
    public double divide (int a , int b) {
        System.out.println("divide method started ");
        double result = (double) a / b;
        return result;
    }

    public static void main(String[] args) {
        calculator obj = new calculator();
        double result = obj.divide(259, 0);
        System.out.println("divide is :" + result);
        String arr[] = {"java", "spring", "spring boot", "hibernate",};
        try {
            System.out.println(arr[5]);
        } catch (Exception e){
        System.out.println(e);
    }
        System.out.println("arraylist printed" );

    }
}
