package conditional_framework.HashMap;

import conditional_framework.model.Company;

import java.util.HashMap;

public class Advancehashmap {

    public HashMap<Integer, Company> advancemap (){

        //SYNTAX: HashMap <DATATYPE_Key, DATATYPE_Value> objName= new HashMap<>();
        HashMap<Integer, Company> companyHashMap = new HashMap<>();

        Company c1 = new Company("Sanjay",5000,77.88);
        Company c2 = new Company("sandeep",4000,55.67);
        Company c3 = new Company("Siddharth",4560,53.89);
        Company c4 = new Company("sandeep",4000,55.67);

        companyHashMap.put(1,c1);
        companyHashMap.put(2,c2);
        companyHashMap.put(3,c3);
        companyHashMap.put(4,c4);


        return companyHashMap;


    }

    public static void main(String[] args) {
        Advancehashmap obj = new Advancehashmap();
        HashMap<Integer, Company> companydata = obj.advancemap();
        System.out.println("The Details of the company ------->\n");

        for (Integer var : companydata.keySet()){
            System.out.println("* Head = "+companydata.get(var).getHead()+"\n   Total worker = "+ companydata.get(var).getTotalworker()
            +"\n   TurnOver = "+ companydata.get(var).getTurnover());
        }


    }
}
