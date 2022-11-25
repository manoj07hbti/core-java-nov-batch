package conditional;

public class Dowhileloop {
    public static void main(String[] args) {
        // table of 5& 7
        int num = 5;
        int i = 1;
        int result;
        do {
            result = num * i;
            System.out.println(num + "*" + i + "=" + result);
            i++;
        } while (i <= 10);

        num = 7;
        i = 1;

        do {
            result = num * i;
            System.out.println(num + "*" + i + "=" + result);
            i++;
        }
        while (i <= 10);
        // even and odd
        i = 1;
        do {

            if (i % 2 == 0)
            {
                System.out.println(i + "even");
                i++;
            } else{
                System.out.println(i + "odd");
                i++;
            }
        } while (i <= 100);

        i=5;
       int fact=1;
        do{
            fact=fact*i;
            System.out.println("factorial of 5 is" +fact);
            i--;
        }while(i>0);


    }



    }

