package arraylist;

import java.util.HashMap;
import java.util.Set;

public class demohashmap {
    public void createhashmap(){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(25,"Gaurang");
        map.put(26,"arun");
        map.put(27,"himanshu");
        map.put(21,"ramu");
        System.out.println("printing of hashmap : "+map.get(25));
        System.out.println("printing of hashmap : "+map.get(21));

        Set<Integer> Keys=map.keySet();
        System.out.println("printing of map through keyset: "+Keys );
        for(Integer var: Keys){
            System.out.println("printing of keys " +map.get(var));
        }

    }

    public static void main(String[] args) {
        demohashmap obj=new demohashmap();
        obj.createhashmap();
    }
}
