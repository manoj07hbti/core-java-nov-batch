package methods;

import java.util.Scanner;

public class DemoScanner {


    // Write a program to enter the country name ,number of states and population % in the state


    // main method
    public static void main(String[] args) {

        // Created  Object of Scanner Class ---------classname object_name = new classname(System.in);
        // input stream as a parameter----System.in
        Scanner scanner = new Scanner(System.in); // System.in---- reads the input data from keyboard

       // 1) Reading String data-------Country name

       // First we will write message
        System.out.println(" Please enter the country name :");

        String country_name = scanner.nextLine(); // reads String input data
                                                  // object_name.method_name
                                                  // output of the function------return type------String-----stored in------ String country_name
                                                  // String country_name---- Data type variable_name
                                                  // in Scanner Class , return type-------String-------method-----nextLine();
                                                  // public String nextLine(){code}----- it is already created by java we will use only method
        // print the value
        System.out.println("I have entered the country name is :"+country_name); // after this we will run the program


      // 2) Reading int data------number of states
        // First we will write message
        System.out.println(" Please enter the number of states :");

       int number_of_states =  scanner.nextInt(); // reads int input data
                                                  // object_name.method_name
                                                  // in Scanner Class , return type-------int-------method-----nextInt();
                                                  // public int nextInt(){code}----- it is already created by java we will use only method
                                                  // output of the function------return type------int-----stored in----- int number_of_states

        // print the value
        System.out.println("I have entered the number of states that is :"+number_of_states); // after this we will run the program


        // 3) Reading decimal data (double and float)------population % in the state

        // First we will write message
        System.out.println(" Please enter the population % in the state :");

        double population_percentage  =  scanner.nextDouble(); // reads double input data
                                                               // object_name.method_name
                                                               // in Scanner Class , return type-------double-------method-----nextDouble();
                                                               // public double nextDouble(){code}----- it is already created by java we will use only method
                                                               // output of the function------return type------double-----stored in---- double population_percentage


        // print the value
        System.out.println("I have entered the population percentage in the Uttar Pradesh state which is :"+population_percentage); // after this we will run the program




    }



}
