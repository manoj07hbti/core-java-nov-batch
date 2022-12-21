package oops.inheritance;

public class DemoE extends DemoD implements MyInterFace{

    @Override
    public void mymethod() {
        System.out.println("method implemented here");
    }

    public static void main(String[] args) {

        DemoE obj = new DemoE();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
        obj.mymethod();
    }
}
