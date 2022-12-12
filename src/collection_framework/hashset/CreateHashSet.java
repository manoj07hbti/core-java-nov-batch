package collection_framework.hashset; //package.subpackage;

import java.util.HashSet;

public class CreateHashSet {

   /* Class_name : CreateHashSet
      Syntax for Method: access_specifier   return_type   function or method_name(parameter){code}
      Parameter-----an input parameter that is optional
      HashSet : It is a class
      HashSet  : It will automatically remove duplicates data and store only unique element.
      Generics : It tells the data type ,and We can hold only a single type of objects in generics. It does not allow the storage of other objects.
      Syntax for Generics : Classname <DataType> object_name = new Classname <DataType>(); ----it is used to create the object of class
      HashSet : It does not contain index ,so we can not use normal for_loop ,but we will use Advanced for_loop for it
      HashSet : It does not maintain the order of its elements.Hence, sorting of HashSet is not possible.
     */


    // Write a program to create a HashSet of String,Integer, Double ,and Float

    // Syntax for Method: access_specifier   return_type   function or method_name(parameter){code}

    // 1) CreateStringHashSet

    public  HashSet <String>  createStringHashSet(){


        // return_type-----------HashSet <String> ------------HashSet of String


        // Syntax for HashSet : Classname <DataType> object_name = new Classname <DataType>(); -----HashSet <DataType> object_name = new HashSet <DataType>();

        HashSet <String>  stringHashSet = new HashSet<>(); // created String HashSet

        // We will add String data in stringHashSet and stringHashSet is an object of HashSet of String( HashSet <String>)
        // Used add method -----add(value);
        // Syntax for add method : object_name.add(value);

        stringHashSet.add("Java");
        stringHashSet.add("Spring");
        stringHashSet.add("Spring Boot");
        stringHashSet.add("Microservices");
        stringHashSet.add("Cloud");


        // Duplicate Data

        stringHashSet.add("Spring Boot");
        stringHashSet.add("Microservices");




        return stringHashSet; // output



    }

    // 2) CreateIntegerHashSet
    public HashSet <Integer> createIntegerHashSet (){


        HashSet <Integer> integerHashSet = new HashSet<>(); // created Integer HashSet

        integerHashSet.add(20);
        integerHashSet.add(21);
        integerHashSet.add(22);
        integerHashSet.add(23);
        integerHashSet.add(34);

        // Duplicate Data
        integerHashSet.add(20);
        integerHashSet.add(21);
        integerHashSet.add(22);
        integerHashSet.add(23);
        integerHashSet.add(34);


        return integerHashSet; // output


    }


    // 3) CreateDoubleHashSet

    public  HashSet <Double>  createDoubleHashSet (){

      HashSet <Double> doubleHashSet = new HashSet<>(); // created Double HashSet

      doubleHashSet.add(23.50);
      doubleHashSet.add(45.68);
      doubleHashSet.add(68.90);
      doubleHashSet.add(65.28);
      doubleHashSet.add(78.24);

      // Duplicate Data
      doubleHashSet.add(68.90);
      doubleHashSet.add(65.28);
      doubleHashSet.add(78.24);


        return doubleHashSet; // output

    }

    // 4) CreateFloatHashSet

    public HashSet <Float> createFloatHashSet (){

       HashSet <Float>  floatHashSet = new HashSet<>(); // created Float HashSet

        floatHashSet.add(23.506890f);
        floatHashSet.add(45.6f);
        floatHashSet.add(98.56f);
        floatHashSet.add(100.5f);

        // Duplicate Data
        floatHashSet.add(98.56f);
        floatHashSet.add(100.5f);



        return floatHashSet;

    }







    // Main Method to run program
    public static void main(String[] args) {

       // Step1 : Created an object of class (CreateHashSet) --------classname  object_name = new classname ();
        CreateHashSet obj = new CreateHashSet();

       // Step2 : To call method ---- object_name.method_name();
       HashSet<String> result =  obj.createStringHashSet();   // Taken a variable ------result ----of HashSet of String ( HashSet<String>)
                                                             // Stored the output in -------result variable


        // Print the data using Advanced for loop and
        // Syntax for Advanced for_loop : for (DataType Variable_name  : collectionName/arrayName){code}

        for(String var : result){

          // Output (String data) have stored in the result variable but now String data will store in the var variable one by one .



          System.out.println("Printing the String Data :"+var); // HashSet has automatically removed repeat or duplicate data and stored only unique element


        }


        // Step2 : To call method ---- object_name.method_name();

      HashSet<Integer> result1 =  obj.createIntegerHashSet(); // Taken a variable ------result1 ----of HashSet of Integer ( HashSet<Integer>)
                                                              // Stored the output in -------result1 variable


        for(Integer var : result1){

            System.out.println("Printing the Integer Data :"+var);


        }


        // Step2 : To call method ---- object_name.method_name();

       HashSet <Double> result2 =  obj.createDoubleHashSet(); // Taken a variable ------result2 ----of HashSet of Double ( HashSet <Double>)
                                                               // Stored the output in -------result2 variable


        for(Double var : result2){

            System.out.println("Printing the Double Data :"+var);


        }


        // Step2 : To call method ---- object_name.method_name();

        HashSet <Float> result3 = obj.createFloatHashSet(); // Taken a variable ------result3 ----of HashSet of Float ( HashSet <Float>)
                                                            // Stored the output in -------result3 variable


        for(Float var : result3){

            System.out.println("Printing the Float Data :"+var);


        }



    }



}
