package returntypemethod;

public class cube {
    public int cube(int number){
        int cube=(number*number*number);
        return cube;
    }

    public static void main(String[] args) {
        cube obj=new cube();
        int cube=obj.cube(58);
        System.out.println("cube is :"+cube);

    }



}
