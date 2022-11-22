package conditional_statement;

public class Multiple_And_Opratere_2 {

    public static void main(String[] args) {

        // SYNTAX True & True = True (1X1=1)

        int age= 20;
        String city = "Agra";
        if (age>18 & city=="Agra"){
            System.out.println("you can fill the job form....");
        }
        else {
            System.out.println("you can not fill the job form.");
        }

        // SYNTAX True & False = False (1X0=0)
        if ( age>18 & city=="Pune"){
            System.out.println("you can fill the job form.....");
        }
        else {
            System.out.println("you can not fill the job form..");
        }

        // SYNTAX False & True = False (0X1)
        if ( age<18 & city=="Agra"){
            System.out.println("you can fill the job form.......");
        }
        else {
            System.out.println("you can not fill the job form....");
        }

        // SYNTAX False & False = False (0X0=0)
        if ( age<18 & city=="Pune"){
            System.out.println("you can fill the job form........");
        }
        else {
            System.out.println("you can not fill the job form.....");
        }


    }
}
