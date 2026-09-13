package com.string;

public class StringMethodPart2 {
    public static void main(String[] args){
        String data = "Hello World";
        //Extract a substring out of this string
        String result = data.substring(1,4); //starting index (1) is included but ending index is excluded (4) - (1-3)
        System.out.println(result);
        String result1 = data.substring(1,5); //starting index is 1 ending index is 4
        System.out.println(result1);
        //3 strings are going to be created inside SIP - "Hello World", "ell", "ello"

        //replace method - replace a certain character inside the string
        String replacedData = data.replace('l','L');
        System.out.println(replacedData); //all 'l' in the entire string gets replaced by 'L' (replace all occurrences)

        char c = data.charAt(4);
        System.out.println(c);
        //to know the index of a particular character - .indexOf()
        int indexOfCharacter = data.indexOf('o'); //returns the index of first occurrence of 'o'
        System.out.println(indexOfCharacter);
        int lastIndexOfCharacter = data.lastIndexOf('o'); //returns the index of last occurrence of 'o'
        System.out.println(lastIndexOfCharacter);
        //if only one 'o' is present in the string then both methods will return the same output - 4
    }
}
