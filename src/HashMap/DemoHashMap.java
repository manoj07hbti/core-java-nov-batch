package HashMap;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {

    public void createHashMap (){

        // SYNTAX :  HashMap <DATATYPE_key DATATYPE_value> objName = New ClassName();

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Sonu");
        map.put(2,"Mohit");
        map.put(3,"Ritu");
        map.put(4,"Rohit");
        map.put(5,"Aman");

        System.out.println("Printing all data with HashMap : " +map.get(3));
        System.out.println("Printing all data with HashMap : " +map.get(5));
        System.out.println("Printing all data with HashMap : " +map.get(4));
        System.out.println("Printing all data with HashMap : " +map.get(1));
        System.out.println("Printing all data with HashMap : " +map.get(2));


        // get all the keys using keySet();
        Set<Integer> keys=map.keySet();
        System.out.println("Printing all Keys HashMap : " +keys);

        for (Integer var : keys){
            System.out.println("printing all keys HashMap  : " + var + " Value : " + map.get(var));

        }

    }

    public static void main(String[] args) {
        //   SYNTAX: ClassName objName = new ClassName();

        DemoHashMap obj = new DemoHashMap();
        obj.createHashMap();
    }
}
