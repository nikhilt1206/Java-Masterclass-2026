package com.SerializationAndDeserialization;

import java.io.Serializable;

public class Contact implements Serializable {
    //Serializable - Marker Interface (does not contain anything variable/method) - empty interface - to do labeling - to give extra information
    //Serialization : Converting Java Object to Byte Stream
    //Deserialization : Converting Byte Stream to Java Object
    //Persistent Memory : DATA is stored for the long period of time. (DB) - slow
    //Volatile Memory : DATA is stored for short time (Stack) - fast

    private static final long serialVersionUID = 1L;
    private String name;
    private String contactNumber;
    //if we don't want to serialize emergencyContact number - transient
    private transient String emergencyContactNumber; //java will restrict serializing this instance variable

    public Contact(String name, String contactNumber,String emergencyContactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.emergencyContactNumber = emergencyContactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", emergencyContactNumber='" + emergencyContactNumber + '\'' +
                '}';
    }
}
