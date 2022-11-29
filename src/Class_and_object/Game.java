package Class_and_object;

public class Game {
    String name = "pubg";
    String play = "online ";
    String mode = "easy";

    public static void main(String[] args) {
        // syntax : class name obj name = new class name ();
        Game obj = new Game();
        System.out.println("game is " + obj.name);
        System.out.println("game is " + obj.play);
        System.out.println("game is " + obj.mode);


    }
}