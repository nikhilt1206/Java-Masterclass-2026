package com.student.management.system;

public class StudentManagementSystem {
    public static void main(String[] args){

        //Store the information of Student
        String studentName = "Uday";
        int studentAge = 17;
        double marksObtainedInEnglish = 77.5;
        double marksObtainedInScience = 80;
        double marksObtainedInMaths = 75;
        String studentGrade = "A";
        int studentRollNumber = 22;
        System.out.println("Student Management System");
        System.out.println("Student Name : "+studentName);
        System.out.println("Student Age : "+studentAge);
        System.out.println("Student RollNumber : "+studentRollNumber);

        System.out.println("Marks Obtained:");
        System.out.println("English : "+marksObtainedInEnglish);
        System.out.println("Science : "+marksObtainedInScience);
        System.out.println("Maths : "+marksObtainedInMaths);
        System.out.println("Student Grade : "+studentGrade);
    }
}
