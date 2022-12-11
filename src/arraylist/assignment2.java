package arraylist;

import java.util.ArrayList;

public class assignment2 {
    public ArrayList<String> createstringlist(){
        ArrayList <String> course = new ArrayList<>();
        course.add("gaurang");
        course.add("yadav" );
        course.add("agra");
        course.add("up");
        return course;
    }
    public ArrayList<Integer> createagelist(){
        ArrayList<Integer> age= new ArrayList<>();
        age.add(25);
        age.add(52);
        age.add(23);
        age.add(98);
        age.add(78);
        age.add(12);
        return age;
    }
    public ArrayList<Double>createsalarylist(){
        ArrayList<Double> salary =new ArrayList<>() ;
        salary.add(5411.225);
        salary.add(547215.2);
        salary.add(1452.2);
        salary.add(141.224);
        return salary;


    }


    public static void main(String[] args) {

        assignment2 obj=new assignment2();
        ArrayList <String> course= obj.createstringlist();
        for(int i=0;i<course.size();i++ ){
            System.out.println("printing of list " +course.get(i) + "index : " +i);
        }
        ArrayList<Integer> age= obj.createagelist();
        for(int i=0; i<age.size();i++){
            System.out.println("printing of age"+age.get(i) +" index : " +i);
        }
        ArrayList<Double>salary=obj.createsalarylist();
        for(int i=0; i<salary.size();i++){
            System.out.println("salary is :" + salary.get(i) + "index" +i);
        }
        for(String var:course){
            System.out.println("printing of course in advance loop : " +var);
        }
        for(Integer var: age){
            System.out.println("printing of age in advance loop " +var);

        }
        for(Double var:salary){
            System.out.println("printing of salary in advance loop is "+ var);
        }

    }


}
