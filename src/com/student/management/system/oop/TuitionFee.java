package com.student.management.system.oop;

public class TuitionFee implements Payable{

    private final double baseFees;
    private final double scholarshipDeduction;
    private final double earlyPaymentDiscount;
    private double finalFeesAmount;

    public TuitionFee(double baseFees, double earlyPaymentDiscount, double scholarshipDeduction) {
        this.baseFees = baseFees;
        this.earlyPaymentDiscount = earlyPaymentDiscount;
        this.scholarshipDeduction = scholarshipDeduction;
    }

    @Override //annotations : extra info given to the class/methods/variables
    public double calculatePayment() {
        finalFeesAmount = baseFees - scholarshipDeduction - earlyPaymentDiscount;
        return finalFeesAmount;
    }

    @Override
    public void generateReciept() {
        System.out.println("*******************GENERATING FEES RECIEPT*********************");
        System.out.println("BASE FEES : "+baseFees);
        System.out.println("DEDUCTION OFFERED : -"+scholarshipDeduction);
        System.out.println("EARLY DISCOUNT : "+earlyPaymentDiscount);
        System.out.println("TOTAL FEES TO BE PAID : "+finalFeesAmount);
        System.out.println("**************************THANK YOU***************************");
    }

    @Override
    public double getDiscount() {
        return (scholarshipDeduction+earlyPaymentDiscount);
    }
}
