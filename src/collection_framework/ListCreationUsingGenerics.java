package collection_framework;

import java.util.ArrayList;

public class ListCreationUsingGenerics {

    // Syntax for Method: access_specifier  return_type  function or method_name (parameter){code}
    // Parameter----input parameter that is optional

    // Syntax for Generics : CollectionName <DataType> object_name = new CollectionName <DataType>();
    // CollectionName----------ArrayList
    // Syntax for creating an  object of the ArrayList Class through Generics: ArrayList <Data Type> object_name = new ArrayList <>();
    // Generics : it tells the data type



    // String List creation
    // Return type : ArrayList of String--------ArrayList<String>
    public ArrayList<String> createStringList(){


        ArrayList <String> cityName = new ArrayList<>(); // Created object of ArrayList class through Generics

        // Using add method:
        // add method : add(value);
        // Syntax for add method : object_name.add_method(); ----------------object_name.add(value);




        cityName.add("Agra");   // 0 index
        cityName.add("Kanpur");  // 0 index
        cityName.add("Mumbai"); // 2 index
        cityName.add("Pune");   // 3 index
        cityName.add("chennai");// 4 index

        return cityName; // output


    }

    // Double List Creation
    // Return type : ArrayList of Double--------ArrayList<Double>

    public ArrayList<Double> createDoubleList(){

      ArrayList<Double> employeeSalary = new ArrayList<>(); // Created object of ArrayList class through Generics

        // Using add method:
        // add method : add(value);
        // Syntax for add method : object_name.add_method(); ----------------object_name.add(value);


        employeeSalary.add(45000.50);  // 0 index
        employeeSalary.add(50500.68);  // 0 index
        employeeSalary.add(68900.60);  // 2 index
        employeeSalary.add(89500.90);  // 3 index
        employeeSalary.add(97680.58);  // 4 index


        return employeeSalary; // output

    }


    // Integer List Creation
    // Return type : ArrayList of Integer--------ArrayList<Integer>

    public  ArrayList<Integer> createIntegerList(){

     ArrayList<Integer> employeeAge = new ArrayList<>();  // Created object of ArrayList class through Generics

      // using add method

      employeeAge.add(24); // 0 index
      employeeAge.add(26); // 1 index
      employeeAge.add(27); // 2 index
      employeeAge.add(30); // 3 index
      employeeAge.add(31); // 4 index

      return employeeAge; // output


    }







     // Main method to run program
     public static void main(String[] args) {

      // Step1 : Created an object of class(ListCreationUsingGenerics )------Classname object_name = new Classname();

        ListCreationUsingGenerics obj = new ListCreationUsingGenerics();

     // Step2 : To call method -----object_name.method_name();


           ArrayList<String>result =  obj.createStringList();   // stored output in -------result variable

         // Using for loop
         // Syntax  for for_loop : for (initialization ; condition; increment or decrement){code}
         // Initialization ----int i = 0; because the index starts from 0
         // Get method : it is used to get or read the data or value
         // Syntax for Get method : object_name.get_method(); ---------------object_name.get(index);

         for(int i =0; i<result.size(); i++){


          System.out.println(" Printing the city name using for loop :"+ result.get(i) + "  at INDEX : "+i);


         }

        // Using Advanced for loop
        // Syntax for Advanced for loop : for ( Datatype  variable_name : collectionName/arrayName){code}

         for(String var : result){

          System.out.println("Printing the city name using Advanced for loop :"+var);

         }


         // Step2 : To call method -----object_name.method_name();

         ArrayList<Double>result1 =  obj.createDoubleList(); // stored output in -------result1 variable

         // Using for loop and Get method

         for(int i = 0; i<result1.size(); i++){

            System.out.println(" Printing the employee salary using for loop : "+result1.get(i)+ " at Index : "+i);

         }


         // Using Advanced for loop and Get method
         for (Double var : result1){

            System.out.println(" Printing the employee salary using Advanced for loop :"+var);


         }




         // Step2 : To call method -----object_name.method_name();
         ArrayList<Integer>result2 =  obj.createIntegerList(); // stored output in -------result2 variable


         // Using for loop and Get method

         for(int i = 0; i< result2.size(); i++){

             System.out.println(" Printing the employee age using for loop : "+result2.get(i)+ " at Index : "+i);

         }


         // Using Advanced for loop and Get method
         for (Integer var : result2){

             System.out.println(" Printing the employee age using Advanced for loop :"+var);


         }






     }







}
