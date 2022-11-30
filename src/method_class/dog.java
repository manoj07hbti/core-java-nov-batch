package method_class;

public class dog {
    String name;
    String breed;
    int age;
    public void breedmethod(){
        System.out.println("this is breed method");
    }
    public void runmethod(){
        System.out.println("this is run method");
    }
    public void playmethod(){
        System.out.println("this is play method");
    }

    public static void main(String[] args) {
        dog obj=new dog();
        obj.breedmethod();
        obj.runmethod();
        obj.playmethod();
    }

}
