package com.exception.handling;

import java.io.*;

public class Example6 {
    public static void main(String[] args){
        //Java to read the Demo.txt file and print its contents in the console
        File file = new File("Demo.txt"); //point - telling java where file is present
        //To read the file
        //we should not declare variables inside try block (should happen before try block)
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        String data = null;
        try {
            //only keep the code which is risky and could trigger exception inside try block
            fileReader = new FileReader(file);
            //BufferedReader reads the content line by line
            bufferedReader = new BufferedReader(fileReader);
            data = bufferedReader.readLine();
        } catch (IOException e) { //Parent class reference used instead of child class
            e.printStackTrace();
        }
        //Here fileReader might cause checked exception (compile time) so we need to handle it explicitly using catch block
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(data);
    }
}
