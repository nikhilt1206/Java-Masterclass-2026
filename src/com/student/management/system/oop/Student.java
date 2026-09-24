package com.student.management.system.oop;

public class Student {
    String name;
    int age;
    int rollNumber;
    double marksObtainedInEnglish;
    double marksObtainedInScience;
    double marksObtainedInMaths;
    String grade;
    //Variable created inside the methods - local var - Stack - never initialized with default values implicitly.
    //Variables created inside the class and are non-static - Instance Variable - created in Heap memory - initialized with default value
    //Instance Variables - Properties of a Class (data properties)
    //Variables created inside the class and are static (public static int rollNumber) - Global Variables

    //non-static method - functionality - task student object will do
    public void calculateTotalMarks(){
        double totalMarks = marksObtainedInEnglish + marksObtainedInScience + marksObtainedInMaths;
        System.out.println("Total Marks Obtained: "+totalMarks);
    }
}
