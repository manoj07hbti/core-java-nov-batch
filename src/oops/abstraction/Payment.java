package oops.abstraction;

public interface Payment {

    // Design a payment software with different features
    // Different_features means nothing is common then all methods will make abstract methods
    // Abstract method : A method without a method body
    // Payment : GooglePay ,PhonePe ,Paytm----app
    // Different_features ---check balance ,transfer money ,check the last ten transaction----etc.
    // We will use only interface for different features
    // Interface access by child class

    // Syntax for Abstract method: access_specifier abstract return_type  function or method_name(); --------public abstract void function or method_name();

    public abstract void checkBalance(); // All abstract methods

    public abstract void transferMoney();

    public abstract void checkLastTenTransaction();

    public abstract void changeProfilePhoto();



}
