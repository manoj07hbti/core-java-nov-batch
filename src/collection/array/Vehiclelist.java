package collection.array;

import collection.model.Vehicle;

import java.util.ArrayList;

public class Vehiclelist {

    ArrayList<Vehicle> sedan(){

        // ArrayList<modelclassname>objectname=new ArrayList<>();

        ArrayList<Vehicle>pune=new ArrayList<>();

        //modelclassname object name= new modelclass name();


        Vehicle pune1=new Vehicle("Audi","red",4,352233.54);
        Vehicle pune2=new Vehicle("BMW","black",3,3367233.54);
        Vehicle pune3=new Vehicle("Tesla","grey",5,3772233.54);
        Vehicle pune4=new Vehicle("Toyota","white",4,372233.54);


        //objectname.add(add object name);


        pune.add(pune1);
        pune.add(pune2);
        pune.add(pune3);
        pune.add(pune4);


        //return array

        return pune;


    }




    public static void main(String[]args){

        //classname obj=new class name();

        Vehiclelist var=new Vehiclelist();
       ArrayList<Vehicle>car= var.sedan();   //ArrayList<modelclassname>(GETNAME)= obj2.method name();


        //  car==GETNAME;
       for(int i=0;i< car.size();i++){

           System.out.println("Given data of car is :"+car.get(i).getName());
           System.out.println("Given data of car is :"+car.get(i).getColour());
           System.out.println("Given data of car is :"+car.get(i).getRating());
           System.out.println("Given data of car is :"+car.get(i).getPrice());



           System.out.println("Given data of car is :"+car.get(i).getName()+"\t Colur:"+car.get(i).getColour()+"\tRating:"+car.get(i).getRating()+"\tprice:"+car.get(i).getPrice());


       }

    }
}
