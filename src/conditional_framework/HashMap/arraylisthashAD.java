package conditional_framework.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class arraylisthashAD {

    public HashMap<Integer, ArrayList<String>> hashmapadvance (){

        //SYNTAX: HashMap <DATATYPE_Key, DATATYPE_Value> objName= new HashMap<>();

        HashMap<Integer, ArrayList<String>> advancemap = new HashMap<>();

        //create array list

        ArrayList<String> stringArrayList= new ArrayList<>();

        stringArrayList.add("Sandeep");
        stringArrayList.add("RAhul");
        stringArrayList.add("Punjab");

        ArrayList<String> country = new ArrayList<>();

        country.add("INDIA");
        country.add("Pakistan");
        country.add("London(UK)");

        //for insertion/add (use .put)

        advancemap.put(1,stringArrayList);
        advancemap.put(2,country);

        return advancemap;

    }

    public static void main(String[] args) {
        arraylisthashAD obj = new arraylisthashAD();
        HashMap<Integer, ArrayList<String>> dataarray =obj.hashmapadvance();

        for (Integer var : dataarray.keySet()){

            System.out.println(dataarray.get(var));
        }

    }
}
