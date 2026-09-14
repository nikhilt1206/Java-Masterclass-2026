package com.string;

public class StringBufferMethods {
    public static void main(String[] args){
        String str = "Hello World"; //created in SIP - immutable
        String str1 = new String("Hello World"); //created in Heap - immutable - not preferred
        StringBuffer sb = new StringBuffer("Hello World"); //mutable - belongs to package - java.lang - created in Heap

        //Length of String
        System.out.println(str.length()); //String Class
        System.out.println(sb.length()); //String Buffer

        //joining - concat
        System.out.println(str+"123");
        System.out.println(str.concat("1234"));
        //Whatever we add to string - becomes string - " " + 123 = String
        System.out.println(sb.append(123)); //123 here is an int (number) - no new object creation

        //All methods of String Buffer class are Synchronized (slow) - Threadsafe
        //charAt
        System.out.println(str.charAt(0));
        System.out.println(sb.charAt(0));

        //indexOf method
        System.out.println(str);
        System.out.println(str.indexOf('e'));
        System.out.println(str.indexOf("ello")); //index of substring - gives index of first character always
        System.out.println(sb);
        System.out.println(sb.indexOf("e"));//takes argument as string

        //lastIndexOf
        System.out.println(str.lastIndexOf('l'));
        System.out.println(sb.lastIndexOf("l"));

        //isEmpty() method
        System.out.println(str.isEmpty());
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.isEmpty());

        //Methods for modification available in String Buffer
        //.reverse()
        System.out.println(sb.reverse());

        //insert(int offSet, String)
        StringBuffer sb2 = new StringBuffer("Hello World");
        System.out.println(sb2);
        System.out.println(sb2.insert(11,"Java")); //we can insert our substring anywhere based on offset

        //deleteCharAt
        System.out.println(sb2.deleteCharAt(4));
        //delete(int start, int end)
        StringBuffer sb3 = new StringBuffer("Hello World");
        System.out.println(sb3.delete(0,4));

        //replace(int start,int end, String substring)
        StringBuffer sb4 = new StringBuffer("Hello World");
        System.out.println(sb4.replace(0,5,"Hi"));

        //capacity - total capacity of the string buffer
        StringBuffer sb5 = new StringBuffer(); //initial capacity - 16 Characters
        System.out.println(sb5.capacity());
        System.out.println(sb.append("This is a sample string that i am adding to the String buffer"));
        System.out.println(sb.length());
        System.out.println(sb.capacity()); // capacity - 72
        //Capacity calculation in String Buffer - new capacity = (old capacity*2) + 2 - helps in memory allocation
    }
}
