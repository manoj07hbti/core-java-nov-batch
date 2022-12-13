package conditional_framework.HashSet;

import conditional_framework.model.Company;

import java.util.HashSet;

public class companyHash {

    public HashSet<Company> companyhashset(){

        // HashSet <data type > obj name = new classname/collection<>();

        HashSet<Company> companyHashSet = new HashSet<>();

        Company c1 = new Company("Sanjay",5000,77.88);
        Company c2 = new Company("sandeep",4000,55.67);
        Company c3 = new Company("Siddharth",4560,53.89);
        Company c4 = new Company("sandeep",4000,55.67);
        Company c5 = new Company("Siddharth",4560,53.89);

        companyHashSet.add(c1);
        companyHashSet.add(c2);
        companyHashSet.add(c3);
        companyHashSet.add(c4);
        companyHashSet.add(c5);

        return companyHashSet;

    }

    public static void main(String[] args) {
        companyHash obj = new companyHash();
        HashSet <Company> companyhashset =obj.companyhashset();

        //advance for loop
        for (Company var : companyhashset ){
            System.out.println("Head = "+ var.getHead()
                    +"\n Total worker = "+var.getTotalworker()+"\n TurnOver = "+var.getTurnover());
        }

    }
}
