package oops.polymorphisim;

public class RuntimeOverRidingParentClass {

    public void runtime (){
        System.out.println("THIS IS THE PARENT RUNTIME METHOD");

    }

    private void runtime2(){
        System.out.println("THIS IS THE OVER RIDING METHOD OF PARENT CLASS");
    }

    public static void main(String[] args) {
        RuntimeOverRidingParentClass obj = new RuntimeOverRidingParentClass();
        obj.runtime();
        obj.runtime2();


    }
}
