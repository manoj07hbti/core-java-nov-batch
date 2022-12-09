package collection;

import java.util.ArrayList;
import java.util.zip.DeflaterOutputStream;

public class DemoArrayList {

    // create String arrayList

    public ArrayList <String> createStringList(){
   // SYNTAX :  ArrayList <Datatyep> objName= new ArrayList();

        ArrayList <String> course= new ArrayList<>();

        course.add("Java");
        course.add("Spring");
        course.add("Spring boot");
        //course.add(13);  we can not any other data
        course.add("Cloud");

        return course;

    }

    // Integer arraylist

    public ArrayList<Integer> createIntegerList(){
        // SYNTAX :  ArrayList <Datatyep> objName= new ArrayList();

        ArrayList <Integer> marks = new ArrayList<>();

        marks.add(33);
        marks.add(76);
        marks.add(45);
       // marks.add("ABC"); it will only allow Integer
        marks.add(34);
        marks.add(99);

        return marks;

    }

 // Decimal arraylist


    public ArrayList<Double> createDecimalList(){

        ArrayList <Double> price= new ArrayList<>();
        price.add(23.4);
        price.add(23.1);
        price.add(453.2);
       // price.add("abs");  it will not allow any other value apart from decimal
        price.add(32421343.45);

       return price;

    }




    public static void main(String[] args) {

        DemoArrayList obj= new DemoArrayList();
        ArrayList <String> course=   obj.createStringList();

        for (int i=0; i<course.size(); i++){

            System.out.println("Printing list : "+course.get(i) + " at INDEX: "+i);
        }

        // SYNTAX : for(DATATYPE var: collectionName/array){ CODE }
        for(String var: course){

            System.out.println("Printing in advance loop "+var);
        }

       ArrayList<Integer> marks= obj.createIntegerList();

        // SYNTAX : for(DATATYPE var: collectionName/array){
        for (Integer var: marks){

            System.out.println("printing marks: "+var);
        }

       ArrayList <Double> price=obj.createDecimalList();

        for (Double var : price){

            System.out.println("Printing prices : "+var);
        }

    }
}
