package com.student.management.system.oop;

public class SportsActivityFee implements Payable{

    private double equipmentCharges;
    private double tournamentFees;
    private double teamUniformCost;
    private double discountForStatePlayer;
    private double finalSportsFees;

    public SportsActivityFee(double equipmentCharges, double tournamentFees, double teamUniformCost, double discountForStatePlayer) {
        this.equipmentCharges = equipmentCharges;
        this.tournamentFees = tournamentFees;
        this.teamUniformCost = teamUniformCost;
        this.discountForStatePlayer = discountForStatePlayer;
    }

    @Override
    public double calculatePayment() {
        finalSportsFees = (equipmentCharges + tournamentFees + teamUniformCost) - discountForStatePlayer;
        return finalSportsFees;
    }

    @Override
    public void generateReciept() {
        System.out.println("*******************GENERATING SPORTS FEES RECIEPT*********************");
        System.out.println("EQUIPMENT CHARGES : "+equipmentCharges);
        System.out.println("TOURNAMENT FEES : "+tournamentFees);
        System.out.println("UNIFORM COST : "+teamUniformCost);
        System.out.println("STATE PLAYER DISCOUNT : -"+discountForStatePlayer);
        System.out.println("TOTAL FEES TO BE PAID : "+finalSportsFees);
        System.out.println("**************************THANK YOU***************************");
    }

    @Override
    public double getDiscount() {
        return discountForStatePlayer;
    }
}
