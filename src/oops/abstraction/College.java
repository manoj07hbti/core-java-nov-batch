package oops.abstraction;

public abstract class College {

//while writing the syntax , it should be written without body with abstract ---

    public abstract void collegeabstract();

    //we can create own method and it creates a partial abstraction method ......

    public void college1(){

        System.out.println("College 1");
    }
    public void college2(){
        System.out.println("College 2");
    }

    public static void main(String[] args) {

        // TODO we cannot create object in the abstract class.. because the java does not allow to make object in abstract class
        //  if we will try to make object then the java shows  error....

//        College obj = new College() {
//        obj.
//        }
    }
}
