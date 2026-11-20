package com.SerializationAndDeserialization;

import java.io.*;

public class ContactRunner2 {
    public static void main(String[] args){
        //read contact.ser file and create object out of it
        FileInputStream fis;
        ObjectInputStream ois;
        try {
                fis = new FileInputStream("contact.ser");
                ois = new ObjectInputStream(fis);
                Contact data = (Contact)ois.readObject(); //gives data in object format
                System.out.println(data);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
