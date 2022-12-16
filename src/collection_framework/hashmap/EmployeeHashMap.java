package collection_framework.hashmap;

import collection_framework.model.Employee;

import java.util.HashMap;

public class EmployeeHashMap {

      // Syntax for method: access_specifier return_type function or method_name (parameter){code}

       public HashMap <Integer ,Employee> createEmployeeHashMap (){


       // return_type----HashMap <Integer ,Employee> --------- integer Employee HashMap


      // Syntax for HashMap : HashMap <DataType_key ,DataType_value> object_name = new HashMap <>();

           HashMap <Integer ,Employee> integerEmployeeHashMap = new HashMap<>(); // Created an object-----integerEmployeeHashMap-- of integer Employee HashMap

        // Created Employee data using parameterized constructor
           Employee employee1 = new Employee("Aryan",24,"CS",2,45000.98);
           Employee employee2 = new Employee("Ajay",25,"IT",3,50000.689);
           Employee employee3 = new Employee("Abhishek",26,"Civil",4,55500.980);
           Employee employee4 = new Employee("Ankit",27,"EC",5,68000.789);
           Employee employee5 = new Employee("Akshay",28,"IT",6,75890.900);
           Employee employee6 = new Employee("Ankita",25,"CS",10,65000.980);
           Employee employee7 = new Employee("Anubhav",30,"EC",11,56000.780);



       // Now, we will add created Employee data in object---- integerEmployeeHashMap--- of integer Employee HashMap
       // For adding Employee data we will use put method
       // put _method : put (key,value);
       // Syntax for adding Employee data in object with put method : object_name.put_method ------object_name.put(key ,value);


          integerEmployeeHashMap.put(1,employee1);
          integerEmployeeHashMap.put(2,employee2);
          integerEmployeeHashMap.put(3,employee3);
          integerEmployeeHashMap.put(4,employee4);
          integerEmployeeHashMap.put(5,employee5);



        /* Properties of HashMap :
          1) Hashmap can allow only a single null as a key ,and it will be at zero index
          2) HashMap will never store a duplicate key , if we try to add a duplicate key then it will replace the value with the latest value
         */

           // 1) Hashmap can allow only a single null as a key ,and it will be at zero index

          integerEmployeeHashMap.put(null,employee6);

          System.out.println(" Printing the HashMap after taking the null key:"+integerEmployeeHashMap); // First ,will print ---null(6),1, 2, 3, 4, 5

          // 2) HashMap will never store a duplicate key , if we try to add a duplicate key then it will replace the value with the latest value

          integerEmployeeHashMap.put(4,employee7); // Duplicate key 4 used


          System.out.println(" Printing the HashMap after using the duplicate key 4 :"+integerEmployeeHashMap); // First ,will print ---null(6),1, 2, 3, 4(replace the value with the latest value---7), 5



          return integerEmployeeHashMap; // Output

   }



   // Main method to run program
   public static void main(String[] args) {

    // Step1 : Created an object of class------classname object_name = new classname ();

    EmployeeHashMap employeeHashMap = new EmployeeHashMap();


    // Step2 : To call method -------object_name.method_name();

    HashMap<Integer,Employee>  employeeHashMap1 =  employeeHashMap.createEmployeeHashMap(); // We have taken a variable------ employeeHashMap1
                                                                                            // Stored the Output in---employeeHashMap1  variable of HashMap<Integer,Employee>


       // Used Advanced for loop
       // Syntax for Advanced for loop : for (DataType Variable_name : collectionName/arrayName){code}
       // For getting all the keys of HashMap as a set of collection,we will use keySet method
       // keySet_method : keySet();
       // Syntax for getting  all the keys of HashMap with keySet_method : variable_name.keySet();


       for(Integer var : employeeHashMap1.keySet()){

        // All the keys will store in var


          // System.out.println(" Printing the all the keys :"+var); // It will print all the keys

           System.out.println(" Printing the Employee Name :"+employeeHashMap1.get(var).getName() +"  Age :"+employeeHashMap1.get(var).getAge()+"  Department :"+employeeHashMap1.get(var).getDepartment()+"  Id :"+employeeHashMap1.get(var).getId()+"  Salary :"+employeeHashMap1.get(var).getSalary());



       }




   }





}
