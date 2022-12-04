package functions_methods;

public class cubeR {

    public int cube ( int a){

        int cube = a*a*a;
        return cube;
    }

    public static void main(String[] args) {
        cubeR obj = new cubeR();
        int cube = obj.cube(2);
        System.out.println("Cube of number is  " + cube);
    }
}
