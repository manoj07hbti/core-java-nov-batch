package oops.inheritance;

import java.util.Scanner;

public class DPSSchool extends School implements SchoolInterface {
    @Override
    public double feesstructure() {
        Scanner feesscanner = new Scanner(System.in);
        System.out.print("Please enter Per Month Fees : ");
        double fees = feesscanner.nextDouble();
        fees = fees*12;

        return fees;

    }

    @Override
    public String sectionsorting() {
        Scanner sectionscanner = new Scanner(System.in);
        System.out.print("Enter Student Section : ");
        String section = sectionscanner.nextLine();
        return section;
    }

    public static void main(String[] args) {
        DPSSchool obj = new DPSSchool();
        String Name = obj.studentname();
        double fees = obj.feesstructure();
        String section = obj.sectionsorting();
        System.out.println("Student Name is : "+Name);
        System.out.println("Fess of DPS School : "+fees+" Rs./year");
        System.out.println("Section of Student : "+section);
    }
}
