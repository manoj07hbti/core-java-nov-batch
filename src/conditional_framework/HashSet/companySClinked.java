package conditional_framework.HashSet;

import conditional_framework.model.Company;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class companySClinked {

    public  LinkedHashSet<Company> complinkedscanner(){

        //syntax -- LinkedHashSet<Datatype> objname = classname/collection<>();

        LinkedHashSet<Company> companyLinkedHashSet = new LinkedHashSet<>();

        //create class

        Scanner c1 = new Scanner(System.in);
        Scanner c2 = new Scanner(System.in);
        Scanner c3 = new Scanner(System.in);

        Scanner sc =new Scanner(System.in);

        String flag = "y";
        while (flag.equals("y")){

            System.out.println("Enter the name of company head ");
            String head = c1.nextLine();

            System.out.println("Enter the total workers in Company ");
            int totalworker = c2.nextInt();

            System.out.println("Enter the turnover of the company");
            double turnover = c3.nextDouble();

            Company C4 = new Company(head,totalworker,turnover);
            companyLinkedHashSet.add(C4);

            System.out.println("Press y to add more elements or press any key to exit ");
            flag = sc.nextLine();
            System.out.println("\n");

        }return companyLinkedHashSet;

    }

    public static void main(String[] args) {
        companySClinked obj = new companySClinked();

        LinkedHashSet<Company> data =obj.complinkedscanner();

        System.out.println("The details of the companies ------\n");

        for (Company var : data){
            System.out.println("Head = "+ var.getHead()+"\n Total Worker = " + var.getTotalworker()
                    + "\n Turnover"+ var.getTurnover());
        }
    }
}
