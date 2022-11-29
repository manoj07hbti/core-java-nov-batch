package class_and_object;

public class doctorC {

    String name;
    int age;
    int experience;
    String institution;

    public doctorC(String name, int age, int experience, String institution) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.institution = institution;
    }

    public static void main(String[] args) {
        //classname obj = new classname (parameter 1,2,3,4...n);

        doctorC obj = new doctorC("Amit",35,10,"Government");
        System.out.println("Details of Doctors---->"+"\n"+"Name = " + obj.name+" , "+"Age = " + obj.age +" , "
                +"Experience = " + obj.experience+" : " +"Institution = " + obj.institution);

        doctorC obj2 =new doctorC("Rahul",40,15,"Private");
        System.out.println("Name = " + obj2.name+" , "+"Age = " + obj2.age +" , "
                +"Experience = " + obj2.experience+" : " +"Institution = " + obj2.institution);


    }
}
