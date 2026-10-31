package com.exception.handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example7TryCatchResources {
    public static void main(String[] args){
        //Introduced in Java 7 - Optimizes try-catch-finally block
        //If we use try with resources or try-catch with resources, java will automatically close the BufferedReader once it's job is done
        File file = new File("Demo.txt"); //point - telling java where file is present
        String data = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file)))
        {
            data = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(data);
    }
}
