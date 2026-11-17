package com.file.handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterVsFileWriter {
    public static void main(String[] args) {
        fw();
        bw();
    }

    private static void bw() {
        long startTime = System.nanoTime();
        File myFile = new File("abc.txt");
        FileWriter fw;
        try {
            fw = new FileWriter(myFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=1 ;i<=100; i++){
                bw.write("Hello this is Nikhil!!!I am writing something into the file using BW\n");
            }
            bw.close();
            //fw.write("Hello this is Nikhil!!!I am writing something into the file");
            //fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("BW took : " +duration);
    }

    public static void fw() {
        long startTime = System.nanoTime();
        File myFile = new File("abc.txt");
        FileWriter fw;
        try {
            fw = new FileWriter(myFile, true); //to append the content give true
            fw.write("Hello i am writing into the file from Java code23!!\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("FW took : " +duration);
    }
}

