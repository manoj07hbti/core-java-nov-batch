package oops.polymorphisim;

public class ChildOverRidingclassRuntime extends RuntimeOverRidingParentClass {

    public void runtime (){
        System.out.println("THIS IS THE CHILD RUNTIME METHOD");
    }

    //we can change the specifier private to protected // acc. to the rule of overriding

    protected void runtime2(){
        System.out.println("THIS IS THE OVER RIDING METHOD OF PARENT CLASS");

    }

    public static void main(String[] args) {

    RuntimeOverRidingParentClass obj = new RuntimeOverRidingParentClass();
    obj.runtime();

    RuntimeOverRidingParentClass obj1 = new ChildOverRidingclassRuntime();
    obj1.runtime();

    //We can not run/call ( runtime 2 ) the private and protected method

//        ChildOverRidingclassRuntime obj3 = new RuntimeOverRidingParentClass();
//        obj3.runtime();   //not possible because child class is Small than parent class

    }
}
