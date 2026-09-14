package com.string;

public class StringInternMethod {
    public static void main(String[] args){
        //Two ways of declaring the String Literal
        String data = "Hello World"; //gets created in the String Intern Pool
        //Using new keyword (String class object)
        String data1 = new String("Hello World"); //gets created in Heap Memory
        //Difference is if we create another string literal using new keyword -> another new string gets created in the Heap
        //Irrespective of the content, two new strings with "Hello World" gets created in Heap - memory wastage
        /*But in the first way, it won't create new string instead both data and data2 point to
        same memory location where "Hello World" is stored (memory optimization)*/
        //.intern() method moves the string from Heap to String Intern Pool
        data1.intern();
    }
}
