package conditional_framework.Treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class treeSetSC {

    public TreeSet<Integer> datatreeset() {

        //SYNTAX :  TreeSet <DataType> objName= new TreeSet();

        TreeSet<Integer> integerTreeSet = new TreeSet<>();


        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        String flag = "Y";
        while (flag.equals("Y")) {

            System.out.println("Please enter Values for TreeSet: ");

            Integer value = sc.nextInt();
            integerTreeSet.add(value);


            System.out.println("Press Y to add more elements or press any key to exit ");
            flag = sc1.nextLine();
        }
        return integerTreeSet;

    }


    public static void main(String[] args) {
        treeSetSC obj = new treeSetSC();
        TreeSet<Integer> data  =obj.datatreeset();

        for (Integer var : data){
            System.out.println(var);
        }
    }
}
