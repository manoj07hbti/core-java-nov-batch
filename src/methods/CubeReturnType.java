package methods;

public class CubeReturnType {

    public int cude(int a){
        int result = 0;
         result += Math.pow(a,3); // how we use Math.pow(a,3); this method
        return  result;
    }

    public static void main(String[] args) {
        CubeReturnType obj=new CubeReturnType();
        int res = obj.cude(3);
        System.out.println("Cube of Number is : "+res);
    }
}
