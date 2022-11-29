package Class_and_object;

public class Tree {
    // data member or properties
    String name = "tree";
    String kind = "Long ";
    String leafs = " green";

    public static void main(String[] args) {
        //Syntax:class name obj name = new class name ();
        Tree obj = new Tree();
        // obj name  . properties name
        System.out.println(" It is  "+obj.name);
        System.out.println(" It is "+obj.kind );
        System.out.println(" It is "+obj.leafs);

    }
}
