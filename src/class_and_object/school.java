package class_and_object;

public class school {

    String School= "Primary School";
    int Totalstudents= 500;
    int Totalteachers= 20;

    public static void main(String[] args) {
        //classname obj = new classname();

        school obj =new school();

        System.out.println( "SCHOOL = "+ obj.School+ "\n" + "Total Students  = " + obj.School +
                "\n"+ "Total Teachers =  " + obj.Totalteachers  );

    }
}
