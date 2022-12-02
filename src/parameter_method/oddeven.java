package parameter_method;

public class oddeven {
    public void oddeven(int num){
       if(num%2==0){
           System.out.println("number is even");
       }
       else{
           System.out.println("number is odd");
       }
    }

    public static void main(String[] args) {
        oddeven obj=new oddeven();
        obj.oddeven(54);
        obj.oddeven(89);

    }




}
