package Method;

public class Cube_returntype {

    // Syntax:access_specifier return_type method_name(parameter){code}

    public int  makecube (int number){
        int cube =number*number*number;
        return cube;

    }


    public static void main(String[]args) {

        Cube_returntype obj = new Cube_returntype();
        int cube= obj.makecube(3);
        System.out.println("Value is "+ cube);
    }






}


