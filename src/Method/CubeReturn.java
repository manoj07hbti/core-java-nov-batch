package Method;

public class CubeReturn {

    public int makecube(int a){

        int cube=a*a*a;
        return cube;

    }
    public static void main(String[]args){

        CubeReturn obj=new CubeReturn();

        int cube=obj.makecube(9);

        System.out.println("The vale of the given number after cube is :"+ cube);
    }
}


