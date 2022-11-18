package dailyassignment;

public class ConditionalStatementIf {

    public static void main(String[] args) {

        // Syntax for if statement: if(condition expression){code}
        // Syntax for Variable :  Datatype  variable_name = value;

        int marks = 70;

      //  Apply  if statement

        if (marks>60){

           System.out.println("First division..........");

        }

      if(marks>50){

       System.out.println("Second division.........");

      }


      if(marks>33){


          System.out.println("Third division........");


      }


      // variable----price
        double price = 1050.50;

      if(price>1000){

       System.out.println("Product is costly........");


      }


      double price1 = 900.50;
      if(price1<1000){

       System.out.println("Product is not costly..........");


      }

      // variable----country
      String country = "India";
      if(country=="India"){

        System.out.println("A person belongs to India........");

      }


     String country1 = "America";
      if (country1 == "India"){

       System.out.println("A person belongs to India......");
        }

      if(country1!="India"){


        System.out.println("A person belongs to some other country........");


      }




    }


}
