package conditional_statments;

public class Andopretors {
    public static void main(String[]args){
      int marks=70;
      String  student = "Art";
      //True & true

        if ( marks>60 & student== "Art") {
            System.out.println("First division");
        }
        else{
    System.out.println("Not pass");
        }
//True & false

    student = "Math";
 if(  marks >48 & student=="english") {
    System.out.println("second division");
}
        else{
                System.out.println("Not pass");
         //false & true
          marks =33;
      if (marks>32 & student=="art "){
          System.out.println("Third division");
      }
    else{

}  System.out.println(" not pass");

            }
            }
            }






