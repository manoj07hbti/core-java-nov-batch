package collection_framework.hashset;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetCreationUsingScanner {

    // Syntax for method: access_specifier return_type function or method_name (parameter){code}

    public  LinkedHashSet <String> inputFromUser (){

     // return_type----- LinkedHashSet <String>-------- String of LinkedHashSet

     // Syntax for LinkedHashSet : LinkedHashSet <dataType> object_name = new  LinkedHashSet <dataType>(); ----------classname <datatype> object_name = new classname <datatype>();
     // Unique elements with insertion order : LinkedHashSet

        LinkedHashSet <String> stringLinkedHashSet = new LinkedHashSet<>(); // created an object of  LinkedHashSet of String------stringLinkedHashSet

        Scanner scanner = new Scanner(System.in);   // Created Scanner Class object-------scanner
                                                    // Syntax for Scanner : classname object_name = new classname (System.in);
                                                    // System.in------input stream-----reads the data from the keyboard

        String flag = "Y"; // Syntax for Variable : Datatype variable_name = value;

        while (flag.equals("Y")){


           // First,we will write message
           System.out.println(" Please enter the Employee Name ");
           String employee_name = scanner.nextLine();// reads String input data
                                                    // User will give input from the keyboard (it is called user input)--stored in--variable--employee_name

           stringLinkedHashSet.add(employee_name);   // Added --- store user input(employee_name)---in object(stringLinkedHashSet)----- of String of LinkedHashSet
                                                    // Used add method,Syntax for add method : object_name.add method-----object_name.add(value);



            System.out.println(" Please enter the Employee Department ");
            String employee_department = scanner.nextLine();
            stringLinkedHashSet.add(employee_department);


            System.out.println(" Please enter the Employee Email Address ");
            String employee_email_address = scanner.nextLine();
            stringLinkedHashSet.add(employee_email_address);


            // Again ,we will write message
            System.out.println(" Please press Y for adding the more elements  OR press any key to exit");

              flag = scanner.nextLine(); // User will give input from the keyboard (it is called user input)--stored in--variable--flag
                                         // reuse variable-----flag

        }


             return stringLinkedHashSet; // Output
    }


        // Main method to run program
        public static void main(String[] args) {

        // Step1 : Created an object of main class -----classname object_name = new classname ();

        LinkedHashSetCreationUsingScanner obj = new LinkedHashSetCreationUsingScanner();


            // Step2 : To call method -----object_name.method_name();

        LinkedHashSet<String> result =    obj.inputFromUser(); // Output ---stored in------a variable----result
                                                               // variable ----result----- of-----String of LinkedHashSet



          // Print the Employee detail
          System.out.println(" LinkedHashSet of Employee name ,department and email address is created by the user " +result);



            // Print the Employee detail using Advanced for loop
            // Syntax for Advanced for loop: for (DataType variable_name : collectionName/arrayName){code}

            for(String var : result){

              System.out.println(" LinkedHashSet of Employee name ,department and email address is created by the user " +var);

          }



        }



}
