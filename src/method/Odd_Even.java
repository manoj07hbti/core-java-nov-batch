package method;

public class Odd_Even {

    // Odd Even Number  1 TO 100

    public void Number(int i){


        if(i % 2 == 0){
            System.out.println("Even number "+i);
        }
        else {
            System.out.println("Odd number "+i);
        }
    }


    public static void main(String[] args) {
        Odd_Even obj = new Odd_Even();
        obj.Number(1);
        obj.Number(2);
        obj.Number(3);
        obj.Number(4);
        obj.Number(5);
        obj.Number(6);
        obj.Number(8);
        obj.Number(98);
        obj.Number(74);
        obj.Number(69);
        obj.Number(24);
        obj.Number(72);
        obj.Number(15);
        obj.Number(84);
        obj.Number(20);
        obj.Number(57);
        obj.Number(65);
        obj.Number(32);
        obj.Number(75);
        obj.Number(98);
        obj.Number(75);
        obj.Number(69);
        obj.Number(24);
        obj.Number(72);

    }

}
