package com.builder;

public class Emp {
    private final String name;
    private final int empId;
    private final double salary;

    //constructors are private in singleton class and builder design pattern
    private Emp(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", salary=" + salary +
                '}';
    }

    //Implementing Builder Design Pattern - helps us achieve OOP in a better way by using Design Patterns
    public static class Builder{ //inner class can only be static
        private String name;
        private int empId;
        private double salary;

        //setters will return the current object of the builder class
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder empId(int empId) {
            this.empId = empId;
            return this;
        }

        public Builder salary(double salary) {
            this.salary = salary;
            return this;
        }

        public Emp build(){
            Emp e1 = new Emp(name,empId,salary);
            return e1;
        }
    }
}
