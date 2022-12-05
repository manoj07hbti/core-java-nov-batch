package methods;

import javax.swing.plaf.nimbus.State;
import java.util.Scanner;

public class CountryStatePopulation {
    public static void main(String[] args) {
        Scanner result = new Scanner(System.in);

        System.out.println("Please Enter Your Country : ");
        String country = result.nextLine();

        System.out.println("Please Enter Your State  : ");
        String state = result.nextLine();

        System.out.println("Please Enter Area Pin-code : ");
        int pincode = result.nextInt();

        System.out.println("Please Enter Percentage of Population in Your Country : ");
        double population = result.nextDouble();

        System.out.println("You Address is XYZ Area "+state+ ", "+pincode+", "+country);
        System.out.println("Population of "+country+ " is : "+population+"%");


    }
}
