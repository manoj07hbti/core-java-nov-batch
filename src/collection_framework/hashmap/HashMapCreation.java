package collection_framework.hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashMapCreation {

    // Syntax for method: access_specifier return_type function or method_name (parameter){code}

     public void demoHashMap (){

    // Syntax for HashMap : classname <datatype_key ,datatype_value> object_name = new classname <>();-----HashMap <datatype_key ,datatype_value> object_name = new HashMap<>();
    // HashMap is separate in collection because HashMap store data in a very different format: Key and Value
    // HashMap is a non synchronized class of the java collection framework

         HashMap <Integer,String> integerStringHashMap = new HashMap<>(); // created an object-----(integerStringHashMap)--- of HashMap <Integer,String> (it is called integer String of HashMap)

         // To add elements(data) in object------integerStringHashMap ,we will use put method
         // put_method : put(key,value);
         // Syntax for adding elements : object_name.put_method();   -----object_name.put(key,value);


         integerStringHashMap.put(1," Ankit");
         integerStringHashMap.put(2," Aryan");
         integerStringHashMap.put(3," Ajay");
         integerStringHashMap.put(4," Amman");
         integerStringHashMap.put(5," Abhishek");



         // To read elements (data) in HashMap ,we will use get method
         // get_method : get(key);
         // Syntax for reading elements : object_name.get_method(); --------object_name.get(key);

         System.out.println(" Printing the data at key : 1 "+integerStringHashMap.get(1));
         System.out.println(" Printing the data at key : 2 "+integerStringHashMap.get(2));
         System.out.println(" Printing the data at key : 3 "+integerStringHashMap.get(3));
         System.out.println(" Printing the data at key : 4 "+integerStringHashMap.get(4));
         System.out.println(" Printing the data at key : 5 "+integerStringHashMap.get(5));



        // To print the HashMap,we will use keySet method ,this method gives all the keys of HashMap as a collection Set
        // keySet_method = keySet();
        // Syntax for getting all keys of HashMap : object_name.keySet_method -------object_name.keySet();

         Set<Integer> keys =  integerStringHashMap.keySet(); // got all keys

         System.out.println(" Printing the keys :"+keys); // Printed all keys

         // Using Advanced for loop to print the data
         // Syntax for Advanced for_loop : for(DataType variable_name : collectionName/arrayName){code}

         for (Integer var : keys){

          System.out.println("Printing the data using Advanced for loop at key :"+var +" value :"+integerStringHashMap.get(var));

         }




    }

    // Main method to run program
    public static void main(String[] args) {

        // Step1 : Created an object of main class -----classname object_name = new classname ();
         HashMapCreation obj = new HashMapCreation();

        // Step2 : To call method -----object_name.method_name();

         obj.demoHashMap(); // There is no need to store the output because return_type is void
                            // void------no return type
    }





}
