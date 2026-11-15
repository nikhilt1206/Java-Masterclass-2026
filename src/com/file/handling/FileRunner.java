package com.file.handling;

import java.io.File;
import java.io.IOException;

public class FileRunner {
    public static void main(String[] args){
        //Check if the file is present or not - path required
        // Forward Slash '/' - Linux
        // Backward Slash '\' - Windows
        //myFile - File Reference (pointer)
        File myFile = new File("/Users/nikhiltiwari/IdeaProjects/Java-Masterclass-2026/Demo.txt");
        //create a new file
        File newFile = new File("/Users/nikhiltiwari/IdeaProjects/Java-Masterclass-2026/abc.txt");
        //File will be only create if file with the same name does not exist
        try {
            if(newFile.createNewFile()){
                System.out.println("File "+newFile.getName()+" created Successfully!!");
            }
            else{
                System.out.println("Cannot create the file "+newFile.getName()+ " File already exists!!");
            }
        } catch (IOException e) {
            System.err.println("Cannot create file"+newFile.getName()+" Something went wrong!!");
            throw new RuntimeException(e);
        }
        //boolean isPresent = myFile.exists();
        //System.out.println(isPresent);
        //Complete Path - Absolute Path (getAbsolutePath())
        if(myFile.exists()){ //exists() tells whether file is present or not - returns boolean
            System.out.println(myFile.getName()+" File is Present");
            System.out.println("Path : "+myFile.getAbsolutePath());
        }
        else{
            System.out.println(myFile.getName()+" File is not Present");
        }
        //Delete the file
        if(myFile.delete()){
            System.out.println(myFile.getName()+" deleted successfully!!!");
        }
        else{
            System.out.println("Cannot delete the file, file not present");
        }
    }
}
