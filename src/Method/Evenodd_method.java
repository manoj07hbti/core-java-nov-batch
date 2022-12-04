package Method;

import javax.imageio.stream.ImageInputStream;

public class Evenodd_method {
    public void marks(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is a EVEN Number");
        } else {
            System.out.println(num + " is a ODD Number");
        }


    }

    public static void main(String[] args) {
        Evenodd_method obj = new Evenodd_method();
        obj.marks(2);


    }
}
