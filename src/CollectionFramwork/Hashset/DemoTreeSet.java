package CollectionFramwork.Hashset;

import java.util.TreeSet;

public class DemoTreeSet {
    public void createTreeSet() {

//SYNTAX :  TreeSet <DataType> objName= new TreeSet();

        TreeSet<Integer> IntTreeSet = new TreeSet<>();

        IntTreeSet.add(1);
        IntTreeSet.add(2);
        IntTreeSet.add(3);
        IntTreeSet.add(4);
        IntTreeSet.add(5);
        IntTreeSet.add(6);
        System.out.println("Printing output:" + IntTreeSet);



        // creating String treeSet

        TreeSet<String> StTreeSet = new TreeSet<>();
        StTreeSet.add("Agra");
        StTreeSet.add("Delhi");
        StTreeSet.add("Kanpur");
        StTreeSet.add("Pune");
        StTreeSet.add("Noida");
        System.out.println ("Printing output:"+StTreeSet);

    }
        public static void main(String[] args) {

            DemoTreeSet  obj = new DemoTreeSet ();
            obj.createTreeSet();
    }

}
