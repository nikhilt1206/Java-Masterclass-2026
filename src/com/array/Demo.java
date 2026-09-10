package com.array;

public class Demo {
    public static void main(String[] args){
        int x = 10; //primitive variable - x stores value 10 inside it directly

        //Array
        int marks[] = new int[15]; //created in heap memory ('new' keyword)
        //int marks[] - marks is reference variable which stores memory address (ref point) of newly created array
        //new int[5] - is the actual array which got created in heap memory initialized with default value (0 - int)
        //marks will represent the hash code (unique identification number) of the array

        //To print local variable
        System.out.println(x);
        System.out.println(marks);
        //output - [I@6acbcfc0 - here 6acbcfc0 is the hashcode of the array and I - int type array
        //we can access/interact array elements using indexes which starts from 0 to n-1
        //reference variable (marks) always act as a pointer to an array which is storing [I@6acbcfc0 which is reference to the array
        System.out.println(marks[0]); //0 is index to access the value at respective memory locations/values
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //we can print above using for loop which is more practical as we are printing same statements
        //Traversing an array
        for(int index=0;index<=4;index++){
            System.out.println(marks[index]);
        }

        //initialize indexes with different values
        marks[0]=8; //value 8 will be stored in the 0th index
        marks[1]=7;
        marks[2]=6;

        //.length property of the array - tells the size of the array (to avoid hardcoding)
        System.out.println(marks.length); //prints 5 which is size of the array
        for(int index=0;index<marks.length;index++){ //index<marks.length or index<=marks.length-1 - both are same
            System.out.println(marks[index]);
        }
    }
}
