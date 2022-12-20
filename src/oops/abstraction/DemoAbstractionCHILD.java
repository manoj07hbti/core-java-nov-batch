package oops.abstraction;

    public class DemoAbstractionCHILD extends DemoAbstraction {


        @Override
        public void m1() {
            System.out.println("This is implemented method ");
        }


        public static void main(String[] args) {

            DemoAbstractionCHILD obj= new DemoAbstractionCHILD();
            obj.m1();
            obj.m2();
            obj.m3();
        }
    }

