package Scanner;

import java.util.Scanner;

public class Population_percantage {


    public double populatio(int a, int b) {
        double result= a / b;

        return result;
    }



        public static void main(String[] args) {

            // To creating  Scanner object

            Scanner Scanner = new Scanner(System.in);
            System.out.println("Please enter of value : ");
            double a= Scanner.nextInt();
            // For reading data


            String population = Scanner.nextLine();
            System.out.println("population is :" +a);


            System.out.println("Please enter value :");
            double b= Scanner.nextInt();

            String Population = Scanner.nextLine();
            System.out.println("population is :" + b);

        }
    }
