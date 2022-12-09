package conditional_framework;
import java.text.DecimalFormat;
import java.time.format.DecimalStyle;
import java.util.ArrayList;

public class collection_generics {

    //method

    //String List

    public ArrayList <String> stringlist(){
        // SYNTAX :  ArrayList <Datatype> objName= new ArrayList();

        ArrayList<String> name=new ArrayList<>();
        name.add("Sandeep");
        name.add("Siddharth");
        name.add("Pankaj");
        name.add("Siddhant");

        return name;
    }

        //Integer

        public ArrayList  <Integer> integerlist() {

            ArrayList <Integer> age = new ArrayList<>();
            age.add(24);
            age.add(33);
            age.add(45);
            age.add(33);

            return age;
    }

    //Decimal

    public ArrayList <Double> decimallist(){

        ArrayList<Double> salary= new ArrayList<>();

        salary.add(22.34);
        salary.add(33.12);
        salary.add(44.23);
        salary.add(20.32);

        return salary;
    }


    public static void main(String[] args) {
        collection_generics obj =new collection_generics();

        //String
        ArrayList<String> name = obj.stringlist();

        for (int i=0; i< name.size(); i++){
            System.out.println(name.get(i)+" index is " + i);
        }
        System.out.println("\n");

        //Integer

        ArrayList<Integer> age = obj.integerlist();

        for (int j=0; j< age.size(); j++){
            System.out.println(age.get(j)+" index is " + j);
        }
        System.out.println("\n");

        //Decimal

        ArrayList<Double> salary = obj.decimallist();

        for (int k=0; k< salary.size(); k++){
            System.out.println(salary.get(k)+" Index is " + k);
        }




    }
}
