package com.var;
import java.util.Scanner;
class Student
{
    int regno;
    String name;
    String dept;

    public void setDept(String dept) {
        this.dept = dept;
    }

    Student()
    {
        System.out.println("I am from Constructor");
    }
    public Student(int regno,String name,String dept)//parameterized constructor
    {
        this.regno = regno;
        this.name = name;
        this.dept = dept;
    }
    void display()
    {
        System.out.println("Reg no:"+regno);
        System.out.println("Name:"+name);
        System.out.println("aDepartment:"+dept);

}
 public class class_2020
  {
   public static void main(String[] args){
    Scanner s =new Scanner(System.in);
  System.out.println("Enter reg no:");
 int regno=s.nextInt();
 System.out.println("Enter name:");
String n=s.next();
System.out.println("Enter Dept:");
String dept=s.next();
Student urk19csxx = new Student(regno,n,dept);
urk19csxx.display();
}
}