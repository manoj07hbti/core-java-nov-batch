package Method;

public class Dog {
    // data member

       String Dog;
        String faithful;
        int colour;

        //method : capability
        //Syntax : access_specifier return_type  method_name (parameter) {CODE..}

     public void nameMethod() {
            System.out.println("Dog name is Tommy");
        }

        public void dogMethod() {
            System.out.println("Dogs barks at strangers.");
        }

        public void colourMethod() {
            System.out.println("Its colour is black");

        }

        public static void main(String[] args) {


            // access the method ---- // step 1 - create object SYNTAX - ClassName ObjName = new ClassName();

            Dog obj = new Dog();

            // access the method ---- // step 2 - obj name. method name name();

            obj.nameMethod();
            obj.dogMethod();
            obj.colourMethod();
        }

    }




