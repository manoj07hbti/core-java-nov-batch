package classobject;

public class Building {

    String name = "kailash tower";
    int floor = 10;
    int year = 2010;
    String owner="muje nahe pata";

    public static void main(String[]args){

        Building var=new Building();

        System.out.println("The name of the owner is ="+var.owner);
        System.out.println("The number of floor is ="+var.floor);
        System.out.println("The name of the tower is ="+var.name);
        System.out.println("The year of construction is ="+var.year);

        System.out.println("Tower name ="+var.name+"   floor="+var.floor+"    year of construction="+var.year+"  owner="+var.owner);

    }
}

