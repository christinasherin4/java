package com.demo;

/*class Demo_Specifiers
{
    int x;
    private int y;
    protected int z;
    final public int a=7;
    Demo_Specifiers()
    {
        x=1;
        y=2;
        z=3;
        z=a+5;
    }
}
public class Inner_class {

    public static void main(String[] args) {
	   Demo_Specifiers obj = new Demo_Specifiers();
	   System.out.println(obj.z);

    }
}*/

class Stu_classB {
    String name;
    String regno;
    static int count = 1;

    Stu_classB(String x) {
        name = x;
        regno = "URK19CS" + count;
        count++;
    }

    void get_stu() {
        System.out.println(name + " " + regno);
    }

    static void Stu_count() {
        System.out.println("Count:" + count);
    }

    //   public static class Inner_class{
    //     public static void main(String[] args)
    //   {
    //int num=1;
           /* Stu_classB obj1 = new Stu_classB("Chris");
            obj1.get_stu();
            Stu_classB obj2 = new Stu_classB("teddy");
            obj2.get_stu();
            Stu_classB.Stu_count();
            System.out.println(Stu_classB.count);
        }
    }
}*/
    static class Defence_officer {
        String name;
        String division;

        Defence_officer(String x, String y) {
            name = x;
            division = y;
        }

        void print_data() {
            System.out.println("I am" + name + "working under " + division);
            Mission secret = new Mission();
            System.out.println("At present I work at" + secret.location);
        }

        class Mission {
            private String location;

            Mission() {
                location = "Ladak";
                System.out.println(name);
            }

        }
    }

    public static class Inner_class {
        public static void main(String[] args) {
            Defence_officer ajay = new Defence_officer("Ajay", "Army");
            ajay.print_data();
        }
    }
}