package com.arrayofobjects;

public class ContactRunner {
    public static void main(String[] args){
        Contact c1 = new Contact("Nikhil","9768354344");
        System.out.println(c1);
        int[] a = new int[3];
        for(int num : a){
            System.out.println(num);
        }
        Contact[] c2 = new Contact[3];
        //Each memory location will store contact type of data
        c2[0] = new Contact("Rola","9876345223");
        c2[1] = new Contact("Hemant","9876343223");
        c2[2] = new Contact("Roshni","9876345293");
        for(Contact x : c2){
            System.out.println(x);
        }
    }
}
