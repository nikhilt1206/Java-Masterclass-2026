package com.scannerdemo;

import java.util.Scanner;

public class ScannerRunner {
    public static void main(String[] args){
        //Scanner class is used to read the values from the console
        Scanner scanner = new Scanner(System.in);
        //Read an integer value
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println(age);
        scanner.nextLine();
        //To read a string value
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Name entered: "+name);
        //to read a float value from the console
        System.out.println("Enter your percentage : ");
        float percentage = scanner.nextFloat();
        System.out.println("Percentage entered : "+percentage);
        //to read double value from the console
        System.out.println("Enter a double value : ");
        double data = scanner.nextDouble();
        System.out.println("Double data : "+data);
        //to read boolean value
        System.out.println("Enter a boolean value : ");
        boolean status = scanner.nextBoolean();
        System.out.println("The value of status is : "+status);
        //Read a character
        System.out.println("Enter a character : ");
        char charData = scanner.next().charAt(0);
        System.out.println("character : "+charData);
    }
}
