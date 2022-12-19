package methodreturn;



import java.util.ArrayList;
import java.util.HashMap;

public class Advancemap {
    public void advancemap(){

        HashMap<String, ArrayList<String>> hashmap=new HashMap();
        ArrayList<String> arraylist=new ArrayList();
        arraylist.add("arun");
        arraylist.add("varun");
        arraylist.add("parun");

        ArrayList<String> cities=new ArrayList();
        cities.add("agra");
        cities.add("lomdon");
        cities.add("paris");

        hashmap.put("a",arraylist);
        hashmap.put("b",cities);

        for(String var:hashmap.keySet()){
            System.out.println("please enter value "+hashmap.get(var));
        }




    }

    public static void main(String[] args) {
        Advancemap obj=new Advancemap();
        obj.advancemap();
    }

}
