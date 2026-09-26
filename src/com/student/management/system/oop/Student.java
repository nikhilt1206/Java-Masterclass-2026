package com.student.management.system.oop;

public class Student {
    //all the instance variables should be marked as private - they cannot be accessed outside the class
    private String name;
    private int age;
    private int rollNumber;
    private double marksObtainedInEnglish;
    private double marksObtainedInScience;
    private double marksObtainedInMaths;
    private String grade;
    //Variable created inside the methods - local var - Stack - never initialized with default values implicitly.
    //Variables created inside the class and are non-static - Instance Variable - created in Heap memory - initialized with default value
    //Instance Variables - Properties of a Class (data properties)
    //Variables created inside the class and are static (public static int rollNumber) - Global Variables

    //methods are marked as public - instance vars are bounded to methods (encapsulation)
    //name (IV) is bounded to 2 methods - getName() and setName()
    //set - to initialize and get - to retrieve

    //getName() - to retrieve the value if the instance variable - name
    public String getName() {
        return name;
    }
    //setName() - to initialize the value of IV - name - by passing the parameter as an input by the user
    public void setName(String name) {
        this.name = name; //initialize the instance var with value we are passing as a parameter
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //age validation : so no wrong value gets entered by user
        if(age<21 && age>10){
            this.age = age;
        }
        else{
            System.out.println("Invalid age for student!!");
        }
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        if(rollNumber>=1){
            this.rollNumber = rollNumber;
        }
        else{
            System.out.println("Invalid Roll Number!!");
        }
    }

    public double getMarksObtainedInEnglish() {
        return marksObtainedInEnglish;
    }

    public void setMarksObtainedInEnglish(double marksObtainedInEnglish) {
        if(marksObtainedInEnglish>=0 && marksObtainedInEnglish<100){
            this.marksObtainedInEnglish = marksObtainedInEnglish;
        }
        else{
            System.out.println("Invalid marks for English!!");
        }
    }

    public double getMarksObtainedInScience() {
        return marksObtainedInScience;
    }

    public void setMarksObtainedInScience(double marksObtainedInScience) {
        if(marksObtainedInScience>=0 && marksObtainedInScience<100){
            this.marksObtainedInScience = marksObtainedInScience;
        }
        else{
            System.out.println("Invalid marks for Science!!");
        }
    }

    public double getMarksObtainedInMaths() {
        return marksObtainedInMaths;
    }

    public void setMarksObtainedInMaths(double marksObtainedInMaths) {
        if(marksObtainedInMaths>=0 && marksObtainedInMaths<100){
            this.marksObtainedInMaths = marksObtainedInMaths;
        }
        else{
            System.out.println("Invalid marks for Maths!!");
        }
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    //non-static method - functionality - task student object will do
    public void calculateTotalMarks(){
        double totalMarks = marksObtainedInEnglish + marksObtainedInScience + marksObtainedInMaths;
        System.out.println("Total Marks Obtained: "+totalMarks);
    }
}
