package class_or_object;

public class Cat {
    String name = "Marina";
    String color = "BLACK";
    int leg = 4;
    String voice = "meow";
    int tail = 1;
    int eyes = 2;
    String food = "Milk";

    public static void main(String[] args) {

        Cat obj = new Cat();

        System.out.println("Cat Name = "+obj.name);

        System.out.println("Color = "+obj.color);

        System.out.println("Legs of cat = "+obj.leg);

        System.out.println("Voice = "+obj.voice);

        System.out.println("Tail that Cat have = "+obj.tail);

        System.out.println("Eyes = "+obj.eyes);

        System.out.println("Cats fav. is = "+obj.food);

    }
}
