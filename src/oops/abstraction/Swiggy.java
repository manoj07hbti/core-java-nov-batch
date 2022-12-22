package oops.abstraction;

import java.util.Scanner;

public class Swiggy extends FoodOderingApp implements Foodpayment{
    @Override
    public int Discount() {
        Scanner dis = new Scanner(System.in);
        System.out.print("Your discount is 40 % : ");
        int Name = dis.nextInt();
        return Name;


    }

    @Override
    public double Deliverycharges() {
        Scanner dil= new Scanner(System.in);
        System.out.println("Your delivery charges are :");
        double money= dil.nextDouble();
        return money;


    }

    @Override
    public String Offer() {
        Scanner sunday=new Scanner(System.in);
        System.out.println("The offer of this sunday is :");
        String sun=sunday.nextLine();
        return sun;

    }

    public static void main(String[]args){           // we have to name string int double objects(Name,dis,off,dil any) to make them print after the vale put in scanner
        Zomato obj=new Zomato();
        String Name= obj.person();
        int dis= obj.Discount();
        String off=obj.Offer();
        double dil= obj.Deliverycharges();

        System.out.println(" your name is :"+ Name);
        System.out.println(" your Discount is :"+ dis);
        System.out.println(" your Offer is :"+ off);
        System.out.println(" your Delivery charges  is :"+ dil);
    }



}
