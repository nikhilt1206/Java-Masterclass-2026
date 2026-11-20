package com.SerializationAndDeserialization;

import java.io.*;

public class ContactRunner {
    public static void main(String[] args) {
        Contact contactOne = new Contact("Uday", "9454760883","9999999999");
        //We will be serializing the contactOne object
        //Convert contactOne object to serialized file
        //Way of creating byte stream file (not readable file) - FileOutputStream
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
                fos = new FileOutputStream("contact.ser"); //write the file
                //oos gives us method using which we can write contactOne object into contact.ser
                oos = new ObjectOutputStream(fos);
                oos.writeObject(contactOne);
                System.out.println("Contact object is Serialized!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(contactOne);


    }
}
