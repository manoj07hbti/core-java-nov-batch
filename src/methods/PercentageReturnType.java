package methods;

public class PercentageReturnType {

    // Syntax for Method: access_specifier return_type method or function_name (parameter){code}
    // Syntax For Method : access_specifier return_type  method or function_name(DataType variable_name1,DataType variable_name2------DataType variable_nameN ){code}
    // Parameter--------an input parameter that is optional
    // Write a program to find the percentage of number ----------int percentage_of_number = (number * percent)/100
    // Return type---- out put of the function or method ---------int , input parameter------data type variable_name ---------int number

  public int percentage (int number){

      int percent = 10;

      int percentage_of_number = (number*10)/100;

      return percentage_of_number; // output of function--------percentage_of_number----------(number*10)/100



  }


    public int percentage1 (int number){

        int percent = 15;

       int percentage_of_number =  (number*15)/100;

        return percentage_of_number; // output of function--------percentage_of_number----------(number*10)/100



    }





    // Main method to run program
    public static void main(String[] args) {

        // Step1: created an object of class (PercentageReturnType)  ---------classname object_name = new class_name();
        PercentageReturnType obj  = new PercentageReturnType();

        // Step2: To call method-------object_name.method_name();

        int result = obj.percentage(100); // output of function-------percentage_of_number---- stored in---------result
        System.out.println("Percentage of 100 is :"+result);

        int result1 = obj.percentage(250);
        System.out.println("Percentage of 250 is :"+result1);


         int result2 =  obj.percentage1(300);
         System.out.println("Percentage of 100 is :"+result2);

         int result3 =  obj.percentage1(500);
         System.out.println("Percentage of 250 is :"+result3);










    }



}
