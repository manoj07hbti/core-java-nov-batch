package class_or_object;

public class Doctors {

    // DATA MEMBER

    String name;
    String professional;
    String Degree;

    // Parameterized Constructor


    public Doctors(String name, String professional, String degree) {
        this.name = name;
        this.professional = professional;
        Degree = degree;
    }

    public static void main(String[] args) {
        Doctors obj = new Doctors("Ramesh", "Heart Specialist", "MBBS");
        System.out.println("DR.Name = "+obj.name+", Professional = "+obj.professional+", Degree = "+obj.Degree);

        // SECOND OBJECT
        Doctors obj2 = new Doctors("ANAND", "DENTIST", "MBBS");
        System.out.println("DR.Name = "+obj2.name+", Professional = "+obj2.professional+", Degree = "+obj2.Degree);

        // THIRD OBJECT
        Doctors obj3 = new Doctors("Ravi", "Surgery", "MBBS");
        System.out.println("DR.Name = "+obj3.name+", Professional = "+obj3.professional+", Degree = "+obj3.Degree);

        // FOURTH OBJECT
        Doctors obj4 = new Doctors("Alok", "Cardiologist",  "MBBS");
        System.out.println("DR.Name = "+obj4.name+", Professional = "+obj4.professional+", Degree = "+obj4.Degree);

        // FIFTH OBJECT
        Doctors obj5 = new Doctors("Ranjeet", "Skin Specialist", "MBBS");
        System.out.println("DR.Name = "+obj5.name+", Professional = "+obj5.professional+", Degree = "+obj5.Degree);
    }
}
