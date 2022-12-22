package oops.abstraction;

import java.util.Scanner;

public class ToyCompany extends Company {
    @Override
    public void salary() {


    }

    @Override
    public void holiday() {


    }

    @Override
    public void shift() {


    }

    public static void main(String[] args) {

        System.out.println("Welcome Toy manufacturing sector of india ");

        ToyCompany obj = new ToyCompany();

        obj.companyname();
        obj.employename();
        obj.department();
        obj.shift();
        obj.holiday();
        obj.salary();

   Scanner scanner= new Scanner(System.in);
        System.out.println("The name of the company is :");
        String name=scanner.nextLine();

        System.out.println("The department of employ is:");
        String dep=scanner.nextLine();

        System.out.println("The shift of employ is:");
        int sift=scanner.nextInt();


        System.out.println("The number of holiday  of emplay is:");
        int holiday=scanner.nextInt();



        System.out.println("The Salary of emplay is:");
        double sal=scanner.nextDouble();

    }
    }

