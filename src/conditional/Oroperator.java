package conditional;

public class Oroperator {
    public static void main(String[] args){
        int marks=78;
        String section="b";
        if(marks>60 || section=="b"){
            System.out.println("first division");
        }
        else{
            System.out.println("not qualify");
        }
        marks=58;
        section="b";
        if(marks<60 || section=="b"){
            System.out.println("secound division");

        }
        else{
            System.out.println("fail");
        }
        marks=56;
        section="b";
        if(marks>60 ||section=="c"){
            System.out.println("secund divsion");
        }
        else{
            System.out.printf("fail");
        }




    }




}
