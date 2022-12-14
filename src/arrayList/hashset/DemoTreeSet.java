package arrayList.hashset;

import java.util.TreeSet;

public class DemoTreeSet {

    public void createDemoTreeSet() {

        // SYNTAX : CLASSNAME <DATATYPE> ObjName = NEW CLASSNAME

        // Method 1 for integer
        TreeSet <Integer> integerTreeSet = new TreeSet<>();

        integerTreeSet.add(65);
        integerTreeSet.add(45);
        integerTreeSet.add(97);
        integerTreeSet.add(12);
        integerTreeSet.add(26);

        System.out.println("Printing Integer TreeSet M1 :"+integerTreeSet);

        // for String
        TreeSet <String> StringTreeSet = new TreeSet<>();

        StringTreeSet.add("java");
        StringTreeSet.add("String");
        StringTreeSet.add("Cloud");
        StringTreeSet.add("vineet");
        StringTreeSet.add("Apple");

        System.out.println("Printing String TreeSet : "+StringTreeSet);

        // for Double
        TreeSet <Double> DoubleTreeSet = new TreeSet<>();

        DoubleTreeSet.add(784.15);
        DoubleTreeSet.add(78451.124);
        DoubleTreeSet.add(7841.12);
        DoubleTreeSet.add(21.84);
        DoubleTreeSet.add(14.84);

        System.out.println("Printing Double TreeSet : "+DoubleTreeSet);
    }

    public static void main(String[] args) {

    DemoTreeSet obj = new DemoTreeSet();
    obj.createDemoTreeSet();


    }
}
