package com.student.management.system.oop;

public class Runner5 {
    public static void main(String[] args){

        Student s1 = new Student("Uday",12,22,80,70,89,"B");

        s1.setName("Uday P");
        s1.setRollNumber(33);

        //Print/Retrieve values of the Student object - onw way to print (7 lines to be written for getting output)
        System.out.println(s1.getName());
        System.out.println(s1.getRollNumber());
        System.out.println(s1.getAge());

        System.out.println(s1.getMarksObtainedInEnglish());
        System.out.println(s1.getMarksObtainedInScience());
        System.out.println(s1.getMarksObtainedInMaths());
        System.out.println(s1.getGrade());

        //We can use toString() method to print - one line description of the object's Instance variables
        System.out.println(s1);

        Student s2 = new Student("Nikhil",19,1,50,45,65,"C");
        System.out.println(s2);

        System.out.println(s1.equals(s2)); //since s1 and s1 are different objects so output will be false

        Student s3 = new Student("Nikhil",19,1,50,45,65,"C");
        //both s2 and s3 are of same class type, having same values for instance variables and same hashcode
        System.out.println(s2.equals(s3)); //true
    }
}
