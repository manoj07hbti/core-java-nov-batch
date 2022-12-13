package conditional_framework.HashSet;

import conditional_framework.model.Company;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class companyHashcode {

    public  LinkedHashSet<Company> companycode(){

        //syntax -- Hashset<datatype> objname = new classname/collection ();

        LinkedHashSet<Company> companyHashSet = new LinkedHashSet<>();

        Company c1 = new Company("Sanjay",6000,66.78);
        System.out.println("HashCode of Company 1 : " + c1.hashCode());

        Company c2 = new Company("Sandeep",4000,55.67);
        System.out.println("HashCode of Company 2 : " + c2.hashCode());

        Company c3 = new Company("Siddharth",4560,53.89);
        System.out.println("HashCode of Company 3 : " + c3.hashCode());

        Company c4 = new Company("Sandeep",4000,55.67);
        System.out.println("HashCode of Company 4 : " + c4.hashCode());

        Company c5 = new Company("Siddharth",4560,53.89);
        System.out.println("HashCode of Company 5 : " + c5.hashCode());


        companyHashSet.add(c1);
        companyHashSet.add(c2);
        companyHashSet.add(c3);
        companyHashSet.add(c4);
        companyHashSet.add(c5);

        return companyHashSet;

    }

    public static void main(String[] args) {
        companyHashcode obj = new companyHashcode();
        HashSet<Company> conpanyhcode =obj.companycode();

        //advance for loop
        for (Company var : conpanyhcode){
            System.out.println("Head = "+ var.getHead()
                    +"\n Total worker = "+var.getTotalworker()+"\n TurnOver = "+var.getTurnover());
        }
    }
}
