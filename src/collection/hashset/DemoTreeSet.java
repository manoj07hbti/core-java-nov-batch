package collection.hashset;

import loops.Demo;

import java.util.TreeSet;

public class DemoTreeSet {

    public void createTreeSet(){

        //SYNTAX :  TreeSet <DataType> objName= new TreeSet();

        TreeSet <Integer> integerTreeSet = new TreeSet<>();

        integerTreeSet.add(4);
        integerTreeSet.add(9);
        integerTreeSet.add(1);
        integerTreeSet.add(0);
        integerTreeSet.add(2);

        System.out.println("Printing integerTreeSet TreeSet :"+integerTreeSet);

        TreeSet <String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("Java");
        stringTreeSet.add("Cloud");
        stringTreeSet.add("Microseservice");
        stringTreeSet.add("AGILE");
        stringTreeSet.add("Spring boot");

        System.out.println("Printing stringTreeSet : "+stringTreeSet);

    }


    public static void main(String[] args) {

        DemoTreeSet obj = new DemoTreeSet();
        obj.createTreeSet();

    }
}
