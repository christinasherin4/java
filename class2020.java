package com.bytes;
class Student
{
    int regno;
    String name;
    String dept;

    void study()
    {
     System.out.println("I am a 2nd year student");
    }
    void write()
    {
        System.out.println("I am writing a poem");
    }
}
public class class2020 {
    public static void main(String[] args){
        Student urkxx = new Student();
        urkxx.regno=123;
        urkxx.name="Christina";
        urkxx.dept="CSE";
        urkxx.study();
        urkxx.write();
    }
}
