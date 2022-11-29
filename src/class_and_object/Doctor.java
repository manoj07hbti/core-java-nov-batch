package class_and_object;

public class Doctor {
    // declare data member
    String name;
    String dep;
    int room;
    // parameterized constructor

    public Doctor(String name, String dep, int room) {
        this.name = name;
        this.dep = dep;
        this.room = room;
    }

    public static void main(String[] args) {
        Doctor obj = new Doctor("Deshraj Gurjar","Nephrology",05);
        System.out.println("Doctor Name : "+obj.name+", Specialist : "+obj.dep+", Room No. : "+obj.room);

        Doctor obj2 = new Doctor("Abhinit Gupta","Cardiology",11);
        System.out.println("Doctor Name : "+obj2.name+", Specialist : "+obj2.dep+", Room No. : "+obj2.room);

        Doctor obj3 = new Doctor("B K Gupta","Orthology",06); // 08 and 09 value showing error
        System.out.println("Doctor Name : "+obj3.name+", Specialist : "+obj3.dep+", Room No. : "+obj3.room);
    }
}
