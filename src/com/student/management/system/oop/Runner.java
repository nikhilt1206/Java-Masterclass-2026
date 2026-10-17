package com.student.management.system.oop;

public class Runner {
    public static void main(String[] args){
        //With Builder Design Pattern code is much more readable with details
        Student s1 = new Student.StudentBuilder("Rola",18,"Gazhipur","9454730423")
                .withRollNumber(41)
                .withMarksObtainedInEnglish(80)
                .withMarksObtainedInScience(90)
                .withMarksObtainedInMaths(95)
                .build();
        System.out.println(s1);
        s1.displayStudentInfo();
    }
}
