package com.student.management.system.oop;

public class TransportFee implements Payable{

    private double baseFee;
    private int paymentMonths;
    private double siblingDiscount;
    private double finalTransportFee;

    public TransportFee(double baseFee, int paymentMonths, double siblingDiscount) {
        this.baseFee = baseFee;
        this.paymentMonths = paymentMonths;
        this.siblingDiscount = siblingDiscount;
    }

    @Override
    public double calculatePayment() {
        finalTransportFee = (baseFee * paymentMonths) - siblingDiscount;
        return finalTransportFee;
    }

    @Override
    public void generateReciept() {
        System.out.println("*******************GENERATING TRANSPORT FEES RECIEPT*********************");
        System.out.println("BASE FEES : "+baseFee);
        System.out.println("PAYMENT FOR MONTHS : "+paymentMonths);
        System.out.println("SIBLING DISCOUNT : "+siblingDiscount);
        System.out.println("TOTAL TRANSPORT FEES TO BE PAID : "+finalTransportFee);
        System.out.println("**************************THANK YOU***************************");
    }

    @Override
    public double getDiscount() {
        return siblingDiscount;
    }
}
