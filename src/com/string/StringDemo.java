package com.string;

public class StringDemo {
    public static void main(String[] args){
        int x = 10; //local variable (Primitive Variable) - created inside the stack - directly stores value
        String name = "jatin"; //"jatin" - string literal - created inside string intern pool
        //java will check if any string literal is already created in SIP if not, it will create one
        //name will store the unique hashcode inside it (name - reference variable) - created inside stack
        String name2 = "jatin";
        //since "jatin" string literal is already present in the SIP, so it won't create new one
        //name and name2 (reference variables) will point to the same string literal in SIP (used memory efficiently)
        int y = 10;
        System.out.println(x==y); //value compare
        //Whenever we do comparison of 2 primitive variables (comparison will happen on the basis of values)
        //10==10 - true
        System.out.println(name==name2); //reference (hashcode) compare
        //here name and name2 are reference variable (store hashcode of string literal)
        //name==name2 - true (not because both store "jatin" but the hashcode is same (hashcode comparison)
        //To compare strings we should always use '.equals()' method of String class
        System.out.println(name.equals(name2)); //value compare
        String name3 = "Jatin";
        //Since "jatin" and "Jatin" being not same (Uppercase - J) - new string will get created in the SIP
        //name3 will store the hashcode for newly created string literal "Jatin" in SIP
        System.out.println(name==name3); //both reference (hashcode) are different therefore - false
        System.out.println(name.equals(name3)); //false - even though values are same but case is different
        //we can use .equalsIgnoreCase() - to bypass case problem
        //.equals() - case-sensitive and .equalsIgnoreCase() - case-insensitive
        System.out.println(name.equalsIgnoreCase(name3)); //true - jatin == Jatin (case ignored)
        //To check hashcode value stored inside reference variable, we can use variableName.hashCode()
        System.out.println(name.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name3.hashCode());
    }
}
