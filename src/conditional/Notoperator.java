package conditional;

public class Notoperator {
    public static void main(String[] args){
        int age=23;
        if(! (age>18)){
            System.out.println("eligible for voting");
        }else{
            System.out.println("not eligible for voting");
        }
        String city="agra";
        if(!(city=="agra")){
            System.out.println("city is ");

        }
        else{
            System.out.println("city is not agra");
        }
    }
}
