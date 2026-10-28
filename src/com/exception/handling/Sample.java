package com.exception.handling;

public class Sample {
    public static void main(String[] args){
        //Exception : Any unwanted interruption that affects the normal flow of our program
        System.out.println("Line1");
        //int result = 10/0; //this line will give output as not defined
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //Here ArithmeticException is Exception type and the / by zero is the message
        //While writing code, java won't check if this line 10/0 will create any issue - it will be valid
        //Problem won't come at compile time as java will consider int result=10/0 as a valid statement
        //But when the program will get executed (runtime) then the problem will come
        //Exception which we get while running/executing the program - Runtime Exception
        //Once the execution came, it interrupted the program that why rest of the statement didn't execute
        //So we have to handle these exceptions so that if they come they will be handled so the normal flow of the program won't stop or interrupt
        //Exception handling makes our system Robust
        //System.out.println("Line2");
        //System.out.println("Line3");

        //Exception handling can be done in 2 ways - try-catch block and throw keyword
        /*if we know that will get ArithmeticException, then we can say
        public static void main(String[] args) throws ArithmeticException{} - but still execution will stop at same place
        throws keyword is applicable to method
        */

        //As we know that 10/0 is the risky code, we can put it inside the try {} block
        try {
            int result1 = 10/0;
        } catch (ArithmeticException e) {
            //once we find the exception, we can print the exception details
            System.out.println(e.getMessage()); // / by zero will be printed
            e.printStackTrace(); //more details about the exception
        }
        //The ideal way to handle the exception is the try-catch block not with the throws keyword
        //After introducing try-catch block the exception is handled properly and all the lines got executed
        System.out.println("Line2");
        System.out.println("Line3");
    }
}
