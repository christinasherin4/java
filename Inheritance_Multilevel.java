package com.Multilevel;
class Human
{
    Human()
    {
        System.out.println("I am a human");
    }
    Human(String x)
    {
        System.out.println("I have a "+x);
    }
}

class Professor extends Human
{
    Professor()
    {
        System.out.println("I am an educated human");
    }

    Professor(String x,String y)
    {
        super(x);
        System.out.println("I have a "+y);
    }
}

class CS_Professor extends Professor
{
    CS_Professor()
    {
        System.out.println("CS Professor:I am a educated human with CS degree");
    }

    CS_Professor(String x,String y,String z)
    {
        super(x,y);
        System.out.println("I have a "+z);
        //System.out.println("Totally I have a"+x+","+y+"and"+z);
    }
}
public class Inheritance_Multilevel {

    public static void main(String[] args) {
        System.out.println("NAME: L.CHRISTINA SHERIN");
        System.out.println("REG NO:  URK19CS1063");
        Professor Joy = new Professor();
        CS_Professor Happy = new CS_Professor("heart" , "soul", "brain");
    }
}
