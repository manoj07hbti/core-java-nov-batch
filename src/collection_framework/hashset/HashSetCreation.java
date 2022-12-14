package collection_framework.hashset;

import java.util.Scanner;
import java.util.HashSet;

public class HashSetCreation {

    //  Write a program to create a HashSet by user input------using Scanner

    // Syntax for Method: access_specifier return_type  function or method_name (parameter){code}

    public HashSet <String>  inputFromUser (){

     // return_type----HashSet <String>---------it is called the String of HashSet

     // Syntax for Generics : Classname <DataType> object_name = new Classname <DataType>();
     // Generics : It tells the data type of Collection
     // Collection---ArrayList ,HashSet ,LinkedHashSet ,TreeSet and HashMap
     // Syntax for HashSet : HashSet <DataType> object_name = new HashSet <DataType>();
     // HashSet---class
     // HashSet : It will automatically remove duplicates data and store only unique elements.
     // HashSet : it does not contain index ,so we can not use normal for loop to print the data ,but we can use Advanced for loop
     // But in this class will not use Advanced for loop because we are using while loop



       HashSet <String> stringHashSet = new HashSet<>(); // Created an object of HashSet class------stringHashSet (String of HashSet)

       // We will use the Scanner class because we want to input from the user

       // First , we will create an object of scanner class ----classname object_name = new classname (System.in);
       // System.in ------input stream -------reads the input from the keyboard


        Scanner scanner = new Scanner(System.in);

        String flag = "Y";  // We have taken a String variable
                            // Syntax for Variable : DataType variable_name = value;

     /* Using while loop for continue work
        Syntax for while loop : while(condition){
                                                   code;
                                                  increment(++) or decrement(--);
                                                  }
        */

        while (flag.equals("Y")){


         // First,we will write a message to enter the values from the user
           System.out.println("Please enter the values for the HashSet :");

         // Now ,we will store to entered values in a variable

        String value  =  scanner.nextLine(); // it will read String input data
                                              // object_name.method_name();
                                              // public String nextLine(){code}
                                              // In Scanner class----return type------String-----method------nextLine();
                                              // User will give input from the keyboard----user input---- stored it---- in a variable----value


      // We will add---- stored values--- in an object (stringHashSet)---- of--- String of HashSet (HashSet <String>)
      // For adding the data or value ---we will use add method -----add(value);
      // Syntax for add method : object_name .add(value);

        stringHashSet.add(value);


     // Again we will write a message

        System.out.println(" Press Y to add more elements or press any key to exit ");

        // reuse variable----flag
         flag = scanner.nextLine(); // stored it in flag variable

        }



       return stringHashSet; // Output



    }


    // Main method to run program
    public static void main(String[] args) {

     // Step1 : Created an object of class----classname object_name = new classname();
     HashSetCreation obj = new HashSetCreation();


     // Step2: To call method -----object_name.method_name();

      HashSet<String> result =  obj.inputFromUser(); // stored output-----in result variable


       // Print the values for the HashSet
        System.out.println(" HashSet is created by user  :"+result);




    }



}
