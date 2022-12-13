package arraylist;

import java.util.HashSet;

public class demohashset {
    public HashSet<String> createStringhashset() {
        //Syntax:Classname <datatype> objname=new classname();
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("java");
        stringHashSet.add("spring");
        stringHashSet.add("springboot");
        stringHashSet.add("hibernate");
        stringHashSet.add("java");
        stringHashSet.add("spring");
        stringHashSet.add("springboot");
        stringHashSet.add("hibernate");
        return stringHashSet;
    }
       public HashSet<Integer> createinthashset() {
           HashSet<Integer> integerHashSet = new HashSet<>();
           integerHashSet.add(23);
           integerHashSet.add(25);
           integerHashSet.add(56);
           integerHashSet.add(26);
           integerHashSet.add(23);
           integerHashSet.add(25);
           integerHashSet.add(56);
           integerHashSet.add(26);
           return integerHashSet;
    }
     public HashSet<Double> createdoublelist(){
        HashSet<Double> doubleHashSet= new HashSet<>();

         doubleHashSet.add(5212.23);
         doubleHashSet.add(5221.232);
         doubleHashSet.add(26.22);
         doubleHashSet.add(5212.23);
         doubleHashSet.add(5221.232);
         doubleHashSet.add(26.22);
         return doubleHashSet;





     }

    public static void main(String[] args) {
        demohashset obj = new demohashset();
        HashSet<String> stringHashSet = obj.createStringhashset();
        for (String var : stringHashSet) {
            System.out.println("printing of hashset : " + var);
        }
        HashSet<Integer>integerHashSet=obj.createinthashset();
        for(Integer var:integerHashSet){
            System.out.println("printing of integer hashset : "+var);
        }
        HashSet<Double> doubleHashSet=obj.createdoublelist();
        for(Double var:doubleHashSet){
            System.out.println("printing of double hashset :" +var);
        }
    }

}



