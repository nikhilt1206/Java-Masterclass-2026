package com.student.management.system.oop;

import java.util.Objects;

public class StudentR2 {
    private String name;
    private int age;
    private int rollNumber;
    private double marksObtainedInEnglish;
    private double marksObtainedInScience;
    private double marksObtainedInMaths;
    private double totalMarks;
    private double percentage;
    private String grade;
    private String contactNumber;
    private String address;

    public StudentR2(String name, int age, int rollNumber, double marksObtainedInEnglish, double marksObtainedInScience, double marksObtainedInMaths, String contactNumber, String address) {
        if(validateAge(age) && validateRollNumber(rollNumber) && validateMarks(marksObtainedInEnglish) && validateMarks(marksObtainedInScience) && validateMarks(marksObtainedInMaths) && validateAddress(address)
        && validateContactNumber(contactNumber)){
            this.name = name;
            this.age = age;
            this.rollNumber = rollNumber;
            this.marksObtainedInEnglish = marksObtainedInEnglish;
            this.marksObtainedInScience = marksObtainedInScience;
            this.marksObtainedInMaths = marksObtainedInMaths;
            this.contactNumber = contactNumber;
            this.address = address;
        }
    }

    public boolean validateAddress(String address){
        if(!address.isEmpty()){
            return true;
        }
        else{
            System.err.print("Address cannot be Empty!!");
            return false;
        }
    }

    private boolean validateMarks(double marksForTheSubject) {
        if(marksForTheSubject>=100 || marksForTheSubject<0){
            System.err.println("Invalid marks for student!!");
            return false;
        }
        else{
            return true;
        }
    }

    private boolean validateRollNumber(int rollNumber) {
        if(rollNumber>=1 && rollNumber<=100){
            return true;
        }
        else{
            System.err.println("Invalid roll number for student!!");
            return false;
        }
    }

    private boolean validateAge(int age) {
        if(age<21 && age>=10){
            return true;
        }
        else{
            System.err.println("Invalid age for student!!");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getMarksObtainedInEnglish() {
        return marksObtainedInEnglish;
    }

    public void setMarksObtainedInEnglish(double marksObtainedInEnglish) {
        this.marksObtainedInEnglish = marksObtainedInEnglish;
    }

    public double getMarksObtainedInScience() {
        return marksObtainedInScience;
    }

    public void setMarksObtainedInScience(double marksObtainedInScience) {
        this.marksObtainedInScience = marksObtainedInScience;
    }

    public double getMarksObtainedInMaths() {
        return marksObtainedInMaths;
    }

    public void setMarksObtainedInMaths(double marksObtainedInMaths) {
        this.marksObtainedInMaths = marksObtainedInMaths;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        if(validateContactNumber(contactNumber)){
            this.contactNumber = contactNumber;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(validateAddress(address)){
            this.address = address;
        }
    }

    public boolean validateContactNumber(String contactNumber){
        if(contactNumber!=null && contactNumber.matches("\\d{10}")){
            return true;
        }
        else{
            System.err.print("Invalid contact number!!");
            return false;
        }
    }

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

    @Override
    public String toString() {
        return "StudentR2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNumber=" + rollNumber +
                ", marksObtainedInEnglish=" + marksObtainedInEnglish +
                ", marksObtainedInScience=" + marksObtainedInScience +
                ", marksObtainedInMaths=" + marksObtainedInMaths +
                ", totalMarks=" + totalMarks +
                ", percentage=" + percentage +
                ", grade='" + grade + '\'' +
                ", contactNumber=" + contactNumber +
                ", address='" + address + '\'' +
                '}';
    }

    public void displayStudentInfo(){
        System.out.println("---------------------------Student Information-------------------------------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Contact Number: "+contactNumber);
        System.out.println("Address: "+address);
        System.out.println("English Marks: "+marksObtainedInEnglish);
        System.out.println("Science Marks: "+marksObtainedInScience);
        System.out.println("Maths Marks: "+marksObtainedInMaths);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Percentage: "+percentage+"%");
        System.out.println("Grade: "+grade);
        System.out.println("-------------------------------------------------------------------------------");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StudentR2 studentR2 = (StudentR2) o;
        return age == studentR2.age && rollNumber == studentR2.rollNumber && Double.compare(marksObtainedInEnglish, studentR2.marksObtainedInEnglish) == 0 && Double.compare(marksObtainedInScience, studentR2.marksObtainedInScience) == 0 && Double.compare(marksObtainedInMaths, studentR2.marksObtainedInMaths) == 0 && Double.compare(totalMarks, studentR2.totalMarks) == 0 && Double.compare(percentage, studentR2.percentage) == 0 && contactNumber == studentR2.contactNumber && Objects.equals(name, studentR2.name) && Objects.equals(grade, studentR2.grade) && Objects.equals(address, studentR2.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, rollNumber, marksObtainedInEnglish, marksObtainedInScience, marksObtainedInMaths, totalMarks, percentage, grade, contactNumber, address);
    }
}
