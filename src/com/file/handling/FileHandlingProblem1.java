package com.file.handling;

import java.io.*;

public class FileHandlingProblem1 {
    public static void main(String[] args) {
        //Java program that reads a text file and counts the number of lines and characters present in the file
        File myFile = new File("Input.txt");
        FileReader fr;
        BufferedReader br;
        String line;
        int totalNumberOfLines=0;
        int totalNumberOfCharacters=0;
        try {
            fr = new FileReader(myFile);
            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                totalNumberOfLines++;
                totalNumberOfCharacters = totalNumberOfCharacters+line.length();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Total Number of lines: "+totalNumberOfLines);
        System.out.println("Total Number of Characters: "+totalNumberOfCharacters);
    }
}
