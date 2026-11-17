package com.file.handling;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args){
        File myFile = new File("abc.txt");
        FileReader fr;
        BufferedReader br = null;
        String line;
        //File reader helps us read individual characters but buffered reader we can read whole line
        try {
                fr = new FileReader(myFile);
                br = new BufferedReader(fr);
                while((line=br.readLine())!=null){
                    System.out.println(line);
                }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
