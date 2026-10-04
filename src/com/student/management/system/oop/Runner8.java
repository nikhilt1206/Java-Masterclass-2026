package com.student.management.system.oop;

public class Runner8 {
    public static void main(String[] args){
        StudentR2 s2 = new StudentR2("Nikhil",19,1,50,45,65,"9343765332","Bengaluru");
        s2.calculateTotalMarks();
        s2.calculatePercentage();
        s2.calculateGrade();
        s2.displayStudentInfo();

        Teacher t = new Teacher("Roli",25,"9843432433","Gazhipur","T410","JAVA", 10);
        t.displayTeacherInformation();
    }
}
