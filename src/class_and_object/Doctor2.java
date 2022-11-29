package class_and_object;

public class Doctor2 {

    // Data members or properties or instance variables  of class (Doctor2)-----------name ,id ,speciality ,email address------------etc

    String name ;
    int id ;
    String speciality;
    String email_address;



    //  Created a parameterized constructor
    //  we are using this keyword to distinguish local variable and instance variable.

    public Doctor2(String name, int id, String speciality, String email_address) {
        this.name = name;   //  this.instance variable of class = local variables of parameterized constructor
        this.id = id;
        this.speciality = speciality;
        this.email_address = email_address;
    }


     // Main method to run program
     public static void main(String[] args) {

     // To create an object of class(Doctor2)---------classname  object_name = new classname();


      // object1
      Doctor2 obj1 = new Doctor2("Abhi",10,"Surgeon","abc@gmail.com");
      System.out.println(" Name is: "+obj1.name +"  Id is: "+obj1.id  +"  Speciality is: "+obj1.speciality  +"  Email is: "+obj1.email_address );


      // object2
      Doctor2 obj2 = new Doctor2("Akshay",5,"Skin Specialist","abc1@gmail.com");
      System.out.println(" Name is: "+obj2.name+" Id is: "+obj2.id+" Speciality is: "+obj2.speciality+" Email is: "+obj2.email_address);


         // object3
         Doctor2 obj3 = new Doctor2("Ankita",6,"Eye Specialist","abc2@gmail.com");
         System.out.println(" Name is: "+obj3.name+" Id is: "+obj3.id+" Speciality is: "+obj3.speciality+" Email is: "+obj3.email_address);






   }





}
