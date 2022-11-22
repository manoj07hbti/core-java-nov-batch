package conditional_statement;

public class Not_Operator {

    public static void main(String[] args) {

        int age = 20;
        if (  ! (age>18 ) ) {
            System.out.println("You can fill the job form.....");

        }
        else {
            System.out.println("You can not fill the job form...");
        }


        if ( ! ( age<18 ) ) {
            System.out.println("You can fill the job form.....");
        }
        else {
            System.out.println("You can not fill the job form......");
        }


        if ( age != 0 ) {
            System.out.println("My runs are zero in circket match..");
        }
        else {
            System.out.println("My runs are not zero in cricket match..");
        }


        String city = "Agra";
        if ( !( city == "Agra")){
            System.out.println("You can go to Agra..........");
        }
        else {
            System.out.println("You can not go to Agra.......");
        }


        if (!(city == "Pune")) {
            System.out.println("You can go to Agra...........");
        }
        else {
            System.out.println("You can not go to Agra.......");
        }

        if (!(age>18 & city=="Agra")){
            System.out.println("You can go to Agra if you are 18 years old...");
        }
        else {
            System.out.println("You can not go to Agra if you are not 18 years old...");
        }








    }


}
