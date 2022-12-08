package arraylist;

import java.util.ArrayList;

public class assignmentarraylist {
    public void assignment(){
        ArrayList arraylist = new ArrayList();
        arraylist.add("agra");
        arraylist.add("delhi");
        arraylist.add("kanpur");
        arraylist.add(25);
        arraylist.add(32.23);
        arraylist.add(5874585);
        arraylist.add("tundla");
        arraylist.add("firozabad");
        arraylist.add(2560);
        arraylist.add(25);
        System.out.println("printing of list" +arraylist.get(2));
        System.out.println("printing of list " +arraylist.get(4));
        System.out.println("printing of list " +arraylist.size());

        for(int i=0; i<arraylist.size(); i++){
            System.out.println("printing of list in loop : " +arraylist.get(i) + "index  " +i);
        }
        for(Object var:arraylist){
            System.out.println("printing of list in advance loop :" +var);

        }
        arraylist.remove(5);
        System.out.println("printing of list after remove :");

        for(int i=0;i<arraylist.size();i++){
            System.out.println("printing of list after remove : "+arraylist.get(i) + "index : " + i);

        }




    }

    public static void main(String[] args) {
        assignmentarraylist obj=new assignmentarraylist ();
        obj.assignment();
    }






}
