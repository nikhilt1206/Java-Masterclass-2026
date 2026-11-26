package com.student.management.system.oop;

public class CollectionRunner1 {
    public static void main(String[] args){
        Student s1 = new SportStudent.SportStudentBuilder("Uday", 11, "Pune", "9453750443")
                .withSportsScore(75)
                .withRollNumber(78)
                .withMarksObtainedInEnglish(65)
                .withMarksObtainedInScience(90)
                .withMarksObtainedInMaths(80)
                .build();
        Student s2 = new RegularStudent.RegularStudentBuilder("Ritu", 12, "Mumbai", "9876234589")
                .withRollNumber(24)
                .withMarksObtainedInEnglish(90)
                .withMarksObtainedInScience(80)
                .withMarksObtainedInMaths(70)
                .build();
        Student[] studentData = new Student[100]; //fixed size array - Drawback1
        studentData[0]=s1;
        studentData[1]=s2;
        //To store the new object data, we need and index - manually have to provide the index
        //Keep track of indexes, where data is going to be stored - Drawback2
        //Homogeneous Data - we can only store similar entries inside the array - Drawback3
        //Insert and Delete operation in Array is difficult - Drawback4
        //In Arrays, there is no in-built solution for Sorting, Searching (Custom logic needed) - Drawback5
        //Stores the data in Organized order - Retrieval of records is very fast - Array Advantage
    }
}
