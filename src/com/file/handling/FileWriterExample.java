package com.file.handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args){
        //Write the content into the file abc.txt
        //Tell java - where the file is ? - create a pointer - File
        File myFile = new File("abc.txt"); //relative path
        //Path should be system independent path
        FileWriter fw;
        //FileWriter - writes char stream (UTF-8 Human readable encoding) into the text file
        try {
             fw = new FileWriter(myFile,true); //to append the content give true
             fw.write("Hello i am writing into the file from Java code23!!\n"); //'\n' - escape sequence
             //if file already have content .write will overwrite the previous content
             fw.close();
             //close method will ensure that the content is written into the file
             //all the resources related to writing the file are released to avoid memory leak
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
