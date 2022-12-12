package method;

import java.util.ArrayList;

public class Arraylist2 {
    public ArrayList<String> Stringlist(){
        ArrayList<String> course=new ArrayList<>();
        course.add("agra");
        course.add("delhi");
        return course;
    }
    public ArrayList<Integer> Integerlist() {
        ArrayList<Integer> age = new ArrayList<>();
        age.add(25);
        age.add(23);
        return age;
    }
    public ArrayList<String> Stringlist2(){
        ArrayList<String> name=new ArrayList<>();
        name.add("arun");
        name.add("vicky");
        return name;
    }



    public static void main(String[] args) {
        Arraylist2 obj = new Arraylist2();
        ArrayList<String> course = obj.Stringlist();
        for(String var:course){
        System.out.println("printing the string " + var);
        }
        ArrayList<Integer> age = obj.Integerlist();
        for(int i=0;i<age.size();i++)
        System.out.println("printing th integer "+age.get(1));
    }
}
