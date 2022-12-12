package methodreturn;

import java.util.HashSet;

public class Hashset {
    public HashSet<String> creatstringhashset(){
        HashSet<String> stringhashset=new HashSet();
        stringhashset.add("arun");
        stringhashset.add("varun");
        stringhashset.add("tarun");
        stringhashset.add("arun");
        stringhashset.add("varun");
        stringhashset.add("tarun");
        return stringhashset;
    }
    public HashSet<Integer> creatintegerhashset(){
        HashSet<Integer> integerhashset=new HashSet();
        integerhashset.add(23);
        integerhashset.add(24);
        integerhashset.add(25);
        integerhashset.add(23);
        integerhashset.add(24);
        integerhashset.add(25);
        return integerhashset;
    }
    public HashSet<Double> creatdoublehashset(){
        HashSet<Double> doublehashset=new HashSet();
        doublehashset.add(23.5);
        doublehashset.add(24.4);
        doublehashset.add(25.5);
        doublehashset.add(23.5);
        doublehashset.add(24.4);
        doublehashset.add(25.5);
        return doublehashset;
    }

    public static void main(String[] args) {
        Hashset obj=new Hashset();
       HashSet<String> stringhashset =obj.creatstringhashset();
       for(String var: stringhashset){
           System.out.println("printed the stringhashset "+var);
       }
       HashSet<Integer>integerhashset=obj.creatintegerhashset();
       for(Integer var: integerhashset){
           System.out.println("print the integerhashset "+var);
       }
       HashSet<Double> doublehashset=obj.creatdoublehashset();
       for(Double var: doublehashset){
           System.out.println("print the doublehashset "+var);
       }
    }
}
