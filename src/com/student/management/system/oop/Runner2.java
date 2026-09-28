package com.student.management.system.oop;

public class Runner2 {
    public static void main(String[] args){
        //Inside a class the most important variables are - instance var
        //we need to make sure that these instance var don't get invalid values
        //instance var : variables created inside class + non-static - these var are associated with objects
        //Student s1 = new Student();
        //Encapsulation : Instances vars + methods should be bound together (getters and setters)
        //When Encapsulation comes, Validations comes into the picture (controls illegal/invalid value assignment to instance variables

//        s1.setName("Nikhil");
//        s1.setRollNumber(-41);
//        s1.setAge(20);
//        s1.setMarksObtainedInEnglish(67);
//        s1.setMarksObtainedInMaths(-84);
//        s1.setMarksObtainedInScience(78);
//        s1.setGrade("B");
        //Problem : Here also, we can pass invalid values
        //With getters and setters we can do some form of validations
        //if we see any values as 0 (default value) in output, either the initialization with the setter didn't happen or something went wrong

//        System.out.println(s1.getName());
//        System.out.println(s1.getAge());
//        System.out.println(s1.getRollNumber());
//        System.out.println(s1.getMarksObtainedInEnglish());
//        System.out.println(s1.getMarksObtainedInScience());
//        System.out.println(s1.getMarksObtainedInMaths());
//        System.out.println(s1.getGrade());
//        s1.calculateTotalMarks();
    }
}
