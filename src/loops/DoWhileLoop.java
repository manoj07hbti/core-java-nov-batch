package loops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class DoWhileLoop {

    public static void main(String[] args) {

        int i =0;
        do {
            System.out.println("This is Do While Loop "+i);
            i++;
        } while(i<5);

        // DECREMENT DO WHILE LOOP

        i= 10;
        do{
            System.out.println("Decrement do while loop "+i);
            i--;
        } while(i>0);


    }
}
