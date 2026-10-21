package com.student.management.system.oop;

public interface Payable {
    /*Interface is always going to have variables as CONSTANT
    * Methods are going to be abstract (but these things were there before Java 8
    * Java 8 onwards : we will have default methods having body and are public
    * Java 9 onwards : we can make default methods as private*/

    public abstract double calculatePayment();

    public default boolean processPayment(String paymentMode){
        if(paymentMode.equalsIgnoreCase("CASH") || paymentMode.equalsIgnoreCase("UPI")
                || paymentMode.equalsIgnoreCase("CARD")){
            System.out.println("Processing Payment......");
            System.out.println("Payment Successful");
            return true;
        }
        else{
            System.err.println("Something went wrong!!!");
            return false;
        }
    }

    public abstract void generateReciept();

    public abstract double getDiscount();


}
