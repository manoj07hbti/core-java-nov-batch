package calculator;

public class Prime {
    public void indivisible(int a){
      boolean isPrime=false;
      for (int i = 2;i<a;i++)
      {
          if(a%i==0){
              isPrime=false;
              break;
          }
          else{
              isPrime=true;
          }
      }
      if(isPrime){
          System.out.println("is prime no. :"+a);
      }
      else System.out.println("it is not a prime no.   :" +a);
    }

    public static void main(String[] args) {
        Prime obj= new Prime();
        obj.indivisible(97);
    }
}
