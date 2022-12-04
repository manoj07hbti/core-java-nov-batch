package methods;

public class CubeReturnType {

    // Make Cube of different number
    public int MakeCube(int num){

        return num*num*num;
    }

    // 2nd Cube
    public int makecube(int number) {

        return number*number*number;
    }

    public static void main(String[] args) {

        CubeReturnType obj = new CubeReturnType();

        // CUBE 1
        int Cube = obj.MakeCube(5);
        System.out.println("CUBE OF 5 IS :"+Cube);

        // CUBE 2
        int cube = obj.makecube(9);
        System.out.println("CUBE OD 9 IS :"+cube);
    }

}
