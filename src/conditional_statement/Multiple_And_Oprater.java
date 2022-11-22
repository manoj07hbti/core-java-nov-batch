package conditional_statement;

public class Multiple_And_Oprater {

    public static void main(String[] args) {

        int age = 20;
        String city = "Agra";

        // True & True = True (1X1=1)
        if ( age>18 & city=="Agra"){
            System.out.println("you can go to Agra...........");
        }
        else {
            System.out.println("you can not go to Agra....");
        }

        // True & False = False (1X0=0)
        if ( age>18 & city=="Jaipur"){
            System.out.println("you can go to Jaipur .............");
        }
        else {
            System.out.println("you can not go to Jaipur......");
        }

        // False & True = False (0X1=0)
        if (age<18 & city =="Agra"){
            System.out.println("i am goint to Agra.............");
        }
        else {
            System.out.println("i am not going to Agra...........");
        }

        // False & False = False (0X0=0)
        if (age<18 & city=="Pune"){
            System.out.println("i am going to Pune..........");
        }
        else {
            System.out.println("i am not going to Pune...........");
        }
    }
}



