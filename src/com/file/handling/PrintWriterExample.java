package com.file.handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) {
        //Used for the formatting stuffs
        File myFile = new File("data.txt");
        PrintWriter pw;
        float percentage = 78.3454f;
        try {
            pw = new PrintWriter(myFile);
            pw.write("This is a random text \n");
            pw.write("Name\tMarks\n");
            pw.format("%-10s %-3d%n","Nikhil",75); // - means space will come after the value
            pw.format("%-10s %-3d%n","Uday",89);
            pw.format("%-10s %-3d%n","Aditya",90);
            pw.format("%-10s %-3.2f%n","Ritu",percentage);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
