package com.operators;

public class BitwiseOperators {
    public static void main(String[] args){
        //Bitwise Operators - Works on binary digits
        int number1 = 5;
        int number2 = 3;

        //Bitwise AND (&)
        int result = number1 & number2;
        System.out.println(result);
        //Bitwise OR (|)
        result = number1 | number2;
        System.out.println(result);
        //Bitwise E-XOR (^)
        result = number1 ^ number2;
        System.out.println(result);
        //Complement (~)
        System.out.println(~number1);
        System.out.println(~number2);
        //Left Shift (<<)
        System.out.println(5<<1);
        //Right Shift (>>)
        System.out.println(5>>1);
    }
}
