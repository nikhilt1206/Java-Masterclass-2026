package com.file.handling;

import java.io.*;

public class FileHandlingProblem3 {
    public static void main(String[] args){
        //Copy contents of a text file to another text file using BufferedReader and BufferedWriter
        File sourceFile = new File("Input1.txt");
        File destinationFile = new File("dest.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))){
            String line;
            while((line= br.readLine())!=null){
                System.out.println(line);
                bw.write(line);
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
