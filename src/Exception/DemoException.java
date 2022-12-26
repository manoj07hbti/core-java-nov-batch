package Exception;

public class DemoException {
    public int divide (int a, int b){
        System.out.println("It's dividing");
        int digit = 0;
        try {
            digit = a / b;
        }
        catch (Exception e){
            System.out.println("Exception Occurred:"+e );
        }
        finally {
            System.out.println("This is a finally block, it work always if your code have exceptions or not");
        }
        System.out.println("result is calculated : " + digit );

       return digit;
    }
    // index Exception
    public void index() {
        String arr[] = {"Java", "Python", "Spring", "Php"};

        try {
            System.out.println(arr[8]);
        } catch (Exception a) {

            System.out.println(a);
        }

        System.out.println("Array printed");


    }
    public static void main(String[] args) {
        DemoException obj = new DemoException(); // object is created
        int  digit  = obj.divide(10,0) ;
        System.out.println("Divide is :"+ digit);
        obj.index();
        }
    }

