package object_and_class;
public class dog {
    String breed = "german shepherd";
    int age = 5;
    double height = 3.5;
    public static void main(String[] args) {
        dog obj=new dog();
        System.out.println("breed of dog :"+obj.breed );
        System.out.println("age of dog :"+obj.age );
        System.out.println("height of dog :"+obj.height );
        System.out.println("breed of dog :" +obj.breed +" age of dog :" +obj.age +" height of dog :" +obj.height);
    }
}