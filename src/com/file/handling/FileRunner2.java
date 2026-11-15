package com.file.handling;

import java.io.File;

public class FileRunner2 {
    public static void main(String[] args){
        //if the file is directly present in the project (root), we need not have to give the full path
        File myFile = new File("demo/report.txt");
        System.out.println(myFile.getName());
        System.out.println(myFile.getAbsolutePath());
        System.out.println(myFile.isFile());
        System.out.println(myFile.isDirectory());
        System.out.println(myFile.canRead());
        System.out.println(myFile.canWrite());
        System.out.println(myFile.canExecute());
        System.out.println("Parent Folder : "+myFile.getParent());
        System.out.println("Size of the File : "+myFile.length()); //in bytes
        //Create a directory
        File logDirectory = new File("logs");
        logDirectory.mkdir();
        System.out.println(logDirectory.isDirectory());
    }
}
