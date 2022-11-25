package array;

public class DoubleArray {

    public static void main(String[] args) {


      // Array : we can store group of similar data(a lot of similar data) in a single array
      // Syntax of Array : Datatype variable_name [] = {value 1,value2,value3,value4.................valueN};
      // variable_name -------arrayName
      // Symbol of Array : []

      // To make a Double Array print it using normal Index ,normal For loop and Advance For loop



        // Print Double Array using normal Index
        // Accessing Data------- arrayName[INDEX];

      double price [] = {13.5,20.1,40.6,70.8,60.0,10.1,30.2};

      System.out.println("Data at Index 0 is:"+ price[0]);
      System.out.println("Data at Index 1 is:"+ price[1]);
      System.out.println("Data at Index 2 is:"+ price[2]);
      System.out.println("Data at Index 3 is:"+ price[3]);
      System.out.println("Data at Index 4 is:"+ price[4]);
      System.out.println("Data at Index 5 is:"+ price[5]);
      System.out.println("Data at Index 6 is:"+ price[6]);



     // Print Double Array using normal For loop
     // Syntax of FOR LOOP: for(initialization; condition; increment/decrement){code}
     // Index of Array is starting from 0
     // Size or length of Array-------arrayName.length ----------price.length



      for(int i=0; i< price.length;i++ ){

      System.out.println("Printing the value of the array using For Loop at Index is "+i+ ":" + price[i]);


      };


        // Print Double Array using Advance For Loop
        // Syntax of Advance For Loop : for(Datatype variable_name : arrayName){code}
        // here variable_name or varName--------->var

        for(double var : price){

            System.out.println("Printing the value of the array using Advance For Loop at Index is " + var);
        }




    }


}
