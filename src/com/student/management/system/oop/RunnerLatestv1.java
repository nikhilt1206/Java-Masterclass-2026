package com.student.management.system.oop;

import java.io.*;
import java.util.Scanner;

public class RunnerLatestv1 {
    public static void main(String[] args) {
        File dataFile = new File("student.ser");
        System.out.println("******************************STUDENT MANAGEMENT SYSTEM******************************");
        if (dataFile.exists()) {
            System.out.println("Backup found. Retrieving student data...");
            deserializeData();
        } else {
            System.out.println("Data not found!!Entering new data!!");
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many student info you would like to store...");
            int sizeOfStudentArray = scanner.nextInt();
            Student[] studentArray = new Student[sizeOfStudentArray];
            scanner.nextLine();
            for (int index = 0; index < studentArray.length; index++) {
                System.out.println("Enter Student Name : ");
                String studentName = scanner.nextLine();
                System.out.println(studentName);
                System.out.println("Enter Student Age : ");
                int studentAge = scanner.nextInt();
                System.out.println(studentAge);
                scanner.nextLine();
                System.out.println("Enter Student Address : ");
                String studentAddress = scanner.nextLine();
                System.out.println(studentAddress);
                System.out.println("Enter Parents Contact Number : ");
                String parentContactNumber = scanner.nextLine();
                System.out.println(parentContactNumber);
                System.out.println("Enter Student Roll Number : ");
                int studentRollNumber = scanner.nextInt();
                System.out.println(studentRollNumber);
                scanner.nextLine();
                System.out.println("Enter Student Marks in Science : ");
                int marksObtainedInScience = scanner.nextInt();
                System.out.println(marksObtainedInScience);
                scanner.nextLine();
                System.out.println("Enter Student Marks in English : ");
                int marksObtainedInEnglish = scanner.nextInt();
                System.out.println(marksObtainedInEnglish);
                scanner.nextLine();
                System.out.println("Enter Student Marks in Maths : ");
                int marksObtainedInMaths = scanner.nextInt();
                System.out.println(marksObtainedInMaths);
                scanner.nextLine();

                System.out.println("Is the student a sport student? Yes or No");
                String isSportStudent = scanner.nextLine();
                if (isSportStudent.equalsIgnoreCase("yes")) {
                    System.out.println("Enter Student score in Sports : ");
                    int scoreInSports = scanner.nextInt();
                    System.out.println(scoreInSports);
                    scanner.nextLine();
                    Student s2 = new SportStudent.SportStudentBuilder(studentName, studentAge, studentAddress, parentContactNumber)
                            .withSportsScore(scoreInSports)
                            .withRollNumber(studentRollNumber)
                            .withMarksObtainedInEnglish(marksObtainedInEnglish)
                            .withMarksObtainedInScience(marksObtainedInScience)
                            .withMarksObtainedInMaths(marksObtainedInMaths)
                            .build();
                    studentArray[index] = s2;
                    System.out.println(s2);
                } else if (isSportStudent.equalsIgnoreCase("no")) {
                    Student s1 = new RegularStudent.RegularStudentBuilder(studentName, studentAge, studentAddress, parentContactNumber)
                            .withRollNumber(studentRollNumber)
                            .withMarksObtainedInEnglish(marksObtainedInEnglish)
                            .withMarksObtainedInScience(marksObtainedInScience)
                            .withMarksObtainedInMaths(marksObtainedInMaths)
                            .build();
                    studentArray[index] = s1;
                } else {
                    throw new IllegalArgumentException("Option to enter yes or no.....");
                }
            }
            for(Student data : studentArray){
                System.out.println(data);
            }
            serializeData(studentArray);
//            Student s3 = new SportStudent.SportStudentBuilder("Rajat", 19, "Allahbad", "7094567323")
//                    .withSportsScore(70)
//                    .withRollNumber(41)
//                    .withMarksObtainedInEnglish(89)
//                    .withMarksObtainedInScience(90)
//                    .withMarksObtainedInMaths(95)
//                    .build();
//            //Array of objects
//            Student[] studentArray = new Student[3];
//            studentArray[0] = s1;
//            studentArray[1] = s2;
//            studentArray[2] = s3;
//            serializeData(studentArray);
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
