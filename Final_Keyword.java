package com.dyno;

 class A {
      int val;

     A() {
         val = 10;
     }

     void print() {
         val += 10;//error cuz val is final
         System.out.println(val);
     }

 }

 class B extends A{
     int val1;
     B() {
         val1 = 10;
     }

     void print() {
         val1 += 10;//error cuz val is final
         System.out.println(val1+" "+val);
     }

 }
 class C extends B//final class cannot be extended
 {

 }
 public class Final_Keyword{
    public static void main(String[] args) {
	C obj =new C();
	obj.print();


    }
}
