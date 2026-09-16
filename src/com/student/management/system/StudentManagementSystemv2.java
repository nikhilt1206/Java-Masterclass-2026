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


        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age : " + studentAge);
        System.out.println("Student RollNumber : " + studentRollNumber);
        System.out.println("Marks Obtained:");
        System.out.println("English : " + marksObtainedInEnglish);
        System.out.println("Science : " + marksObtainedInScience);
        System.out.println("Maths : " + marksObtainedInMaths);
        System.out.println("Student Grade : " + studentGrade);
    }
}
