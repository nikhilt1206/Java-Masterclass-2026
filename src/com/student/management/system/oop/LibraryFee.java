package com.student.management.system.oop;

public class LibraryFee implements Payable{

    private double basicSubscription;
    private double additionalBookCharges;
    private double lateReturnPenalty;
    private double finalLibraryFees;

    public LibraryFee(double basicSubscription, double additionalBookCharges, double lateReturnPenalty) {
        this.basicSubscription = basicSubscription;
        this.additionalBookCharges = additionalBookCharges;
        this.lateReturnPenalty = lateReturnPenalty;
    }

    @Override
    public double calculatePayment() {
        finalLibraryFees = basicSubscription + additionalBookCharges + lateReturnPenalty;
        return finalLibraryFees;
    }

    public boolean processPayment(String paymentMode){
        if(paymentMode.equalsIgnoreCase("BITCOIN")){
            System.out.println("Connecting to wallet and transfering 0.0001 Bitcoin.....");
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void generateReciept() {
        System.out.println("*******************GENERATING LIBRARY FEES RECIEPT*********************");
        System.out.println("BASIC SUBSCRIPTION : "+basicSubscription);
        System.out.println("ADDITIONAL BOOK CHARGES : "+additionalBookCharges);
        System.out.println("LATE RETURN PENALITY : "+lateReturnPenalty);
        System.out.println("TOTAL LIBRARY FEES TO BE PAID : "+finalLibraryFees);
        System.out.println("**************************THANK YOU***************************");
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}
