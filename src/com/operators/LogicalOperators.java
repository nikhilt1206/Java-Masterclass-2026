package com.operators;

public class LogicalOperators {
    public static void main(String[] args){
        //Logical Operators comes when there are multiple conditions
        //Logical AND - && - Both the conditions needs to be true to get the output as true
        // '&' - This is Bitwise AND
        //(Condition1) && (Condition2) - if both are true then output will be true otherwise false
        //(5>10) && (5>3) - output will be false since (5>10) is false
        System.out.println((5>4) && (5<2)); //false

        //Logical OR - || - at least one of the conditions needs to be true to get the output as true
        // '|' - This is Bitwise OR
        //(Condition1) && (Condition2) - if either of the one condition is true then output will be true otherwise false
        //(5>10) && (5>3) - output will be true since (5>3) is true
        System.out.println((5>4) || (5<2)); //true

        //Logical NOT - ! (Inversion)
        //Converts true to false and false to true
        //!(15<5) will give true as (15<5) is false and putting !(false) converts it to true
        System.out.println(! ((5>4) || (5<2))); //false

    }
}
