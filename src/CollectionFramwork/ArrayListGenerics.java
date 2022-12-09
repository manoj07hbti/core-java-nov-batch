package CollectionFramwork;
import java.util.ArrayList;

public class ArrayListGenerics {
    // creating String ArrayList with return type & generics

    public ArrayList<String> createStringList() {

        ArrayList<String> Mobile = new ArrayList<>();

        Mobile.add("Apple");// index 0
        Mobile.add("OnePlus");// index 1
        Mobile.add("Vivo");// index 2
        Mobile.add("Oppo");// index 3
        Mobile.add("Samsung"); // index 4

        return Mobile;
    }
// creating integer method with return type & generics
    public ArrayList<Integer> createIntegerList() {
        ArrayList<Integer> Marks = new ArrayList<>();


        Marks.add(10); // index 0
        Marks.add(20);// index 1
        Marks.add(30);// index 2
        Marks.add(40);// index 3
        Marks.add(50); // index 4

        return Marks;
    }
// creating  double generics method with return type
    public ArrayList<Double> DoubleList() {

        ArrayList<Double> Number = new ArrayList<>();

        Number.add(10.1); // index 0
        Number.add(20.2);// index 1
        Number.add(30.3);// index 2
        Number.add(40.4);// index 3
        Number.add(50.5); // index 4

        return Number;


    }

    public static void main(String[] args) {

        ArrayListGenerics obj = new ArrayListGenerics();

        ArrayList<String> Mobile = obj.createStringList();

        for (int i = 0; i < Mobile.size(); i++) {

            System.out.println("Print Product name : " + Mobile.get(i) + " at INDEX: " + i);




        // SYNTAX : for(DATATYPE var: collectionName/array){ CODE }

    }
        for (String var : Mobile) {

            System.out.println("Printing Product name in advance loop  : " + var);
        }
        ArrayList<Integer> Marks = obj.createIntegerList();


        // SYNTAX : for(DATATYPE var: collectionName/array){
        for (Integer var : Marks) {

            System.out.println("printing marks: " + var);
        }

        for (int i = 0; i < Marks.size(); i++) {

            System.out.println("Print Product name : " + Marks.get(i) + " at INDEX: " + i);
        }
        ArrayList<Double> Number = obj.DoubleList();

        for (Double var : Number) {

            System.out.println("printing Numbers: " + var);
        }

        for (int i = 0; i < Number.size(); i++) {

            System.out.println("Print  numbers : " + Number.get(i) + " at INDEX: " + i);


        }
    }
}