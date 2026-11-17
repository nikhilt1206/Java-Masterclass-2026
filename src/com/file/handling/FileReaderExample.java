package com.file.handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        //To read the contents of the file
        FileReader fr;
        int data = 0;
        File myFile = new File("abc.txt");
        try {
            fr = new FileReader(myFile);
            while (data != -1) {
                data = fr.read(); //return data in integer
                System.out.print((char) data); //it will give the ASCII value so we need to typecast
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
