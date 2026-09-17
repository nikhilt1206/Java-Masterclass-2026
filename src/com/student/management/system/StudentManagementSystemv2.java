package com.student.management.system;

import java.util.Scanner;

public class StudentManagementSystemv2 {
    public static void main(String[] args) {
        String studentName = "Uday";
        int studentAge = 17;
        double marksObtainedInEnglish = 77.5;
        double marksObtainedInScience = 80;
        double marksObtainedInMaths = 75;
        String studentGrade = "A";
        int studentRollNumber = 22;

        System.out.println("Student Management System");
        //Read values from the console
        Scanner scanner = new Scanner(System.in);
        //Scanner - class (To read values from the console), scanner - reference variable
        //new Scanner(System.in) - object
        //System.in - reading from input device
        System.out.println("Enter the Student Name");
        studentName = scanner.next(); //.next() returns string value
        System.out.println("Enter the Student Age");
        studentAge = scanner.nextInt(); //.nextInt() returns int value
        System.out.println("Enter the Student Rollnumber");
        studentRollNumber = scanner.nextInt();
        System.out.println("Marks obtained in English");
        marksObtainedInEnglish = scanner.nextDouble(); //.nextDouble() returns double value
        System.out.println("Marks obtained in Science");
        marksObtainedInScience = scanner.nextDouble();
        System.out.println("Marks obtained in Maths");
        marksObtainedInMaths = scanner.nextDouble();
        //Grade calculation
        double totalMarksObtained = marksObtainedInEnglish + marksObtainedInScience + marksObtainedInMaths;
        double percentageObtained = totalMarksObtained / 3.0;
        if(percentageObtained>=95){
            studentGrade="A+";
        }
        else if(percentageObtained>=90){
            studentGrade="A";
        }
        else if(percentageObtained>=85){
            studentGrade="B+";
        }
        else if(percentageObtained>=80){
            studentGrade="B";
        }
        else if(percentageObtained>=75){
            studentGrade="C+";
        }
        else if(percentageObtained>=70){
            studentGrade="C";
        }
        else if(percentageObtained>=65){
            studentGrade="D";
        }
        else{
            studentGrade="F";
        }

        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age : " + studentAge);
        System.out.println("Student RollNumber : " + studentRollNumber);
        System.out.println("Marks Obtained:");
        System.out.println("English : " + marksObtainedInEnglish);
        System.out.println("Science : " + marksObtainedInScience);
        System.out.println("Maths : " + marksObtainedInMaths);
        System.out.println("Student Grade : " + studentGrade);

        //We cannot read single character with Scanner class
        //We have to read it in String format and then convert string to char! - str.charAt(0)
        //This code still store the details for only one student
        //For 1000 students do we need to create/decalre 1000 variables again and again? - not practical
        //Need a data structure to store details of n number of students - "Arrays"
    }
}
