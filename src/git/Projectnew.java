package git;

public class Projectnew {
    public static void main(String[] args) {
        String section="science";
        int number=70;
        if( number>60 & section=="science"){
            System.out.println("passed with first division");
        }
        number=50;
        section="science";
        if( number>60 & section== "science"){
            System.out.println("passed with first division");
        }
        else{
            System.out.println("pass with second division");
        }
        number=68;
        section="art";
        if(number>60 & section=="science"){
            System.out.println("pass with second diviion");
        }
        else{
            System.out.println("pass wit third division");
        }
        number=33;
        section="art";
        if(number>33 & section=="science"){
            System.out.println("fail");
        }
        else{
            System.out.println("number>=33 pass");
        }

    }

    }

