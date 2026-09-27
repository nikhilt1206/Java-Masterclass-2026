package com.student.management.system.oop;
//package belongs to com.student.management.system.oop

public class Runner3 {
    //this is Runner class - execution will start from here - main() method
    public static void main(String[] args){

        //set() takes care of initialization
        Student s1 = new Student();
        s1.setName("Nikhil");
        s1.setRollNumber(-41);

        //get() takes care of Retrieval
        System.out.println(s1.getName());
        //since -41 cannot be passed to the instance var - rollNumber - so 0 will be the default value (will be printed as output)
        System.out.println(s1.getRollNumber());
    }
}
