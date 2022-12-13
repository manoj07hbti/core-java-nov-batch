package arrayList.array;

import java.util.ArrayList;

public class DemoArray {

    // create string list
    public ArrayList <String> createStringList() {
        ArrayList <String> country = new ArrayList<>();
        country.add("India");
        country.add("Sri Lanka");
        country.add("England");
        country.add("France");

        return country;

    }

    // create integer lst
    public ArrayList <Integer> createIntegerList() {
        ArrayList <Integer> number = new ArrayList<>();
        number.add(323);
        number.add(45);
        number.add(83);

        return number;
    }

    // create double list
    public ArrayList <Double> createDoubleList() {
        ArrayList <Double> salary = new ArrayList<>();
        salary.add(34568.78);
        salary.add(45494.76);
        salary.add(568404.64);

        return salary;
    }

    public static void main(String[] args) {

        DemoArray obj = new DemoArray();

        ArrayList <String> country  = obj.createStringList();
        ArrayList <Integer> number = obj.createIntegerList();
        ArrayList <Double> salary = obj.createDoubleList();


        // String datatype for loop
        for (int i = 0; i < country.size(); i++) {
            System.out.println("Printing for loop, "+country.get(i)+ " at index : "+i );
        }
        // Advanced for loop
        for (Object var : country) {
            System.out.println("Advanced for loop, at index : "+var);
        }


        // Integer datatype
        for (int i = 0; i < number.size(); i++) {
            System.out.println("Printing for loop, "+number.get(i)+ " at index : "+i );
        }
        // Advanced for loop
        for (Object var : number) {
            System.out.println("Advanced for loop, : "+var);
        }


        // Double datatype
        for (int i = 0; i < salary.size(); i++) {
            System.out.println("Printing for loop, "+salary.get(i)+ " at index : "+i );
        }
        // Advanced for loop
        for (Object var : salary) {
            System.out.println("Advanced for loop, : "+var);
        }
    }
}
