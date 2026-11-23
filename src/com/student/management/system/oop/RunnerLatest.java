package com.student.management.system.oop;

import java.io.*;

public class RunnerLatest {
    public static void main(String[] args) {
        File dataFile = new File("student.ser");
        if (dataFile.exists()) {
            System.out.println("Data found!! Loading from old student.ser file!!");
            deserializeData();
        } else {
            System.out.println("Data not found!!Entering new data!!");
            Student s1 = new RegularStudent.RegularStudentBuilder("Nikhil", 19, "Bengaluru", "9087435623")
                    .withRollNumber(12)
                    .withMarksObtainedInEnglish(89)
                    .withMarksObtainedInScience(70)
                    .withMarksObtainedInMaths(67)
                    .build();
            Student s2 = new SportStudent.SportStudentBuilder("Roli", 18, "Gazhipur", "7094567323")
                    .withSportsScore(70)
                    .withRollNumber(41)
                    .withMarksObtainedInEnglish(89)
                    .withMarksObtainedInScience(90)
                    .withMarksObtainedInMaths(95)
                    .build();
            Student s3 = new SportStudent.SportStudentBuilder("Rajat", 19, "Allahbad", "7094567323")
                    .withSportsScore(70)
                    .withRollNumber(41)
                    .withMarksObtainedInEnglish(89)
                    .withMarksObtainedInScience(90)
                    .withMarksObtainedInMaths(95)
                    .build();
            //Array of objects
            Student[] studentArray = new Student[3];
            studentArray[0] = s1;
            studentArray[1] = s2;
            studentArray[2] = s3;
            serializeData(studentArray);
        }
    }

    public static void serializeData(Student[] studentArray) {
        //Convert Student object to Byte stream - .ser or .dat file (BLOB files)
        File serializedData = new File("student.ser");
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(serializedData);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentArray);
            System.out.println("Data stored successfully!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserializeData() {
        File serializedData = new File("student.ser");
        FileInputStream fis;
        ObjectInputStream ois;
        Student[] data = null;
        try {
            fis = new FileInputStream(serializedData);
            ois = new ObjectInputStream(fis);
            data = (Student[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (Student s : data) {
            System.out.println(s);
        }
    }
}
