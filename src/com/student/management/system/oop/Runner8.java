package com.student.management.system.oop;

public class Runner8 {
    public static void main(String[] args){
        Student s2 = new Student("Nikhil",19,"9343765332","Bhelupura",45,65,67,90);
        s2.calculateTotalMarks();
        s2.calculatePercentage();
        s2.calculateGrade();
        s2.displayStudentInfo();
        s2.updateInformation("Mumbai","9876453279");
        s2.displayStudentInfo();

        Teacher t = new Teacher("Roli",25,"9843432433","Gazhipur","T402","Maths",9);
        //In java, objects are always created of child classes and reference is always created of parent class
        ((Teacher)t).displayTeacherInformation();
        t.updateInformation("Delhi","7704889234");//Method overriding - during execution which method will be called gets decided
        ((Teacher)t).displayTeacherInformation();

        //Method Overriding : When we create reference of parent class and object is created of child class
        //Parent and Child class have same method name, but implementation is different
        //Java overrides the parent class method and call child class method - because importance is always given to object we have created
        //Polymorphism - Upcasting
        Person p = new Student("Nikhil",19,"9343765332","Bhelupura",45,65,67,90);
        //if we want to use child class method using parent reference, we need to do down casting (explicitly) but vice-versa is not possible
        ((Student)p).calculateTotalMarks(); //down casting
        ((Student)p).calculatePercentage();
        ((Student)p).calculateGrade();
        ((Student)p).displayStudentInfo();
        //Java overrides the method by calling the updateInformation from the child class (priority : whose object is created - child)
        p.updateInformation("Mumbai","9876453279"); //Method overriding - Runtime Polymorphism
        //Even though compiler will refer updateInformation() from Person class, but while execution the updateInformation() method of child class will be taken into consideration because object is created of child class
        //Importance is always given to the object which we have created
        ((Student)p).displayStudentInfo();

        //Every class in java has an implicit parent class and that parent class is called Object class belongs to package java.lang
        //Parent of Person class is Object class
        //Fully qualified name of a class - package name.class name - java.lang.Object
    }
}
