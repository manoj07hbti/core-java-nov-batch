package Exception;

public class Exceptionhandling {
    public static void main(String[] args) {
        String arr[]= {"Java","Java8","Spring ","Spring boot"};

        try {
            System.out.println(arr[5]);

        }
        catch (Exception e){

            System.out.println(e);
        }
        try {
            System.out.println(arr[8]);

        }
        catch (Exception e){

            System.out.println(e);
        }

        System.out.println("Array printed");
    }
}
