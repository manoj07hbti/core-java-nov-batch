package object_and_class;
public class school {
    String name = "tiny tots";
    int student = 1000;
    double fees = 2010.25;

    public static void main(String[] args) {
        school obj = new school();
        System.out.println("name of school:" + obj.name);
        System.out.println("student in school:" + obj.student);
        System.out.println("fees of school:" + obj.fees);
        System.out.println("name of school:" +obj.name +"student in school :" +"fees of school :"+ obj.fees );
    }
}