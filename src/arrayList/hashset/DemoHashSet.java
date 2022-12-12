package arrayList.hashset;

import java.util.HashSet;

public class DemoHashSet {

    public  HashSet<String> createStringHashSet() {

        // HashSet <String> objName = new ClassName();
        HashSet <String> StringHashSet = new HashSet<>();

        StringHashSet.add("Java");
        StringHashSet.add("Java8");
        StringHashSet.add("Spring");
        StringHashSet.add("cloud");

        StringHashSet.add("Java");
        StringHashSet.add("Java8");
        StringHashSet.add("Spring");
        StringHashSet.add("cloud");

        return StringHashSet;
    }


   public HashSet <Integer> createIntegerHashSet () {

       HashSet<Integer> IntegerHashSet = new HashSet<>();

       IntegerHashSet.add(87);
       IntegerHashSet.add(154);
       IntegerHashSet.add(841);
       IntegerHashSet.add(87);
       IntegerHashSet.add(154);
       IntegerHashSet.add(841);

       return IntegerHashSet;

       }


    public HashSet <Double> createDoubleHashSet () {

        HashSet<Double> DoubleHashSet = new HashSet<>();

        DoubleHashSet.add(6454.15);
        DoubleHashSet.add(451578.326);
        DoubleHashSet.add(751.87);
        DoubleHashSet.add(5452.151);
        DoubleHashSet.add(6454.15);
        DoubleHashSet.add(451578.326);
        DoubleHashSet.add(751.87);
        DoubleHashSet.add(5452.151);

        return DoubleHashSet;

    }


    public static void main(String[] args) {

        DemoHashSet obj = new DemoHashSet();

        HashSet <String> StringHashSet = obj.createStringHashSet();
        for (String var : StringHashSet){
            System.out.println("Printing HashSet : "+var);
        }


        HashSet <Integer> IntegerHashSet = obj.createIntegerHashSet();
        for (Integer var : IntegerHashSet) {
            System.out.println("Printing Integer HashSet : "+var);
        }


        HashSet <Double> DoubleHashSet = obj.createDoubleHashSet();
        for (Double var : DoubleHashSet) {
            System.out.println("Printing Double HashSet : "+var);
        }

    }
}
