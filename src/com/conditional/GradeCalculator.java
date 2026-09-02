package com.conditional;

public class GradeCalculator {
    public static void main(String[] args){
        int percentage = 80;
        char grade;
        if(percentage>90){
            grade='A';
        }
        else if((percentage>=80) && (percentage<=90)){
            grade='B';
        }
        else if((percentage>=70) && (percentage<80)){
            grade='C';
        }
        else if((percentage>=60) && (percentage<70)){
            grade='D';
        }
        else{
            grade='F';
        }
        System.out.println(grade);
    }
}
