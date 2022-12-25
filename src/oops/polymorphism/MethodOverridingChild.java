package oops.polymorphism;

public class MethodOverridingChild  extends  MethodOverridingParent {

    // Parent-------inheritance-------Child : inheritance is applicable only in parent and child concept
    // Syntax for inheritance :  class Child extends Parent { methods and fields}
    // Fields : Data members or Properties or instance variables or fields ------all are same
    // extends keyword : The extends keyword indicates that we are making a new class (Child class) drives from an existing class (Parent class)
    // The child class will get all things (methods and properties ) from the parent class


    // Types of Polymorphism : 1)Compile time polymorphism (it can be achieved byMethod Overloading)  2) Run time polymorphism
    // Run time polymorphism : In run time we find out which method will be the call, so it is known as run time polymorphism.it can be achieved by method overriding
    // Method_overriding definition : if subclass (child class) has the same method that declared in the parent class.it is known as method overriding in java.
    // in method overriding -----same method signature ( m1 () )but change in method body ------public void m1 (){ body}

    // Override (change in method body) : First ,we will write a method in the parent class and then  override that method in the child class.
    // public void m1 (){ body}-------it will write in the parent class------this is called as normal method
    // public void m1 (){ change in body}--------it will write in the child class-------this is called as override method

    // Method Signature : The method signature consists of the method name and the parameter list
    // Method Signature does not include the return type of the method
    // A class can not have two methods with the same signature ,If we try to declare two methods with same signature we will get a compile-time error
    // Example of Method Signature :1) public int add (int a, int b){code} 2) public double add (int a, int b){code}-----get a compile-time error

       public void m1 (){

        System.out.println("This is m1 method of child class....");

    }


       protected void m2 (){

        System.out.println("Rule 1 of method overriding .... Method Overriding with Access-modifiers... child class ");

    }

      public void m3 (){

        System.out.println("Rule 1 of method overriding .... Method Overriding with Access-modifiers... child class" );

    }

       public MethodOverridingChild createdObject () {

           // return_type ----MethodOverridingChild-------classname or class_type of child class (subclass)

        System.out.println(" Rule 5 of method overriding..... Covariant return type in java.... child class");

        return new MethodOverridingChild();  // we can also write ----return this;
                                             // this----> new MethodOverridingChild();
                                             // this keyword refers to the current object
                                             // Here current object------new MethodOverridingChild();






    }



      // Main method to run program
      public static void main(String[] args) {

          // Step1 : Created an object of class ------classname object_name = new classname ();
          // Step2 : To call method
          // new keyword :

        // Interview questions:

        // Parent class-----MethodOverridingParent
        // Variable of the parent class  ------  obj
        // object of the parent class-------- new MethodOverridingParent(); ----  with new keyword

          MethodOverridingParent obj = new MethodOverridingParent();
          obj.m1(); // which method will call ------the parent class or child class because m1 () method is available in both

                    // Here we have made object of the parent class and variable of the parent class

                    // With the new keyword which the class will create the object in run time, the method of that class will be the call
                    // created an object of the parent class with new keyword in run time and stored the object in the parent class variable---obj
                    // Therefore, the method of the parent class will be the call



          MethodOverridingParent obj2 = new MethodOverridingChild();
          obj2.m1(); // which method will call ------the parent class or child class because m1 () method is available in both

                     // Here we have made object of the child class and variable of the parent class

                     // With the new keyword which the class will create the object in run time , the method of that class will be the call
                     // created an object of the child class with new keyword in run time and stored the object in the parent class variable---obj2
                     // Therefore, the method of the child class will be the call


          /* MethodOverridingChild obj3 = new MethodOverridingParent();
           obj3.m1(); // it will give compile time error

                     // Here we have made object of the parent class and variable of the child class
                     // NOTE : We can store the object of any class (parent or child) in the variable of the parent class ,but we can not store the object in the variable of the child class
                      // because parent is greater than child

           */

          // Step1 : Created an object of class ------classname object_name = new classname ();

          MethodOverridingChild methodOverridingChild = new MethodOverridingChild();

          // Step2 : To call method

          methodOverridingChild.m1();
          methodOverridingChild.m2();
          methodOverridingChild.m3();
          methodOverridingChild.createdObject();
      }






}
