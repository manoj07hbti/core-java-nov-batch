package git;

public class Dowhile {
    public static void main(String[] args) {
        int number=5;
        int i=1;
        int result;
        do{
            result=number*i;
            System.out.println(number+"*"+i+"=" +result);
                 i++;
        }
        while(i<=10);
        number=9;
        i=1;
        do{
            result=number*i;
            System.out.println(number+"*"+i+"=" +result);
            i++;
        }
        while(i<=10);


        //odd even

        do {
            if (i % 2 == 0) {
                System.out.println("even number " + i);

            } else {
                System.out.println("odd number " + i);
            }
            i++;
        }
        while(i<=100);

        // factorial
        i=5;
        int fact=1;
        do{
            fact=fact*i;
            i--;
            System.out.println("fact of 5 is "+fact);
        }
        while(i>0);





    }

}

