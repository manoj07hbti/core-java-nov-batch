package methods;

public class MethodInputParam {

   // FIRST ONE STRING TYPE
    public void Hello(String name){
        System.out.println("Hello, welcome to java "+name);

    }
    // SECOND ONE INT TYPE
    public void Cube(int number) {
        int cube = number*number*number;
        System.out.println("Cube of 5 is :"+cube);
    }

    // THIRD ONE INT && STRING BOTH TYPE

    public void Vote(int age, String city){

        if( age >18 && city =="AGRA") {

            System.out.println("Eligible for voting in AGRA.");
        } else {
            System.out.println("Not eligible for voting in AGRA.");
        }
    }

    public static void main(String[] args) {

        MethodInputParam obj = new MethodInputParam();
        obj.Hello("Vineet");
        obj.Cube(5);
        obj.Vote(11, "AGRA");
        obj.Vote(32, "AGRA");
    }
}
