package com.dyno;
import java.util.Scanner;

class IncomeTax{
    int age;
    double income;
    String name;
    IncomeTax() {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NAME: ");
        name = sc.next();
        System.out.println("ENTER AGE: ");
        age = sc.nextInt();
        System.out.println("ENTER ANNUAL_INCOME: ");
        income = sc.nextDouble();
    }

       IncomeTax(String x,int y,double z){
             name=x;
             age=y;
             income=z;
             }

             void findTax(){
              income=0;

    }
}

class Men extends IncomeTax{
    Men(String x,int y,double z)
    {
        super(x,y,z);
    }
    
    void findTax()
    {
        if(income<250000)
            income=0;
        if(income >= 250001 && income<=300000)
            income=10%income;
            if (income >= 300001 && income <=500000)
                income=10%income;
            if(income>=500001 && income<=1000000)
                income=20%income;
            if(income>=1000000)
                income=30%income;
            System.out.println("\nNAME:"+name+"\nAGE:"+age+"\n GENDER:MAN");
            System.out.println("\n The Income Tax is :"+income);
        }

    }



class Women extends IncomeTax{
    Women(String x,int y,double z)
    {
        super(x,y,z);
    }

    void findTax()
    {

        if(income<=300000)
            income=0;
        if (income >= 300001 && income <=500000)
            income=10%income;
        if(income>=500001 && income<=1000000)
            income=20%income;
        if(income>=1000000)
            income=30%income;
        System.out.println("\nNAME:"+name+"\nAGE:"+age+" \nGENDER: WOMAN");
        System.out.println("\nThe  Income Tax is :"+income);
    }
}


class SeniorCitizen extends IncomeTax {

        SeniorCitizen(String x,int y,double z)
        {
            super(x,y,z);
        }

        void findTax()
        {
            if(income<300000)
                income=0;
            if (income >= 300001 && income <=500000)
                income=5%income;
            if(income>=500001 && income<=1000000)
                income=10%income;
            if(income>=1000000)
                income=20%income;
            System.out.println("\nNAME:"+name+"\nAGE:"+age+" \nCATEGORY:SENIOR CITIZEN");
            System.out.println("\nThe Income Tax is :"+income);
        }
    }
public class CalculateSalaryEmployee{
    public static void main(String[] args)
    {
        System.out.println("USER NAME: L.CHRISTINA SHERIN");
        System.out.println("REG NO : URK19CS1063");
        IncomeTax obj;
        obj = new Men("Luther",24,300002.00);
        obj.findTax();
        obj = new Women("Jane",34,500002.00);
        obj.findTax();
        obj = new SeniorCitizen("Gary",74,600002.00);
        obj.findTax();

    }
    }

