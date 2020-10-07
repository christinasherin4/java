package com.company;
import java.util.Scanner;
class Student
{
    String name;
    String regno;
    String year;
    float cgpa;
    Scanner sc= new Scanner(System.in);

    Student()
    {
        name="Chris";
        regno="ur19csXX";
        year="CSE";
        cgpa=6.0f;
    }

    Student(String a, String b, String c, float cgpa)
    {
        name=a;
        regno=b;
        year=c;
        this.cgpa=cgpa;
    }


    void get_data()
    {
        System.out.print("Enter Name :");
        name=sc.next();
        System.out.print("Enter Regno :");
        regno=sc.next();
        System.out.println("Enter year :");
        year=sc.next();
        System.out
        System.out.println("Enter cgpa :");
        cgpa=sc.nextFloat();
    }

    void print_data()
    {
        System.out.println("Name : "+name);
        System.out.println("Regno: "+regno);
        System.out.println("Year : "+year);
        System.out.println("Cgpa : "+cgpa);

    }

    Student compare(Student ob2)
    {
        if(cgpa > ob2.cgpa)
            return this;
        else
            return ob2;
    }

}
public class Student_Demo {

    public static void main(String[] args) {
        Student obj[]=new Student[5];
      //  for(int i=0;i<obj.length;i++)
        //    obj[i]=new Student();
        obj[0]=new Student("Rachel","URK19CS063","Final CSE",5.3f);
        obj[1]=new Student("Chandler","URK13CE56","III CSE",7.3f);
        obj[2]=new Student("Monica","URK18ME14","passed",8f);
        obj[3]=new Student("Phoebe","URKGI1045","II ",9f);
        obj[4]=new Student("Joey","URKAE1023","III",9.2f);
        Student rank_holder=obj[0];
        for(int i=0;i<(obj.length)-1;i++)
        {
            rank_holder=rank_holder.compare(obj[i]);
        }
        System.out.println("The topper is :");
        rank_holder.print_data();


    }
}
