package oops.abstraction;

public class Automobile extends Company {


    @Override
    public void salary() {
    }
                                               // use scanner to store the data and stop the code after entry
    @Override
    public void holiday() {

    }

    @Override
    public void shift() {

    }

    public static void main(String[] args) {



        Automobile obj = new Automobile();
        obj.companyname();
        obj.employename();
        obj.department();
        obj.shift();
        obj.holiday();
        obj.salary();
    }
}
