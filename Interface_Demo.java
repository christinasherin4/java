package com.dyno;
import java.util.Scanner;

interface Arithmetic
{
    void add();
    void subtract();

}

class primary_operation implements Arithmetic {
    int a = 2,b=5;
    primary(int x,int y)
    {
        a=x;
        b=y;
    }
    public void add() {
        System.out.println("The addition of " + a + "and " + b + "is " + (a + b));
    }


    @Override
    public void subtract() {
        System.out.println("The addition of " + a + "and " + b + "is " + (a - b));

}
public class Interface_Demo {

    public static void main(String[] args) {
	Arithmetic obj = new add();
	obj.add();
        Arithmetic obj1 = new primary_operation(x,y);
        obj.subtract();
    }
}
