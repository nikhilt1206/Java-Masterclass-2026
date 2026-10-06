package com.inheritance;
//Parent class
public class A {
    protected int x; //protected scope means given instance variables can be only accessed in the child class
    protected int y;

    /*If we have parametrized constructor in our parent class, then it is job of the child class constructor to call
      the parent class constructor using super() keyword.
      Constructor chaining can be achieved using this and super keyword
      To differentiate parent class variable with child class variable when they have same name - super keyword
    */
    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
