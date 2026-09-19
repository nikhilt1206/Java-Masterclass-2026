package com.student.management.system;

import java.util.Scanner;

public class StudentManagementSystemv4 {
    public static String studentName[] = new String[100];
    public static int studentAge[] = new int[100];
    public static double marksObtainedInEnglish[] = new double[100];
    public static double marksObtainedInScience[] = new double[100];
    public static double marksObtainedInMaths[] = new double[100];
    public static String studentGrade[] = new String[100];
    public static int studentRollNumber[] = new int[100];
    public static Scanner scanner = new Scanner(System.in);
    public static int index = 0;

    public static void main(String[] args) {
        System.out.println("Student Management System");
        int option;
        while (true) {
            System.out.println("1. Add a Student");
            System.out.println("2. Print Student Details");
            System.out.println("3. Print all Student Details");
            System.out.println("4. EXIT");
            System.out.println("Enter an option from [1-4]:");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    addStudent(); //static methods can call another static methods
                    break;
                case 2:
                    printStudentInformation(); //static methods can call another static methods
                    break;
                case 3:
                    printAllStudentInformation(); //static methods can call another static methods
                    break;
                case 4:
                    exitApp(); //static methods can call another static methods
                    break;
            }
        }
    }

    private static void exitApp() {
        System.out.println("Exiting from the app......");
        System.exit(0);
    }

    private static void printAllStudentInformation() {
        System.out.println("Printing all Student Information");
        for (int i = 0; i < index; i++) {
            System.out.println("=============================================");
            System.out.println("Student Name : " + studentName[i]);
            System.out.println("Student Age : " + studentAge[i]);
            System.out.println("Student RollNumber : " + studentRollNumber[i]);
            System.out.println("Marks Obtained:");
            System.out.println("English : " + marksObtainedInEnglish[i]);
            System.out.println("Science : " + marksObtainedInScience[i]);
            System.out.println("Maths : " + marksObtainedInMaths[i]);
            System.out.println("Student Grade : " + studentGrade[i]);
            System.out.println("=============================================");
        }
    }

    private static void printStudentInformation() {
        System.out.println("Printing Student Information");
        System.out.println("Enter the index:");
        int userIndex = scanner.nextInt();
        System.out.println("Student Name : " + studentName[userIndex]);
        System.out.println("Student Age : " + studentAge[userIndex]);
        System.out.println("Student RollNumber : " + studentRollNumber[userIndex]);
        System.out.println("Marks Obtained:");
        System.out.println("English : " + marksObtainedInEnglish[userIndex]);
        System.out.println("Science : " + marksObtainedInScience[userIndex]);
        System.out.println("Maths : " + marksObtainedInMaths[userIndex]);
        System.out.println("Student Grade : " + studentGrade[userIndex]);
    }

    public static void addStudent() {
        System.out.println("Enter the Student Name");
        studentName[index] = scanner.next();
        System.out.println("Enter the Student Age");
        studentAge[index] = scanner.nextInt();
        System.out.println("Enter the Student Rollnumber");
        studentRollNumber[index] = scanner.nextInt();
        System.out.println("Marks obtained in English");
        marksObtainedInEnglish[index] = scanner.nextDouble();
        System.out.println("Marks obtained in Science");
        marksObtainedInScience[index] = scanner.nextDouble();
        System.out.println("Marks obtained in Maths");
        marksObtainedInMaths[index] = scanner.nextDouble();
        //Grade calculation
        double totalMarksObtained = marksObtainedInEnglish[index] + marksObtainedInScience[index] + marksObtainedInMaths[index];
        double percentageObtained = totalMarksObtained / 3.0;
        if (percentageObtained >= 95) {
            studentGrade[index] = "A+";
        } else if (percentageObtained >= 90) {
            studentGrade[index] = "A";
        } else if (percentageObtained >= 85) {
            studentGrade[index] = "B+";
        } else if (percentageObtained >= 80) {
            studentGrade[index] = "B";
        } else if (percentageObtained >= 75) {
            studentGrade[index] = "C+";
        } else if (percentageObtained >= 70) {
            studentGrade[index] = "C";
        } else if (percentageObtained >= 65) {
            studentGrade[index] = "D";
        } else {
            studentGrade[index] = "F";
        }
        index++;
        System.out.println("Student info stored successfully!");
    }
    //Procedural Programming - Everything is broken down into methods - sequential execution
    //entry point - main(), global access point (all the data structures and variables are available at the global level)
    //data is scattered across multiple arrays - access name, accessing marks, access age, access roll number (different arrays used)
    //No validations - age you can give 12345, roll number can give -13 (for invalid values we are getting the output)
    //Global access point - all the methods can access it so no security (anyone can modify anything)
    //No Scalability - student array can store only 100 student info (cannot be scaled since size is fixed)
    //Not modification friendly - later we have to add anything else so again have to create another array - have to change code all the places
    //Cannot be customized (ex- subjects) - other schools may have 5-7 subject - have to recreate the application
    //In order so overcome all above problem - Object-Oriented Programming (OOP) came
}
