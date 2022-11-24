package conditional;

public class Loopassignment {
    public static void main(String [] args){
     int num=5;
     int result;
     for(int i=1; i<=10; i++){
         result=num*i;
         System.out.println(num +"*"+i+"="+ result);

     }
     for(int i=1; i<=100; i++){
        if(i%2==0){
            System.out.println(i +"is"  +"even");
        } else{
            System.out.println(i +"is" +"odd");
        }


     }
     

    }
}
