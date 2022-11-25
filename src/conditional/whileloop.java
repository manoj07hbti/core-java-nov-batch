package conditional;

public class whileloop {
    public static void main(String[] arge){
        //table f 5
        int num=5;
        int i=1;
        int result;
        while(i<=10){
            i++;
            result=num*i;
            System.out.println("num" +"*" +i +"=" +result);

        }
      // even and odd number
       i=1;
        while(i<=100){
            i++;
            if (i%2==0){
                System.out.println( i +"is even");
            } else{
                System.out.println(i +"isodd");
            }

        }
      int fact=1;
        i=5;
        while(i>0){
            fact=fact*i;
            i--;
        }
        System.out.println("factorial of 5 is"+fact);


    }
}
