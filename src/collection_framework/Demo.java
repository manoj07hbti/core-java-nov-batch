package collection_framework;

import java.util.ArrayList;

public class Demo {

    // Syntax for Method: access_specifier return_type function or method_name (parameter){code}
    // parameter----input parameter that is optional

    public  void  demo(){


    //   String student_name = "Ankit";
    //   int student_age = 24;
    //   int student_roll_no = 5;
    //   String student_branch = "CS";
    //   String student_email_address = "abc1234@gmail.com";
    //   String student_city = "Mumbai";
    //   String student_institute ="XYZ";
    //   double student_fee  = 75600.98;
    //   String student_division = "First Division";
    //   String student_sport = "Cricket";



       // First , we will create an object of ArrayList class
       // Syntax for object creation of class : classname object_name = new classname ();

       ArrayList arrayList = new ArrayList();

        // We will add 10 data  or values to the object------object_name.add_method-------------object_name.add(value);
        // for adding the data ,we will use add method
        // add_method : add(value);
        // Syntax for add_method : object_name.add_method---------object_name.add(value);

        arrayList.add("Ankit"); // 0 index
        arrayList.add(24); // 1 index

        arrayList.add(5);  // 2 index
        arrayList.add("CS"); // 3 index

        arrayList.add("abc1234@gmail.com"); // 4 index
        arrayList.add("Mumbai"); // 5 index

        arrayList.add("XYZ"); // 6 index
        arrayList.add(75600.68); // 7 index

        arrayList.add("First Division"); // 8 index
        arrayList.add("Cricket"); // 9 index


        // get method-----it is used to read or get the value or data
        // get_method : get(index);
        // For getting the data at index  and  Syntax  for  get_method : object_name.get_method ---------object_name.get(index);



        // Print the data using index

        System.out.println("Printing Data at index  0 :"+arrayList.get(0));
        System.out.println("Printing Data at index  1 :"+arrayList.get(1));
        System.out.println("Printing Data at index  2 :"+arrayList.get(2));
        System.out.println("Printing Data at index  3 :"+arrayList.get(3));
        System.out.println("Printing Data at index  4 :"+arrayList.get(4));

        System.out.println("Printing Data at index  5 :"+arrayList.get(5));
        System.out.println("Printing Data at index  6 :"+arrayList.get(6));
        System.out.println("Printing Data at index  7 :"+arrayList.get(7));
        System.out.println("Printing Data at index  8 :"+arrayList.get(8));
        System.out.println("Printing Data at index  9 :"+arrayList.get(9));


        // Print the size of arrayList
        System.out.println("Printing the size of arrayList :"+arrayList.size());




        // Print the all data using for loop
       // Syntax of for_loop : for (initialization; condition; increment or decrement){code}

       for(int i=0; i<arrayList.size(); i++){

       System.out.println("Printing the data using for loop : "+arrayList.get(i) + " at Index :"+i);

       }


       // Print the  data using Advanced for loop
       // Syntax of Advanced _for_loop : for (DataType variable_name : collectionName/arrayName){code}
       // Advanced_for_loop : It is used in both Collection and Array
       // Datatype-----object -----it means -------it consists all things like String ,int ,double and float
       // In this loop, all data of arrayList will store in var (variable)

       for ( Object var : arrayList){

          System.out.println("Printing the data using Advanced for loop :"+var);


       }


        // remove method : It is used to remove or delete the data from the arrayList
        // when we will remove the data from the arrayList the index also will change
        // At one time only one data will remove from arrayList
        // remove_method : remove(index);
        // Syntax for remove_method : object_name.remove_method  ------------------arrayList.remove(index);

        arrayList.remove(3); // remove method


       System.out.println(" Data after removing  index 3  : ");

       //Print the  data using for loop

        for (int i = 0; i<arrayList.size(); i++) {

            System.out.println("Printing the data using for loop :" + arrayList.get(i) + " at Index :"+i);

        }


        //Print the  data using  Advanced for loop

        for (Object var : arrayList){

            System.out.println("Printing the data using Advanced for loop :" + var);
        }



        arrayList.remove(5);  // remove method

        System.out.println(" Data after removing  index 5  : ");

        //Print the data using for loop

        for (int i = 0; i<arrayList.size(); i++) {

            System.out.println("Printing the data using for loop :" + arrayList.get(i) + " at Index :"+i);

        }


        //Print the data using  Advanced for loop

        for (Object var : arrayList){

            System.out.println("Printing the data using Advanced for loop :" + var);
        }



    }

    // Main method to run program
    public static void main(String[] args) {

     // Step1: Created an object of class--------classname object_name = new classname();

        Demo obj = new Demo();

     // Step2: To call method--------object_name.method_name();

        obj.demo();


    }




}
