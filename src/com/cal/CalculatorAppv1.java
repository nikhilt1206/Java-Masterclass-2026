package com.cal;

public class CalculatorAppv1 {
    public static void main(String[] args){ //start of main() method
        double number1;
        int number2;
        number1 = 100;
        number2 = 5;
        double result;
        result = calculateSum(number1,number2); //To communicate with calculateSum, we are calling with method name - Method Calling
        System.out.println(result);
        //Whenever searching happens, java will first search within the method and then within the class
        //Here in this case of method calling, searching will happen with in the class
        //static method can call another static method

        double x = calculateSubstraction(number1, number2);
        System.out.println(x);

        double y = calculateMultiplication(number1, number2);
        System.out.println(y);

        double z = calculateDivision(number1, number2);
        System.out.println(z);
    } //end of main() method

    public static double calculateDivision(double number1, int number2) {
        double result;
        result = number1 / number2;
        return result;
    }

    public static double calculateMultiplication(double number1, int number2) {
        double result;
        result = number1 * number2;
        return result;
    }

    public static double calculateSubstraction(double number1, int number2) {
        double result;
        result = number1 - number2;
        return result;
    }

    //public static void calculateSum(); -Method Definition - used in Interface (Abstract classes), we define Abstract methods
    public static double calculateSum(double number1, int number2){ //Method Declaration
        double result = number1 + number2;
        //System.out.println(result);
        //Whenever a method returns something we use return keyword
        return result; //returning value from result which is of double type
    } //end of calculateSum() method
}
