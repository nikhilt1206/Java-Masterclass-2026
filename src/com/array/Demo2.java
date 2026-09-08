package com.array;

public class Demo2 {
    public static void main(String[] args){
        //int marks[] = new int[3];
        //marks[0]=8;
        //marks[1]=7;
        //marks[2]=6;

        //Another way creating and initializing an array
        int marks[] = {8,7,6};
        for(int index=0;index<marks.length;index++){
            System.out.println(marks[index]);
        }

        //Enhanced for loop - only used for traversing purpose
        //One by one will get the value in our loop
        for(int temp : marks){
            System.out.println(temp);
        }


    }
}
