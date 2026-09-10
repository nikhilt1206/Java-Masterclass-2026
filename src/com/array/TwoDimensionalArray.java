package com.array;

public class TwoDimensionalArray {
    public static void main(String[] args){
        int a[] = new int[3];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        //Traversing 1-D Array
        for(int index=0;index<a.length;index++){
            System.out.println(a[index]);
        }
        //Enhanced for loop
        for(int temp : a){
            System.out.println(temp);
        }

        //2D Array
        int b[][] = new int[4][2];
        System.out.println(b.length); //tells total number of rows
        System.out.println(b[0].length); //tells total number of columns

        for(int rowIndex=0;rowIndex<b.length;rowIndex++){ //for printing rows
            for(int colIndex=0;colIndex<b[0].length;colIndex++){ //for printing columns
                //System.out.println(rowIndex+" "+colIndex);
                System.out.print(b[rowIndex][colIndex] + " ");
            }
            System.out.println(""); //print on the next line
        }
    }
}
