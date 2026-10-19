package com.student.management.system.oop;

public class RunnerLatest {
    public static void main(String[] args){
        Student s1 = new RegularStudent.RegularStudentBuilder("Nikhil",14,"Bengaluru","9087435623")
                .withRollNumber(12)
                .withMarksObtainedInEnglish(89)
                .withMarksObtainedInScience(70)
                .withMarksObtainedInMaths(67)
                .build();
        System.out.println(s1);

        Student s2 = new SportStudent.SportStudentBuilder("Roli",16,"Gazhipur","7094567323")
                .withRollNumber(41)
                .withMarksObtainedInEnglish(89)
                .withMarksObtainedInScience(90)
                .withMarksObtainedInMaths(95)
                .build();
        System.out.println(s2);
    }
}
