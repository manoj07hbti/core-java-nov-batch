package conditional;

public class Andoperator {
    public static void main(String[] args){
     int age=19;
     String city="agra";
     if(age>18 & city=="agra"){
         System.out.println("eligible for voting in agra" );
     } else{
         System.out.println("not eligible for voting" );
     }
     age=19;
      city="delhi";
      if(age>18 & city=="agra"){
          System.out.println("eligible for voting in agra");
      }
      else{
          System.out.println("not eligible for voting in agra");
      }
      age=14;
      city="agra";
      if(age>18 & city=="agra"){
          System.out.println("eligible for voting in agra");
      } else{
          System.out.printf("not eligible for voting in agra");
      }
      age=12;
      city="delhi";
      if(age>18 & city=="agra"){
          System.out.println("eligible for voting in agra");
      } else{
          System.out.println("nt eligible for voting in agra");

      }


    }




}
