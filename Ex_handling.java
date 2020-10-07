package com.dyno;

public class Ex_handling {

    public static void main(String[] args) {
	try{
	    int divbyzero = 5/0;
	    System.out.println("Check out try block");
    }catch(ArithmeticException e)
    {
        System.out.println("Arithmetic Exception  :" +e.getMessage());
    }
    }
}
