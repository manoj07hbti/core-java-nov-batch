package oops.inheritance;
//TODO JAVA DOES NOT SUPPORT MULTIPLE INHERITANCE DIRECTLY BUT INTERFACE CAN PROVIDE MULTIPLE INHERITANCE INDIRECLTY
public class DemoE extends DemoD implements MyInterface{

    @Override
    public void mymethod() {
        System.out.println("Method implemented here ");
    }
}
