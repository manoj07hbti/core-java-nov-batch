package collection_framework.treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetCreationUsingScanner {

  // Syntax for method: access_specifier return_type function or method_name (parameter){code}
  // Parameter-----input parameter that is optional

    public TreeSet <String>  inputFromUser (){

        // return_type----- TreeSet <String>-------- String of TreeSet

     // Syntax for Generics : classname <datatype> object_name = new classname <datatype>(); ----it is used to create an object of class of java collection framework
     // if we want to write syntax for ArrayList, HashSet,LinkedHashSet,TreeSet and HashMap then we will change only class name
     // ArrayList, HashSet,LinkedHashSet,TreeSet ,and HashMap .These are classes of java collection framework


     // Syntax for TreeSet : classname <datatype> object_name = new classname <datatype>();----TreeSet <datatype> object_name = new TreeSet <datatype>();
     // Unique elements with sorting (sequence)  : TreeSet

        TreeSet <String> stringTreeSet = new TreeSet<>(); // created an object of TreeSet of String-------stringTreeSet

        Scanner scanner = new Scanner(System.in); // Created Scanner Class object-------scanner
                                                  // Syntax for Scanner : classname object_name = new classname (System.in);
                                                  // System.in------input stream-----reads the data from the keyboard

        String flag = "Y"; // Syntax for Variable : Datatype variable_name = value;


        // Syntax for while loop : while(condition){ code;  increment(++); or decrement(--);  }

        while (flag.equals("Y")){


          // First,we will write a message

            System.out.println(" Please enter the employee name ");

            String employee_name =  scanner.nextLine(); // reads String input data -------nextLine()
                                                        // object_name.method_name();--------- scanner.nextLine();
                                                        // User will give input from the keyboard (it is called user input)--stored in--variable--employee_name
                                                        // In Scanner class ---return_type---String----method_name----nextLine();
                                                        // public String nextLine(){code}


            stringTreeSet.add(employee_name); // Added --- store user input(employee_name)---in object(stringTreeSet)----- of String of TreeSet
                                              // Used add method,Syntax for add method : object_name.add method-----object_name.add(value);


            System.out.println(" Please enter the employee ID ");
            String employee_id =  scanner.nextLine();
            stringTreeSet.add(employee_id);


            // Again,we will write a message

            System.out.println(" Please  press Y for adding more employee's names OR press any key to exit  ");

             flag =  scanner.nextLine();  // User will give input from the keyboard (it is called user input)--stored in--variable--flag
                                          // reuse variable-----flag

        }





        return stringTreeSet; // Output

    }


    // Main method to run program
    public static void main(String[] args) {

      // Step1 : Created an object of main class ( TreeSetCreation)-----classname object_name = new classname ();

        TreeSetCreationUsingScanner obj = new TreeSetCreationUsingScanner();


      // Step2 : To call method -----object_name.method_name();

       TreeSet <String>  result = obj.inputFromUser();


      // Print the employee's names and id  for TreeSet
       System.out.println(" TreeSet of Employee's Names and Id  is created by the user :"+result);


        // Print the employee's names and id  for TreeSet using Advanced for loop

        // Syntax for Advanced for loop: for (DataType variable_name : collectionName/arrayName){code}

       for (String var : result ){

           System.out.println(" TreeSet of Employee's Names and Id  is created by the user :"+var);
       }




    }




}
