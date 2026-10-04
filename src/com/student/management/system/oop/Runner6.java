package com.student.management.system.oop;

public class Runner6 {
    public static void main(String[] args){

        //Calculating percentage, total marks and grade
        StudentR2 s2 = new StudentR2("Nikhil",19,1,50,45,65,"9343765332","Bengaluru");
        s2.calculateTotalMarks();
        s2.calculatePercentage();
        s2.calculateGrade();
        System.out.println(s2);

        Student s3 = new Student("Raj",20,27,89,90,78);
        s3.calculateTotalMarks();
        s3.calculatePercentage();
        s3.calculateGrade();
        System.out.println(s3);
    }
}
