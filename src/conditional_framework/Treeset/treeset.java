package conditional_framework.Treeset;

import java.util.TreeSet;

public class treeset {

    public void createtreeset (){

        // TreeSet <Datatype> objname = new classname/collection<>();

        TreeSet<String> stringTreeSet = new TreeSet<>();

        stringTreeSet.add("SANTOSH");
        stringTreeSet.add("SANDEEP");
        stringTreeSet.add("SANJAY");
        stringTreeSet.add("RAHUL");

        System.out.println("The String treeSet of all member is "+ stringTreeSet);

        TreeSet<Integer> IntegerTreeSet = new TreeSet<>();

        IntegerTreeSet.add(6);
        IntegerTreeSet.add(1);
        IntegerTreeSet.add(3);
        IntegerTreeSet.add(8);

        System.out.println("THe integer treeSet of all member is " + IntegerTreeSet);


    }


    public static void main(String[] args) {
        treeset obj = new treeset();
        obj.createtreeset();
    }
}
