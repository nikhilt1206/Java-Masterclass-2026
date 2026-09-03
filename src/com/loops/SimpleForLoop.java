package com.loops;

public class SimpleForLoop {
    public static void main(String[] args){
        //System.out.println(1);
        //System.out.println(2);
        //System.out.println(3);
        //System.out.println(4);
        //System.out.println(5);
        //In case we need to print multiple lines (hundreds) so practically it is not possible
        for(int i = 1; i <= 5; i++){ //it will execute immediate next statement for certain number of times
            System.out.println(i); //'i' is looping variable and can't be accessed outside for loop
        }
    }
}
