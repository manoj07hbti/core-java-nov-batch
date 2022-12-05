package method_class;

public class prime {
   public void prime(int num){
       for( int i=2; i<num; i++){
       if(  num %i==0 ){
           System.out.println("number is not prime: "+num);
           break;

           }
       else{
           System.out.println("number is prime "+num);

       }

       }


   }

    public static void main(String[] args) {
        prime obj=new prime();
        obj.prime(5);
        obj.prime(6);
    }


}
