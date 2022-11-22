package conditional_statments;

public class Not_operetor_assignment {
    public static void main(String[] args) {

        int age = 25;
        if (!(age>20)) {
            System.out.println("Eligible for posting");
        } else {
            System.out.println("Not eligible for posting");
        }
        String city = "Delhi";
        if  (city !=  "Delhi") {


            System.out.println("Eligible for posting");
        }
         else {
            System.out.println("Not eligible for posting");

            int marks=72;
        if(!(marks>60)){
            System.out.println("First division");
        }
        else{
            System.out.println("Not good perfomance in study");
        }
        }
    }
}