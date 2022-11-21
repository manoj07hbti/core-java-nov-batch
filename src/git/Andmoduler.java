package git;

public class Andmoduler {
    public static void main(String[] args) {

        String section="science";
        int number=70;
        if(number>60 & section=="science"){
            System.out.println("passed with first division");
        }
        number=54;
        if(number>48 & number<60 & section=="science"){
            System.out.println("passed with second division");
        }
        else{
            System.out.println("not passed with second division");
        }
        number=61;
        section="science";
        if(number>48 &number<60 & section=="science"){
            System.out.println("passed with second division");
        }
        else{
            System.out.println("data not correct");
        }
        number=46;
        section="science";
        if(number>33 & number<48 & section=="science"){
            System.out.println("third division");
        }
        else{
            System.out.println("fail");
        }
        number=32;
        section="science";
        if(number<=33 & section=="science"){
            System.out.println("fail in science");
        }


    }




}
