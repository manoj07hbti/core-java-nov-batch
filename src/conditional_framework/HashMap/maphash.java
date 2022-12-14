package conditional_framework.HashMap;

import java.util.HashMap;
import java.util.Set;


public class maphash {

    public void createmaphash(){

        //SYNTAX: HashMap <DATATYPE_Key, DATATYPE_Value> objName= new HashMap<>();

        HashMap<Integer,String> mapping = new HashMap<>();

        // adding elements
         mapping.put(1,"Sandeep");
         mapping.put(2,"Siddharth");
         mapping.put(3,"Sanjay");
         mapping.put(4,"Pankaj");

        System.out.println("Printing data at key : 4 "+mapping.get(4));
        System.out.println("Printing data at key : 1 "+mapping.get(1));
        System.out.println("Printing data at key : 3 "+mapping.get(3));


        // get all the keys using keySet();

        Set<Integer> keys=mapping.keySet();
        System.out.println("Printing Keys :"+keys);

        for(Integer var : keys){

            System.out.println("Printing map using loop at key : "+var +" Value: "+mapping.get(var));
        }
    }


    public static void main(String[] args) {
        maphash obj = new maphash();
        obj.createmaphash();

    }
}
