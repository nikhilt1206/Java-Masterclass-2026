package com.student.management.system.oop;

import java.util.Base64;

public class Teacher extends Person{

    private String empID;
    private String subject;
    private int yearsOfExperience;
    private double salary; //salary should be calculated and should not be initialized by constructor

    private static final double BASE_SALARY=30000; //constant (should be written in CAPs) base salary - final - should be marked as static
    private static final double EXPERIENCE_BONUS=2000;

    public Teacher(String name, int age, String contactNumber, String address, String empID, String subject, int yearsOfExperience) {
        super(name, age, contactNumber, address);
        if(validateAge(age) && validateContactNumber(contactNumber) && validateAddress(address) && validateEmpId(empID) && validateSubject(subject)
                && validateYearsOfExperience(yearsOfExperience)){
            this.name = name;
            this.age = age;
            this.contactNumber = contactNumber;
            this.address = address;
            this.empID = empID;
            this.subject = subject;
            this.yearsOfExperience = yearsOfExperience;
            calculateSalary();
        }
    }

    public boolean validateAge(int age){
        if(age>=21 && age<=65){
            return true;
        }
        else{
            System.err.println("Invalid teacher age!!");
            return false;
        }
    }

    public boolean validateContactNumber(String contactNumber){
        if(contactNumber.matches("\\d{10}")){
            return true;
        }
        else{
            System.err.println("Invalid teacher contact number!!");
            return false;
        }
    }

    public boolean validateAddress(String address){
        if(!address.isEmpty()){
            return true;
        }
        else{
            System.err.println("Invalid teacher address!!");
            return false;
        }
    }

    public boolean validateEmpId(String empID){
        if(empID.matches("T\\d{3}")){
            return true;
        }
        else{
            System.err.println("Invalid Employee ID!!");
            return false;
        }
    }

    public boolean validateSubject(String subject){
        if(!subject.isEmpty()){
            return true;
        }
        else{
            System.err.println("Invalid subject!!");
            return false;
        }
    }

    public boolean validateYearsOfExperience(int yearsOfExperience){
        if(yearsOfExperience>=0 && yearsOfExperience<=35){
            return true;
        }
        else{
            System.err.println("Invalid YOE!!");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(validateAge(age)){
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        if(validateEmpId(empID)){
            this.empID = empID;
        }
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if(validateSubject(subject)){
            this.subject = subject;
        }
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if(validateYearsOfExperience(yearsOfExperience)){
            this.yearsOfExperience = yearsOfExperience;
        }
    }

    public double getSalary() {
        return salary;
    }

    //Business logic methods should not be exposed outside the class
    private void calculateSalary(){
        salary= BASE_SALARY+(yearsOfExperience*EXPERIENCE_BONUS);
    }

    public void displayTeacherInformation(){
        System.out.println("-----------------------------Teacher Info------------------------------");
        System.out.println("TEACHER EMPLOYEE ID: "+empID);
        System.out.println("NAME: "+name);
        System.out.println("AGE: "+age);
        System.out.println("CONTACT NUMBER: "+contactNumber);
        System.out.println("ADDRESS: "+address);
        System.out.println("SUBJECT: "+subject);
        System.out.println("YEARS OF EXPERIENCE: "+yearsOfExperience);
        System.out.println("SALARY: "+"$ "+salary);
        System.out.println("-----------------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", contactNumber='" + contactNumber + '\'' +
                ", address='" + address + '\'' +
                ", empID='" + empID + '\'' +
                ", subject='" + subject + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", salary=" + salary +
                '}';
    }

    public boolean updateInformation(String newAddress, String newContactNumber){
        boolean hrApproval = getHRApproval();
        System.out.println("Notifying HR for Approval....");
        if(hrApproval){
            if(super.updateInformation(newAddress,newContactNumber)){
                System.out.println("Notifying the Teacher that information is updated....");
                return true;
            }
        }
        return false;
    }

    public boolean updateInformation(String newAddress){
        boolean hrApproval = getHRApproval();
        System.out.println("Notifying HR for Approval....");
        if(hrApproval){
            if(super.updateInformation(newAddress)){
                System.out.println("Notifying the Teacher that information is updated....");
                return true;
            }
        }
        return false;
    }

    public boolean updateInformation(String newContactNumber,boolean update){
        boolean hrApproval = getHRApproval();
        System.out.println("Notifying HR for Approval....");
        if(hrApproval){
            if(super.updateInformation(newContactNumber,update)){
                System.out.println("Notifying the Teacher that information is updated....");
                return true;
            }
        }
        return false;
    }

    private boolean getHRApproval() {
        System.out.println("HR approved the request");
        return true; //dummy method
    }
}
