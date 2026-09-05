package com.cal;

public class CalculatorApp {
    public static void main(String[] args){ //starting point of our program
        //Here main() method is doing many tasks - declaration, initialization, +, -, *, /, print result
        double number1, number2;
        number1 = 10; //10.0
        number2 = 5; //5.0
        double result = number1 + number2;
        System.out.println(result);

        result = number1 - number2;
        System.out.println(result);

        result = number1 * number2;
        System.out.println(result);

        result = number1 / number2;
        System.out.println(result);
    }
}
