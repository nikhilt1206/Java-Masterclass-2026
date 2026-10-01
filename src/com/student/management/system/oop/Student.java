package com.student.management.system.oop;

import java.util.Objects;

public class Student {
    //all the instance variables should be marked as private - they cannot be accessed outside the class
    private String name;
    private int age;
    private int rollNumber;
    private double marksObtainedInEnglish;
    private double marksObtainedInScience;
    private double marksObtainedInMaths;
    private double totalMarks;
    private double percentage;
    private String grade;
    //Variable created inside the methods - local var - Stack - never initialized with default values implicitly.
    //Variables created inside the class and are non-static - Instance Variable - created in Heap memory - initialized with default value
    //Instance Variables - Properties of a Class (data properties)
    //Variables created inside the class and are static (public static int rollNumber) - Global Variables

    //methods are marked as public - instance vars are bounded to methods (encapsulation)
    //name (IV) is bounded to 2 methods - getName() and setName()
    //set - to initialize and get - to retrieve

    //Constructor is a special entity (method) inside a class which has same name as class
    //Job of a constructor is to initialize instance variables - during object creation if we want to initialize instance variables - we need constructor (executed in stack memory)
    //Constructor does not have return type as getters/setters
    //Constructor which have parameters - Parametrized Constructor - we have to call it - pass the parameters while calling it
    public Student(String name, int age, int rollNumber, double marksObtainedInEnglish, double marksObtainedInScience, double marksObtainedInMaths) {
        if(validateAge(age) && validateRollNumber(rollNumber) && validateMarks(marksObtainedInEnglish) &&
        validateMarks(marksObtainedInScience) && validateMarks(marksObtainedInMaths)){
            this.name = name;
            this.age = age;
            this.rollNumber = rollNumber;
            this.marksObtainedInEnglish = marksObtainedInEnglish;
            this.marksObtainedInScience = marksObtainedInScience;
            this.marksObtainedInMaths = marksObtainedInMaths;
        }
    }

    //getName() - to retrieve the value if the instance variable - name
    public String getName() {
        //here since we don't have any local variable called 'name' so it will be automatically considered as instance var
        //this.name also work but no need in this scenario
        return name;
    }
    //setName() - to initialize the value of IV - name - by passing the parameter as an input by the user
    public void setName(String name) {
        //inside the method the importance is given to the local variable
        //name; //this name refers to the parameter passed 'name' - local variable
        //we want to access the instance variable in a method which has similar name for local variable
        //To differentiate instance variable and local variable when they both have same name, we use - 'this' keyword
        //this.name - will refer to the instance variable and name - will refer to the local variable
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
            System.err.println("Invalid age for student!!");
        }
    }

    public boolean validateAge(int age){
        if(age<21 && age>=10){
            return true;
        }
        else{
            System.err.println("Invalid age for student!!");
            return false;
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
            System.err.println("Invalid Roll Number!!"); //in case user enters wrong/invalid value
        }
    }

    public boolean validateRollNumber(int rollNumber){
        if(rollNumber>=1 && rollNumber<=100){
            return true;
        }
        else{
            System.err.println("Invalid roll number for student!!");
            return false;
        }
    }

    public boolean validateMarks(double marksForTheSubject){
        if(marksForTheSubject>=100 || marksForTheSubject<0){
            System.err.println("Invalid marks for student!!");
            return false;
        }
        else{
            return true;
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


    //non-static method - functionality - task student object will do
    public void calculateTotalMarks(){
        totalMarks = marksObtainedInEnglish + marksObtainedInScience + marksObtainedInMaths;
    }

    public void calculatePercentage(){
        percentage = totalMarks/3;
    }

    public void calculateGrade(){
        if(percentage==0){
            grade="Cannot be calculated!!";
        }
        else {
            if (percentage >= 95) {
                grade = "A+";
            } else if (percentage >= 90) {
                grade = "A";
            } else if (percentage >= 85) {
                grade = "B+";
            } else if (percentage >= 80) {
                grade = "B";
            } else if (percentage >= 75) {
                grade = "C+";
            } else if (percentage >= 70) {
                grade = "C";
            } else if (percentage >= 65) {
                grade = "D+";
            } else if (percentage >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
        }
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public double getPercentage() {
        return percentage;
    }

    //toString() method comes from Object class - return String - creates one line description of the object's Instance Variable


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNumber=" + rollNumber +
                ", marksObtainedInEnglish=" + marksObtainedInEnglish +
                ", marksObtainedInScience=" + marksObtainedInScience +
                ", marksObtainedInMaths=" + marksObtainedInMaths +
                ", totalMarks=" + totalMarks +
                ", percentage=" + percentage +
                ", grade='" + grade + '\'' +
                '}';
    }

    //equals() method - helps to compare 2 java objects and in automation framework - for assertions
    //Two objects set to be equal when they :
    //1. Belong to same class type
    //2. Values of instance variables need to be same
    //3. 2 Objects are going to have same hashcode value (numeric representation of memory)
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && rollNumber == student.rollNumber && Double.compare(marksObtainedInEnglish, student.marksObtainedInEnglish) == 0 && Double.compare(marksObtainedInScience, student.marksObtainedInScience) == 0 && Double.compare(marksObtainedInMaths, student.marksObtainedInMaths) == 0 && Double.compare(totalMarks, student.totalMarks) == 0 && Double.compare(percentage, student.percentage) == 0 && Objects.equals(name, student.name) && Objects.equals(grade, student.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, rollNumber, marksObtainedInEnglish, marksObtainedInScience, marksObtainedInMaths, totalMarks, percentage, grade);
    }
}
