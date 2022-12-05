package method_class;

public class armstrongmethod {
    public void armstrongnumber(){

      int number =153;
      int original,remainder;
      int result=0;
      original=number;
      while(number!=0){
          remainder=original%10;
          result =result + (remainder*remainder*remainder);
          original= original/10;
          if(result==number){
              System.out.println("number is palindrome");
          }
          else{
              System.out.println("number is not palindrome");
          }
      }
    }

    public static void main(String[] args) {
        armstrongmethod obj=new armstrongmethod();
        obj.armstrongnumber();


    }
}
