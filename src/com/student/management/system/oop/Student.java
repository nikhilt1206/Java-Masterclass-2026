package com.student.management.system.oop;

import java.util.Objects;

public class Student extends Person {
    private final int rollNumber;
    private final double marksObtainedInEnglish;
    private final double marksObtainedInScience;
    private final double marksObtainedInMaths;
    private final double totalMarks;
    private final double percentage;
    private final String grade;
    private static int studentCount=0;


//    public Student(String name, int age, String contactNumber, String address, int rollNumber, double marksObtainedInEnglish, double marksObtainedInScience, double marksObtainedInMaths) {
//        super(name, age, contactNumber, address);
//        {
//            this.name = name;
//            this.age = age;
//            this.rollNumber = rollNumber;
//            this.marksObtainedInEnglish = marksObtainedInEnglish;
//            this.marksObtainedInScience = marksObtainedInScience;
//            this.marksObtainedInMaths = marksObtainedInMaths;
//            this.totalMarks = totalMarks;
//            this.percentage = percentage;
//            this.grade = grade;
//            this.contactNumber = contactNumber;
//            this.address = address;
//            studentCount++;
//        }
//    }

    private Student(StudentBuilder studentBuilder){
        super(studentBuilder.name,studentBuilder.age,studentBuilder.contactNumber,studentBuilder.address);
        this.rollNumber = studentBuilder.rollNumber;
        this.marksObtainedInEnglish = studentBuilder.marksObtainedInEnglish;
        this.marksObtainedInScience = studentBuilder.marksObtainedInScience;
        this.marksObtainedInMaths = studentBuilder.marksObtainedInMaths;
        totalMarks = calculateTotalMarks();
        percentage = calculatePercentage();
        grade = calculateGrade();
        studentCount++;
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

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public int getRollNumber() {
        return rollNumber;
    }

//    public void setRollNumber(int rollNumber) {
//        this.rollNumber = rollNumber;
//    }

    public double getMarksObtainedInEnglish() {
        return marksObtainedInEnglish;
    }
//
//    public void setMarksObtainedInEnglish(double marksObtainedInEnglish) {
//        this.marksObtainedInEnglish = marksObtainedInEnglish;
//    }

    public double getMarksObtainedInScience() {
        return marksObtainedInScience;
    }

//    public void setMarksObtainedInScience(double marksObtainedInScience) {
//        this.marksObtainedInScience = marksObtainedInScience;
//    }

    public double getMarksObtainedInMaths() {
        return marksObtainedInMaths;
    }

//    public void setMarksObtainedInMaths(double marksObtainedInMaths) {
//        this.marksObtainedInMaths = marksObtainedInMaths;
//    }

    public double getTotalMarks() {
        return totalMarks;
    }

//    public void setTotalMarks(double totalMarks) {
//        this.totalMarks = totalMarks;
//    }

    public double getPercentage() {
        return percentage;
    }

//    public void setPercentage(double percentage) {
//        this.percentage = percentage;
//    }

    public String getGrade() {
        return grade;
    }

//    public void setGrade(String grade) {
//        this.grade = grade;
//    }

    public String getContactNumber() {
        return contactNumber;
    }

//    public void setContactNumber(String contactNumber) {
//        if(validateContactNumber(contactNumber)){
//            this.contactNumber = contactNumber;
//        }
//    }

    public String getAddress() {
        return address;
    }

//    public void setAddress(String address) {
//        if(validateAddress(address)){
//            this.address = address;
//        }
//    }

    public double calculateTotalMarks(){
        double totalMarks = marksObtainedInEnglish + marksObtainedInScience + marksObtainedInMaths;
        return totalMarks;
    }

    public double calculatePercentage(){
        double percentage = totalMarks/3;
        return percentage;
    }

    public String calculateGrade(){
        String grade;
        if(percentage==0){
             grade="Cannot be calculated!!";
        }
        else{
             grade = GradePolicy.calculateGrade(percentage);
        }
        return grade;
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
        Student studentR2 = (Student) o;
        return age == studentR2.age && rollNumber == studentR2.rollNumber && Double.compare(marksObtainedInEnglish, studentR2.marksObtainedInEnglish) == 0 && Double.compare(marksObtainedInScience, studentR2.marksObtainedInScience) == 0 && Double.compare(marksObtainedInMaths, studentR2.marksObtainedInMaths) == 0 && Double.compare(totalMarks, studentR2.totalMarks) == 0 && Double.compare(percentage, studentR2.percentage) == 0 && Objects.equals(name, studentR2.name) && Objects.equals(grade, studentR2.grade) && Objects.equals(contactNumber, studentR2.contactNumber) && Objects.equals(address, studentR2.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, rollNumber, marksObtainedInEnglish, marksObtainedInScience, marksObtainedInMaths, totalMarks, percentage, grade, contactNumber, address);
    }

    public boolean updateInformation(String newAddress, String newContactNumber) {
        //Parent Approval
        System.out.println("Requesting Parent Approval");
        boolean parentApprovalStatus = parentApproval();
        if (parentApprovalStatus) {
            //update Person.address with newAddress and Person.contactNumber with newContactNumber
            if (super.updateInformation(newAddress, newContactNumber)) {
                System.out.println("Notifying the Parent.....");
                return true;
            } else {
                System.err.println("No approval from the Parent.....");
                return false;
            }
        }
        return false;
    }

    public boolean updateInformation(String newAddress) {
        //Parent Approval
        System.out.println("Requesting Parent Approval");
        boolean parentApprovalStatus = parentApproval();
        if (parentApprovalStatus) {
            //update Person.address with newAddress
            if (super.updateInformation(newAddress)) {
                System.out.println("Notifying the Parent.....");
                return true;
            } else {
                System.err.println("No approval from the Parent.....");
                return false;
            }
        }
        return false;
    }

    public boolean updateInformation(String newContactNumber,boolean update) {
        //Parent Approval
        System.out.println("Requesting Parent Approval");
        boolean parentApprovalStatus = parentApproval();
        if (parentApprovalStatus) {
            //update Person.contactNumber with newContactNumber
            if (super.updateInformation(newContactNumber,update)) {
                System.out.println("Notifying the Parent.....");
                return true;
            } else {
                System.err.println("No approval from the Parent.....");
                return false;
            }
        }
        return false;
    }

    //dummy method
    private boolean parentApproval(){
        return true;
    }

    public static int getTotalStudentCount(){
        return studentCount;
    }

    public static class StudentBuilder{
        //Mandatory
        private String name;
        private int age;
        private String contactNumber;
        private String address;
        //Optional
        private int rollNumber;
        private double marksObtainedInEnglish;
        private double marksObtainedInScience;
        private double marksObtainedInMaths;

        public StudentBuilder(String name, int age, String address, String contactNumber) {
            if(validateAge(age) && validateAddress(address) && validateContactNumber(contactNumber)){
                this.name = name;
                this.age = age;
                this.contactNumber = contactNumber;
                this.address = address;
            }
        }

        public StudentBuilder withRollNumber(int rollNumber){
            this.rollNumber = rollNumber;
            return this;
        }

        public StudentBuilder withMarksObtainedInEnglish(int marksObtainedInEnglish){
            this.marksObtainedInEnglish = marksObtainedInEnglish;
            return this;
        }

        public StudentBuilder withMarksObtainedInScience(int marksObtainedInScience){
            this.marksObtainedInScience = marksObtainedInScience;
            return this;
        }

        public StudentBuilder withMarksObtainedInMaths(int marksObtainedInMaths){
            this.marksObtainedInMaths = marksObtainedInMaths;
            return this;
        }

        public Student build(){
            Student student = new Student(this);
            return student;
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

        public boolean validateAddress(String address){
            if(!address.isEmpty()){
                return true;
            }
            else{
                System.err.print("Address cannot be Empty!!");
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
    }
}
