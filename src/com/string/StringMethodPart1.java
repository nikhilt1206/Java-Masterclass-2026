package com.string;

import java.util.Locale;

public class StringMethodPart1 {
    public static void main(String[] args){
        //String Methods
        String data = "Apple";
        String data2 = "apple";
        //equals and equalsIgnoreCase - does value check
        System.out.println(data.hashCode());
        System.out.println(data2.hashCode());
        System.out.println(data==data2); //reference (hashcode) check - false
        System.out.println(data.equals(data2)); //apple != Apple (case check, not equal)
        System.out.println(data.equalsIgnoreCase(data2)); //apple == Apple (case ignored, content same)

        //Length check - .length() method (.length - property (not method) - in array)
        System.out.println(data.length());
        //Length of the string - number of characters present in the string (including white spaces)
        String data3 = "    apple    ";
        System.out.println(data3.length()); //white spaces included

        //trim() method - remove whitespaces from starting and ending of the string - returns string
        data3 = data3.trim();
        System.out.println(data3.length());

        //toLowerCase() and toUpperCase() methods - converts lowercase to uppercase and vice versa
        System.out.println(data.toLowerCase()); //already in lowercase - apple
        System.out.println(data.toUpperCase()); //converted to uppercase - APPLE
        data=data.toLowerCase(); //this will create a new string in SIP, since strings are immutable
        //Use above methods with StringBuilder() and StringBuffer(), don't use with normal string (best practices)

        //String Concatenation - joining of multiple strings
        System.out.println(data+"abc");
        //using inbuilt method - .concat() - can use either one of them
        System.out.println(data.concat("123"));

        //charAt() method - return individual character based on given index
        System.out.println(data.charAt(4));

        //.contains() method - checks whether a certain character or a substring is present inside the main string
        //Return boolean result - true/false
        String data4 = "apple12345";
        System.out.println(data4.contains("123")); //substring "123" is present inside the string "apple12345" - true
        System.out.println(data4.contains("123b")); //sequence will be also checked - false

        //.isEmpty() method - it will tell whether a string is empty or not
        System.out.println(data.isEmpty()); //data contains "apple" so it's not empty - false
        String data5 = ""; //empty string
        System.out.println(data5.isEmpty()); //it is empty string - true
        //Empty strings are not null - default value of non-primitive data type is null (reference variable)
        String data6 = null; //memory is not allocated (nothing is there in SIP) - not pointing to anything - doesn't exist
        System.out.println(data6.isEmpty()); //We will get NullPointerException (it is not empty string - "")
    }
}
