package com.array;

import java.util.Arrays;

public class JaggedArray {
    public static void main(String[] args){
        int a[] = new int[3];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        for(int temp : a){
            System.out.println(temp);
        }
        //Accessing values from array we have utility class in java (all the methods inside utility class will always be static)
        //Static methods are utility methods
        //Utility class used to manipulate arrays(read values from array, sort it) - Arrays belongs to package java.util
        //To access static method - no object creation is needed - can be accessed using classname.methodName
        System.out.println(Arrays.toString(a)); //[10, 20, 30] ( a is array reference)
        //Arrays.toString(a) - will print the entire elements of the array in string format

        int b[][] = new int[2][2];
        b[0][0]=100;
        b[0][1]=200;
        b[1][0]=400;
        b[1][1]=600;
        System.out.println(Arrays.toString(b[0]));
        System.out.println(Arrays.toString(b[1]));

        //Jagged Array
        int j[][] = new int[2][];
        j[0] = new int[]{10,20,30};
        j[1] = new int[]{10};
        for(int rowIndex=0;rowIndex<j.length;rowIndex++){
            for(int colIndex=0;colIndex<j[rowIndex].length;colIndex++){
                System.out.print(j[rowIndex][colIndex]+" ");
            }
            System.out.println("");
        }
    }
}

