package Method;

    public class Doctor{
// Data member

        String  name;
        int age;
        int type;


        // method:capability
        // treatment
        // Syntax:access_specifier return_type method_name(parameter)
        public void treatmentmethod  () {
            System.out.println("This is a method");
        }
        public void oprationmethod(){
            System.out.println("It's name is opration  method ");
        }
        public static void main(String[] args) {

            // Step 1 create object
            Doctor obj=new Doctor  ();

            // Step 2obj. name .method name();
            obj.treatmentmethod ();
            obj.oprationmethod();
        }
    }






































