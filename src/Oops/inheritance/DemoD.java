package Oops.inheritance;

public class DemoD extends DemoC implements Project{

    // multiple inheritance with the help of Interface

    @Override
    public void proInfo (){
        System.out.println("Verify project information");
    }

    @Override
    public void ProSub() {
        System.out.println("Submit project");
    }

}
