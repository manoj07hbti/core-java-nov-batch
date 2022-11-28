package class_and_object;

public class Dog {

    String breed="Husky";
    int age=4;
    double height=4.5;


    public static void main(String[] args) {

        //SYNTAX: ClassName objName= new ClassName();

        Dog obj= new Dog(); // creating object using default constructor

        System.out.println("Printing Dog Object  : "+obj.breed);
        System.out.println("Printing Dog Object  : "+obj.age);
        System.out.println("Printing Dog Object  : "+obj.height);


        System.out.println("Breed :"+obj.breed + " Age: "+obj.age + " Height: " + obj.height);
    }
}
