package com.inheritance;
import java.util.Scanner;
class Starter {
    String name;
    String type;

    Starter() {
        name = "Agni";
        type = System.out.println("Enter the type:");
        //System.out.println("I am a parent");
    }

    Starter(String a, int b) {
        name = a;
        type  = b;
    }
    void know_starter()
    {
        System.out.println("Name:"+name+"\n"+"Type:"+type);
    }

}


    class Solid  extends Starter {
        boolean predator;
        String food;

        Wild_animal() {
            predator = true;
            food = "rabbit";

        }

        Wild_animal(boolean a,String b,String x, int y)
        {
            super(x, y);
            predator=a;
            food=b;

        }

        void know_child() {
            know_animal();
            System.out.println("Predator:" + predator + "\n" + "Food:" + food);
            //obj.know_animal();
        }
    }

    /*void print()
    {
        System.out.println(a+" "+b);
    }
}
*/



public  class Inheritance {

    public static void main(String[] args) {
        {
            Wild_animal obj = new Wild_animal(true,"hippo","Wild - Dog",15);
            //System.out.println(obj.a+" "+obj.b);
            //obj.print();
            //obj.know_animal();
            obj.know_child();
        }
    }
}
