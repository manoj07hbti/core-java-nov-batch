package arraylist;

import java.util.TreeSet;

public class demotreeset {
    public void createtreeset(){
        TreeSet<String> stringtreeset=new TreeSet<>();
        stringtreeset.add("Gaurang");
        stringtreeset.add("arun");
        stringtreeset.add("himanshu");
        stringtreeset.add("vaishali");
        System.out.println("printing of string list ; "+ stringtreeset);

        TreeSet<Integer> integerTreeSet=new TreeSet<>();
        integerTreeSet.add(25);
        integerTreeSet.add(46);
        integerTreeSet.add(36);
        integerTreeSet.add(73);
        integerTreeSet.add(28);

        System.out.println("printing of integer ist" +integerTreeSet);
    }


    public static void main(String[] args) {
        demotreeset obj=new demotreeset();
        obj.createtreeset();
        
    }


}
