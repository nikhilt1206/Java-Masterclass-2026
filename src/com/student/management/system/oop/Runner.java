package com.student.management.system.oop;
import static com.student.management.system.oop.Student.*;
//al the public static variables and methods can be accessed without using Class name

public class Runner {
    public static void main(String[] args){
        //With Builder Design Pattern code is much more readable with details
//        Student s1 = new Student.StudentBuilder("Rola",18,"Gazhipur","9454730423")
//                .withRollNumber(41)
//                .withMarksObtainedInEnglish(80)
//                .withMarksObtainedInScience(90)
//                .withMarksObtainedInMaths(95)
//                .build();
//        System.out.println(s1);
//        s1.displayStudentInfo();
//        //static import - no need to use class name (improves readability)
//        //System.out.println(Student.demo); - not needed
//        System.out.println(demo);
//        System.out.println(getTotalStudentCount());

        //Person p = new Person(); - Person is abstract class - object cannot be created
    }
}
