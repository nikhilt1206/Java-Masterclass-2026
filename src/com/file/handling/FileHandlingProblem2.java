package com.file.handling;

import java.io.*;

public class FileHandlingProblem2 {
    public static void main(String[] args) {
        //Find the longest word in a file
        File myFile = new File("Input1.txt");
        FileReader fr;
        BufferedReader br;
        String largestWord="";
        String line;
        String[] words;
        try {
            fr = new FileReader(myFile);
            br = new BufferedReader(fr);
            while((line = br.readLine())!=null){
                words = line.split(" ");
                for(String word : words){
                    if(word.length()>largestWord.length()){
                        largestWord=word;
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Largest word is : "+largestWord);
    }
}
