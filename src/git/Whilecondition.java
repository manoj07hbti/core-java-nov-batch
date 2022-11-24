package git;

public class Whilecondition {
    public static void main(String[] args) {
        int number=5;
        int i=1;
        int result;
        while(i<=10){
          result  =number*i;
            System.out.println(number+"*"+i+"="+result);
            i++;
        }
        number=6;
        i=1;
        while(i<=10){
            result=number*i;
            System.out.println(number+"*"+i+"="+result);
            i++;
        }
        i=0;
        while(i<=100){
            i++;
            if(i%2==0){
                System.out.println("even number "+i);
            }
            else{
                System.out.println("odd number "+i);
            }

        }

        int fact=1;
         i=5;
         while(i>0){
             fact=fact*i;
             i--;

         }
        System.out.println("fact of 5 is "+fact );





    }

}