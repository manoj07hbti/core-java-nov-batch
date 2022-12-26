package oops.polymorphism;


    public class DemoOverrideChild extends DemoOverrideParent{

        public void m1() {                                        //   we can not override private method :
                                                                 //    Access only within class
                                                                  //   prottected---------> public
                                                                   //  public  X prottected
                                                                  //   public  X private

            System.out.println("This is m1 method od Child Class.");
        }

        public void m2 () {

            System.out.println("This is access modifier.");
        }

        public DemoOverrideChild createObject() {
            return new DemoOverrideChild();
        }

        public static void main(String[] args) {

            DemoOverrideParent obj = new DemoOverrideParent();
            obj.m1();

            DemoOverrideParent obj2 = new DemoOverrideChild();
            obj2.m1();

            DemoOverrideParent obj3 = new DemoOverrideChild();
            obj3.m2();

            DemoOverrideParent obj4 = new DemoOverrideParent();
            obj4.m2();
        }
}
