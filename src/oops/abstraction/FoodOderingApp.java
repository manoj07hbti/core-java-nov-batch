package oops.abstraction;

import java.util.Scanner;

public class FoodOderingApp{

    public String person (){
        Scanner per = new Scanner(System.in);
        System.out.print("Enter person Name : ");
        String Name = per.nextLine();
        return Name;
    }
}
