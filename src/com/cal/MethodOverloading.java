package com.cal;

public class MethodOverloading {
    public static void main(String[] args){
        int number1 = 10;
        int number2 = 20;
        int number3 = 40;
        //Method overloading - multiple methods with same name but different count of parameters/data types
        addNumbers(number1,number2);
        addNumbers(23.5,10);
        addNumbers(number1,number2,number3);
    }

    private static void addNumbers(int number1, int number2) {
        System.out.println(number1 + number2);
    }
    private static void addNumbers(double number1, int number2) {
        System.out.println(number1 + number2);
    }
    private static void addNumbers(int number1, int number2, int number3) {
        System.out.println(number1 + number2 + number3);
    }
}
