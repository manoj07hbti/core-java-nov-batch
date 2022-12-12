package collection.hashset;

import java.util.HashSet;

public class Hashdemo {    //  hashSet does not allow repeated primitive type data
    // only run on adavnce for loop

    public HashSet<String> namebyhashset() {


        HashSet<String> names = new HashSet<>();

        names.add("Varun");
        names.add("Arun");
        names.add("Tarun");
        names.add("Shivam");
        names.add("lokesh");
        names.add("Tarun");
        names.add("Arun");


        return names;
    }

    public HashSet<Integer> rollnumber() {

        HashSet<Integer> rollno = new HashSet<>();

        rollno.add(34);
        rollno.add(43);
        rollno.add(43);
        rollno.add(23);
        rollno.add(55);
        rollno.add(65);
        rollno.add(23);


        return rollno;


    }

    public HashSet<Double> monthly() {

        HashSet<Double> fees = new HashSet<>();

        fees.add(5256.8377);
        fees.add(3665.3636);
        fees.add(53443.938);
        fees.add(63635.827);
        fees.add(5256.8377);
        fees.add(53443.938);

        return fees;


    }


    public static void main(String[] args) {

        Hashdemo var = new Hashdemo();
        HashSet<String> names = var.namebyhashset();

        for (String variable : names) {


            System.out.println("Name of the person is" + variable);
        }

        HashSet<Integer> object = var.rollnumber();

        for (Integer variable : object) {

            System.out.println("printing integerHashSet: " + variable);

        }

        HashSet<Double> doublesHashSet = var.monthly();

        for (Double variable : doublesHashSet) {

            System.out.println("printing integerHashSet: " + variable);
        }
    }
}
