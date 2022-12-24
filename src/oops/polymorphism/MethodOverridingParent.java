package oops.polymorphism;

public class MethodOverridingParent {

    public void m1(){

        System.out.println("This is M1 method of PARENT class");
    }

    protected void m2(){

        System.out.println("1.Overriding and Access-Modifiers  Rule ");
    }

    public final void m3(){

        System.out.println("THIS IS FINAL METHOD ");
    }

    private void m4(){

        System.out.println("This is private method ");
    }


    public MethodOverridingParent createObject(){

        return new MethodOverridingParent();
    }
}
