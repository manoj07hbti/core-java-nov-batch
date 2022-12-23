package oops.polymorphism;

public class DemoOverrideParent {

    public void m1 () {
        System.out.println("This is m1 method of Parent Class");
    }

    protected void m2 () {
        System.out.println("This is override access modifier");
    }

    public final void m3 () {
        System.out.println("This is Final Method.");
    }

    // COVARIANT RETURN TYPE

    public DemoOverrideParent createObject() {
        return new DemoOverrideParent();
    }
}
