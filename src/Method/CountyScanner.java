package Method;

import java.util.Scanner;

public class CountyScanner {


    public static void main(String[]args){

        Scanner country=new Scanner(System.in);

        System.out.println("Enter ur country name");
        String name=country.nextLine();

        System.out.println("Enter ur state  name");
         String place= country.nextLine();

        System.out.println("Enter ur zip code");
        int zip=country.nextInt();


        System.out.println("Enter ur Package amount:");
        double price=country.nextDouble();


        System.out.println("YOUR country name"+name);
        System.out.println(" YOUR State name:"+place);
        System.out.println("YOUR ur zip is :"+zip);
        System.out.println("YOUR pakage amount to:"+price);

    }

}
