package com.student.management.system.oop;

import com.student.management.system.exceptions.InvalidAddressException;
import com.student.management.system.exceptions.InvalidContactNumberException;

public abstract class Person { //parent of Student and Teacher class
    //abstract keyword restrict object creation
    protected String name;
    protected int age;
    protected String contactNumber;
    protected String address;
    private static int personCounter=0;

    public Person(String name, int age, String contactNumber, String address) {
        if(validateAddress(address) && validateContactNumber(contactNumber)){
            this.name = name;
            this.age = age;
            this.contactNumber = contactNumber;
            this.address = address;
            personCounter++;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        if(validateContactNumber(contactNumber)){
            this.contactNumber = contactNumber;
        }
    }

    private boolean validateContactNumber(String contactNumber){
        if(contactNumber.matches("\\d{10}")){
            return true;
        }
        else{
            try{
                throw new InvalidContactNumberException("Cannot number needs to be a number");
            }
            catch(InvalidContactNumberException e){
                System.err.print(e.getMessage());
                e.printStackTrace();
            }
            return false;
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

    private boolean validateAddress(String address){
        if(address==null || address.trim().isEmpty() ){
            try{
                throw new InvalidAddressException("Address cannot be empty or null");
            } catch (InvalidAddressException e) {
                System.err.print(e.getMessage());
                e.printStackTrace();
            }
            return false;
        }
        else{
            return true;
        }
    }

    @Override //method overriding - comes from the parent class (Object class) object
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", contactNumber='" + contactNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    protected boolean updateInformation(String newAddress, String newContactNumber){
        if(validateAddress(newAddress) && validateContactNumber(newContactNumber)){
            this.address = newAddress;
            this.contactNumber = newContactNumber;
            System.out.println("Updated Address and Contact Number Info");
            return true;
        }
        else{
            return false;
        }
    }

    //Method Overloading - multiple methods are going to have same name and they will get differentiated with 2 rules:
    //1. Count of Parameters
    //2. Data Type Sequence
    //Method Overloading is Compile Time Polymorphism - happens inside a class (does not require Parent-child relationship)
    protected boolean updateInformation(String newAddress){
        if(validateAddress(newAddress)){
            this.address = newAddress;
            System.out.println("Updated Address Info");
            return true;
        }
        else{
            return false;
        }
    }

    protected boolean updateInformation(String newContactNumber, boolean update){
        if(validateContactNumber(newContactNumber)){
            this.contactNumber = newContactNumber;
            System.out.println("Updated Contact Info");
            return true;
        }
        else{
            return false;
        }
    }

    public static int getTotalPersonCount(){
        return personCounter;
    }
}
