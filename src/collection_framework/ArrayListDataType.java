package collection_framework;

import java.util.ArrayList;

public class ArrayListDataType {

    // create String arrayList without return type
    public void StringList(){
        // SYNTAX :  ArrayList <Datatype> objName= new ArrayList();
        ArrayList <String> names = new ArrayList<>();
        names.add("Ankit");
        names.add("Naman");
        names.add("Sunil");
        names.add("Chetri");

        // Printing data for loop
        for (int i=0; i< names.size(); i++){
            System.out.println("Names of Employee : "+names.get(i));
        }
        //printing data advance for loop
        for (String var : names){
            System.out.println("Employee in Advance For Loop : "+var);
        }
    }
    // create Integer arrayList with return type
    public ArrayList<Integer> IntegerList(){
        ArrayList <Integer> age = new ArrayList<>();
        age.add(26);
        age.add(25);
        age.add(27);
        age.add(24);
        return age;
    }
    // create decimal(Double) arrayList with return type
    public ArrayList<Double> DoubleList(){
        ArrayList<Double> salary = new ArrayList<>();
        salary.add(12545.22);
        salary.add(34654.23);
        salary.add(240412.26);
        salary.add(154541.2);
        return salary;
    }


    public static void main(String[] args) {
        ArrayListDataType obj = new ArrayListDataType();
        obj.StringList();
        ArrayList <Integer> age = obj.IntegerList();
        for (int i=0; i< age.size(); i++){
            System.out.println("Employee Age : "+age.get(i));
        }
        for (Integer var : age){
            System.out.println("Ages in Advance Loop : "+var);
        }
        ArrayList<Double> salary = obj.DoubleList();
        for (int i=0; i< salary.size(); i++){
            System.out.println("Employee Salary : "+salary.get(i));
        }
        for (Double var : salary){
            System.out.println("Salary in Advance Loop : "+var);
        }


    }
}
