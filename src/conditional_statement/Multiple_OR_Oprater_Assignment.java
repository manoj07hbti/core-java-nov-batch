package conditional_statement;

public class Multiple_OR_Oprater_Assignment {
    public static void main(String[] args) {

        // True || True = True (1X1=1)
        int age =20;
        String car = "Scorpio";
        if (age>18 || car=="Scorpio"){
            System.out.println("You can drive this car....");
        }
        else {
            System.out.println("You can not drive this car.");
        }

        // True || false = True (1X0=1)
        car="Boleno";
        if (age>18 || car=="Scorpio"){
            System.out.println("You can drive this car......");
        }
        else {
            System.out.println("You can not drive this car.");
        }

        // False || True = True (0X1=1)
        age =10;
        car="Boleno";
        if (age<18 || car=="Scorpio" ){
            System.out.println("You can drive this car.");
        }
        else {
            System.out.println("You can not drive this car.");
        }

        // False || False = False (0X0=0)
        age =10;
        car = "Boleno";
        if (age>18 || car=="Scorpio"){
            System.out.println("You can drive this car.");
        }
        else {
            System.out.println("You can not drive this car..");
        }



    }

}
