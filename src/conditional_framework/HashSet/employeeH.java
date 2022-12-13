package conditional_framework.HashSet;
import java.util.*;

public class employeeH {

    public HashSet<String> stringhashset(){

        //SYNTAX-- ClassName <DATATYPE>  objName = new ClassName();
        // HashSet <DATATYPE> objName= new ClassName();

        HashSet<String> hashSet =new HashSet<>();

        hashSet.add("Raj");
        hashSet.add("Raju");
        hashSet.add("Raj");
        hashSet.add("Shyam");
        hashSet.add("Raj");
        hashSet.add("Raju");
        hashSet.add("Raj");
        hashSet.add("Sandeep");
        hashSet.add("Raj");

        return hashSet;

    }
    //Integer type

    public HashSet<Integer> inthashset(){

        HashSet<Integer> inthashset =new HashSet<>();

        inthashset.add(28);

        inthashset.add(22);
        inthashset.add(28);
        inthashset.add(27);
        inthashset.add(27);
        inthashset.add(22);
        inthashset.add(25);
        inthashset.add(22);
        inthashset.add(23);

        return inthashset;
    }

    //double

    public HashSet<Double> doublehashset (){
        HashSet<Double> hashSet =new HashSet<>();

        hashSet.add(22.34);
        hashSet.add(21.24);
        hashSet.add(22.34);
        hashSet.add(21.24);
        hashSet.add(22.34);
        hashSet.add(23.74);
        hashSet.add(22.34);
        hashSet.add(23.74);
        hashSet.add(23.74);
        hashSet.add(22.34);
        hashSet.add(25.34);

        return hashSet;
    }


    public static void main(String[] args) {

        employeeH obj =new employeeH();
        //String
        HashSet<String> hashSet =  obj.stringhashset();
        for (String var : hashSet) {
            System.out.println(var);
        }
        HashSet<Integer> inthashset = obj.inthashset();
        for (Integer var : inthashset){
            System.out.println(var);
        }
        HashSet<Double> doublehashset = obj.doublehashset();
        for (Double var : doublehashset){
            System.out.println(var);
        }
    }
}
