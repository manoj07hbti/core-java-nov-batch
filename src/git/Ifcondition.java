package git;

public class Ifcondition{
    public static void main(String[] args) {
        int  age =22;
        if(age>18){
            System.out.println("eligibal for voting...");
        }
        age=17;
        if(age<18){
            System.out.println("not eligibal for voting");
        }
        age=23;
        if(age>18){
            System.out.println("eligibal for voting.....");
        }
        age=16;
        if (age<18){
            System.out.println("not eligibal for voting....");
        }
        String city  ="delhi";
        if(city=="agra"){
            System.out.println("person belong to agra");
        }
        if(city!="agra"){
            System.out.println("person belong to other city");
        }
        age=17;
        if(age>18){
            System.out.println("eligibal for voting...");
        }
        else{
            System.out.println("not eligibal for voting");
        }
        city="agra";
        if(city=="london"){
            System.out.println("person belong to london");
        }
        else{
            System.out.println("person not belong to");
        }



    }
}

