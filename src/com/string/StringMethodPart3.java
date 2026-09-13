package com.string;

import java.util.Arrays;

public class StringMethodPart3 {
    public static void main(String[] args){
        String data = "Hello World How are you ?";
        //Split this string into an array to perform manipulations - .split() method - returns string array
        //split always requires a regex (regular expression) - on what basis we want to split ? - whitespace
        String[] words = data.split(" ");
        for(String word : words){
            System.out.println(word);
        }
        //words[0]="Hello" and words[1]="World" - after splitting
        System.out.println(Arrays.toString(words));
    }
}
