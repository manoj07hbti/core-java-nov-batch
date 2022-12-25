package oops.polymorphism;

public class MethodOverridingParent {


     // Syntax for method  : access_specifier  return_type function or method_name(parameter){code}

       public void m1 (){

       System.out.println("This is m1 method of parent class....");

    }

     //  Rules for method overriding:
     //  1) Method Overriding with Access-modifiers---- if we are overriding any method ,overridden (that is declared in subclass---child_class) method must not be more restricted
     //  in which we can use access modifier minimum to maximum ,but we can not use maximum to minimum
     //  private----- protected ,private------ public  ,protected-------public
     //  public > protected> default >private
     //  public ---- it can be accessible anywhere
     //  private----- it can be accessible within class
     //  protected-----it can be accessible between parent and child
     //  private is more restricted (limited or minimum) than default and default is more restricted than protected and so on




       private void m2 (){

        System.out.println("Rule 1 of method overriding .... Method Overriding with Access-modifiers... parent class");

     }

       protected void m3 (){

        System.out.println("Rule 1 of method overriding .... Method Overriding with Access-modifiers... parent class");

    }

      // 2) Final methods can not be overridden : if we do not want a method to be overridden ,we declare it as final.
      // final keyword : The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override).

       public final void m4 (){

       System.out.println(" Rule 2 of method overriding.....Final methods can not be overridden.... ");
       }

      // 3) Static methods can not be overridden

      // 4) Private methods can not be overridden : It is accessible within the class

       private void m5 (){

           System.out.println(" Rule 4 of method overriding.....Private methods can not be overridden.... ");

     }

      // 5) Covariant return type in java: before this concept generally, we can not change the return type of overridden method but a new concept
      // introduced in java called covariant where we can change the return type of overridden method.

       public MethodOverridingParent createdObject (){

         // return_type ----MethodOverridingParent-------classname or class_type  of parent class (superclass)

           System.out.println(" Rule 5 of method overriding..... Covariant return type in java....parent class");

            return new MethodOverridingParent(); // we can also write ----return this;
                                                 // this----> new MethodOverridingParent ();
                                                 // this keyword refers to the current object
                                                 // Here current object------new MethodOverridingParent ();
                                                 // Now we will override this method in the child class


     }






}
