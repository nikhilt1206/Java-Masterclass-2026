package com.student.management.system.oop;

public class PaymentRunner {
    public static void main(String[] args){

        Payable payable = new TuitionFee(50000,10000,5000);
        payable.processPayment(PaymentMode.CARD);
        payable.calculatePayment();
        payable.generateReciept();
        System.out.println(payable.getDiscount());
        System.out.println(PaymentMode.CARD.getDescription());

        int index = PaymentMode.CARD.ordinal(); //gives index of the value
        System.out.println(index);

        //Convert String to enum
        PaymentMode p = PaymentMode.valueOf("UPI"); //returns enum representation
        System.out.println(p);

        PaymentMode[] modes = PaymentMode.values(); //returns array - to read entire values in our enum
        for(PaymentMode mode : modes){
            System.out.println(mode);
        }

        PaymentMode.CARD.demo();
        PaymentMode.CARD.test();


//        Payable payable1 = new SportsActivityFee(5000,3000,2000,1000);
//        payable1.processPayment("CASH");
//        payable1.calculatePayment();
//        payable1.generateReciept();
//        System.out.println(payable1.getDiscount());
//
//        Payable payable2 = new TransportFee(1000,3,500);
//        payable2.processPayment("CASH");
//        payable2.calculatePayment();
//        payable2.generateReciept();
//        System.out.println(payable2.getDiscount());
//
//        Payable payable3     = new LibraryFee(500,200,100);
//        payable3.processPayment("BITCOIN");
//        payable3.calculatePayment();
//        payable3.generateReciept();
//        System.out.println(payable3.getDiscount());
    }
}
