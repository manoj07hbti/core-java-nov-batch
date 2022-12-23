package oops.abstraction;

public interface CollegeA_Interface {

    public void c1();
    public void c2();
    public void c3();
    public void c4(); // private is not allowed because it is used by a child class..

    // TODO if we will try to make a normal method java will deny and show a error ie; it will not create a body in
    //  interface abstraction method .. because it creates a  100% abstraction


}
