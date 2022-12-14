package methodreturn;

import java.util.TreeSet;

public class Treeset {
    public void creattreeset(){

        TreeSet<Integer> integertreeset=new TreeSet();
        integertreeset.add(4);
        integertreeset.add(6);
        integertreeset.add(1);
        integertreeset.add(9);
        integertreeset.add(3);
        integertreeset.add(9);
        integertreeset.add(4);
        System.out.println("print the integer value "+integertreeset);

        TreeSet<String> stringtreeset=new TreeSet();
        stringtreeset.add("tarun");
        stringtreeset.add("varun");
        stringtreeset.add("arun");
        stringtreeset.add("pankaj");
        stringtreeset.add("shubham");
        stringtreeset.add("bablu");
        stringtreeset.add("titu");
        System.out.println("print the string value "+stringtreeset);
    }

    public static void main(String[] args) {
        Treeset obj=new Treeset();
        obj.creattreeset();
    }
}
