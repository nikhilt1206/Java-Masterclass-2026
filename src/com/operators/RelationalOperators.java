package com.operators;

public class RelationalOperators {
    public static void main(String[] args){
        //Relational Operators - Used for Comparison - used majorly on Primitive Datatypes and Numbers
        //>, <, >=, <=, ==, !=
        int number1 = 5; // '=' is Assignment operator - used to assign value to a variable
        int number2 = 10;
        //Result of relational operators will always come in boolean and used with conditional statements
        System.out.println(number1 > number2); //false
        System.out.println(number1 < number2); //true
        // '==' read as 'isEqualTo' - checks if number1 is equals to number2 - gives result in boolean always
        System.out.println(number1 == number2); //false
        // '!=' read as 'NotEqualTo' - check number1 != number2
        System.out.println(number1 != number2);
        // '>=' read as 'GreaterThan OR EqualTo' - either value should be greater (>)  than OR equal to (==)
        System.out.println(number1 >= number2);
        // '<=' read as 'LessThan OR EqualTo' - either value should be lesser (<)  than OR equal to (==)
        System.out.println(number1 <= number2);
    }
}
