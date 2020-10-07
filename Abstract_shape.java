package com.dyno;
import java.util.Scanner;

abstract class Shape_maker {
    int var;
    Shape_maker()
    {
        System.out.println("I am an abstract class");
    }
    abstract void display_shape();//unimplemented method
    void fun()//implemented method
    {
        System.out.println("Welcome to Abstract class");
    }

}
class rect extends Shape_maker {
    rect()
    {
        System.out.println("I am a class implemented y abstract methods");
    }
    void display_shape() {
        System.out.println("I am a rectangle");
    }
}
public class Abstract_shape{
    public static void main(String[] args) {
	 Shape_maker obj = new rect();
	 obj.display_shape();
	 obj.fun();
    }
}
