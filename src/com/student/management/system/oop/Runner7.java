package com.student.management.system.oop;

public class Runner7 {
    public static void main(String[] args){
        StudentR2 ob = new StudentR2("Nikhil",20,41,67,89,68,"9454730445","Chitaipur, Varanasi");
        ob.calculateTotalMarks();
        ob.calculatePercentage();
        ob.calculateGrade();
        ob.displayStudentInfo();
    }
}
