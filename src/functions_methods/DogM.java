package functions_methods;

public class DogM {

    String breed;
    int age;
    double height;

    //method
    //bark,run,play

    public void bark(){
        System.out.println("He barks so loudly ");
    }
    public void run(){
        System.out.println("He runs very fast");
    }
    public void play(){
        System.out.println("He loves to play with me football");
    }

    public static void main(String[] args) {
        DogM obj=new DogM();
        obj.bark();
        obj.run();
        obj.play();
    }
}
