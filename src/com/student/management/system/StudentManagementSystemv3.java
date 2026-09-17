package com.student.management.system;

import java.util.Scanner;

public class StudentManagementSystemv3 {
    public static void main(String[] args){
        String studentName[] = new String[100];
        //studentName - reference variable
        // new String[100] - array of string object created in Heap with size 100 - initialized to null (default value of String -NPDT)
        //This string array can only store 100 studentName because the size is fixed
        int studentAge[] = new int[100]; //initialized to 0 (default value of int - 0)
        double marksObtainedInEnglish[] = new double[100]; //initialized to 0 (default value of double - 0)
        double marksObtainedInScience[] = new double[100];
        double marksObtainedInMaths[] = new double[100];
        String studentGrade[] = new String[100];
        int studentRollNumber[] = new int[100];

        System.out.println("Student Management System");
        //Read values from the console
        Scanner scanner = new Scanner(System.in);
        //Scanner - class (To read values from the console), scanner - reference variable
        //new Scanner(System.in) - object
        //System.in - reading from input device
        System.out.println("Enter the Student Name");
        studentName[0] = scanner.next(); //Nikhil (given by user) will be stored at 0th index of studentName array
        System.out.println("Enter the Student Age");
        studentAge[0] = scanner.nextInt();
        System.out.println("Enter the Student Rollnumber");
        studentRollNumber[0] = scanner.nextInt();
        System.out.println("Marks obtained in English");
        marksObtainedInEnglish[0] = scanner.nextDouble();
        System.out.println("Marks obtained in Science");
        marksObtainedInScience[0] = scanner.nextDouble();
        System.out.println("Marks obtained in Maths");
        marksObtainedInMaths[0] = scanner.nextDouble();
        //Grade calculation
        double totalMarksObtained = marksObtainedInEnglish[0] + marksObtainedInScience[0] + marksObtainedInMaths[0];
        double percentageObtained = totalMarksObtained / 3.0;
        if(percentageObtained>=95){
            studentGrade[0]="A+";
        }
        else if(percentageObtained>=90){
            studentGrade[0]="A";
        }
        else if(percentageObtained>=85){
            studentGrade[0]="B+";
        }
        else if(percentageObtained>=80){
            studentGrade[0]="B";
        }
        else if(percentageObtained>=75){
            studentGrade[0]="C+";
        }
        else if(percentageObtained>=70){
            studentGrade[0]="C";
        }
        else if(percentageObtained>=65){
            studentGrade[0]="D";
        }
        else{
            studentGrade[0]="F";
        }

        System.out.println("Student Name : " + studentName[0]);
        System.out.println("Student Age : " + studentAge[0]);
        System.out.println("Student RollNumber : " + studentRollNumber[0]);
        System.out.println("Marks Obtained:");
        System.out.println("English : " + marksObtainedInEnglish[0]);
        System.out.println("Science : " + marksObtainedInScience[0]);
        System.out.println("Maths : " + marksObtainedInMaths[0]);
        System.out.println("Student Grade : " + studentGrade[0]);

        //Drawback : Index is hardcoded
    }
}
