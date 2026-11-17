package com.file.handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args){
        //File Reader and Writer has a problem - performance - speed of input/output operation - slow
        //File writer - Java I/O - OS - Hard disk drivers - write operation in HD (I/O operation overhead)
        //Buffered Reader and Writer - very fast
        //all the read/write methods are combined into one buffer - Batch Update
        //BufferedWriter is just a wrapper - internally it uses file writer
        File myFile = new File("abc.txt");
        FileWriter fw;
        try {
                fw = new FileWriter(myFile,true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("Hello this is Nikhil!!!I am writing something into the file using BW\n");
                bw.close();
                //fw.write("Hello this is Nikhil!!!I am writing something into the file");
                //fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
