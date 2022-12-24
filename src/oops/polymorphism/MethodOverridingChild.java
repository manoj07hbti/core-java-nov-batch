package oops.polymorphism;

public class MethodOverridingChild extends MethodOverridingParent {


    public void m1(){

        System.out.println("This is M1 method of CHILD class");
    }

    public void m2(){

        System.out.println("CHILD : 1.Overriding and Access-Modifiers  Rule ");
    }


    private void m4(){

        System.out.println("CHILD This is private method ");
    }

    public MethodOverridingChild createObject(){

        return new MethodOverridingChild();
    }


    public static void main(String[] args) {

        MethodOverridingParent obj= new MethodOverridingParent();


        obj.m1(); //PARENT because object is created of parent class in runtime

        MethodOverridingParent obj2=  new MethodOverridingChild();
        obj2.m1();// CHILD because object is created of child class in runtime

      /*  MethodOverridingChild obj3= new MethodOverridingParent();
        obj3.m1();// COMPILE TIME ERROR */


    }

}
