package class_or_object;

public class Engineer {

    String name = "I am a CSE Engineer";
    String college = "Govt. Leather Institute Agra";

    String type = "Polytechnic";

    public static void main(String[] args) {

        Engineer obj = new Engineer();
        System.out.println(obj.name+" from "+obj.college+" and course type is "+obj.type);
    }
}
