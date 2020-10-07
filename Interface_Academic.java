package com.dyno.Academic;
import java.util.Scanner;
interface Academic {
    static void calAcademicCredit() {
        String grade = " ";
        double credit1 = 1;
        double credit2 = 1;
        double credit3 = 1;
        double credit4 = 1;
        double credit5 = 1;
        double gradeValue = 0;
        double totPtsclass1 = 0;
        double totPtsclass2 = 0;
        double totPtsclass3 = 0;
        double totPtsclass4 = 0;
        double totPtsclass5 = 0;
        double totPts = 0;
        double totCredits = 0;
        double gpa;

        Scanner p = new Scanner(System.in);
        System.out.println("........................................");
        System.out.println("Enter the number of credits for ENGLISH: ");
        credit1 = p.nextDouble();
        System.out.println(".........................................");
        System.out.println("GRADES AVAILABEL:1.O\n2.A\n3.B\n4.C\n5.D");
        System.out.println("Enter the grades for ENGLISH:");
        grade = p.next();

        if (grade.equals("O"))
            gradeValue = 10.00;
        else if (grade.equals("A"))
            gradeValue = 9.00;
        else if (grade.equals("B"))
            gradeValue = 7.00;
        else if (grade.equals("C"))
            gradeValue = 6.00;
        else if (grade.equals("D"))
            gradeValue = 5.00;
        else
            System.out.println("ERROR:INVALID GRADE:CHECK THE AVAILABLE GRADES!!");

        totPtsclass1 = gradeValue * credit1;

        System.out.println("........................................");
        System.out.println("Enter the number of credits for MATHS: ");
        credit1 = p.nextDouble();
        System.out.println(".........................................");
        System.out.println("GRADES AVAILABEL:1.O\n2.A\n3.B\n4.C\n5.D");
        System.out.println("Enter the grades for MATHS:");
        grade = p.next();

        if (grade.equals("O"))
            gradeValue = 10.00;
        else if (grade.equals("A"))
            gradeValue = 9.00;
        else if (grade.equals("B"))
            gradeValue = 7.00;
        else if (grade.equals("C"))
            gradeValue = 6.00;
        else if (grade.equals("D"))
            gradeValue = 5.00;
        else
            System.out.println("ERROR:INVALID GRADE:CHECK THE AVAILABLE GRADES!!");

        totPtsclass2 = gradeValue * credit2;

        System.out.println("........................................");
        System.out.println("Enter the number of credits for FRENCH: ");
        credit1 = p.nextDouble();
        System.out.println(".........................................");
        System.out.println("GRADES AVAILABEL:1.O\n2.A\n3.B\n4.C\n5.D");
        System.out.println("Enter the grades for FRENCH:");
        grade = p.next();

        if (grade.equals("O"))
            gradeValue = 10.00;
        else if (grade.equals("A"))
            gradeValue = 9.00;
        else if (grade.equals("B"))
            gradeValue = 7.00;
        else if (grade.equals("C"))
            gradeValue = 6.00;
        else if (grade.equals("D"))
            gradeValue = 5.00;
        else
            System.out.println("ERROR:INVALID GRADE:CHECK THE AVAILABLE GRADES!!");

        totPtsclass3 = gradeValue * credit3;


        System.out.println("........................................");
        System.out.println("Enter the number of credits for SCIENCE (ENTER A NUmber from 10 to 5): ");
        credit1 = p.nextDouble();
        System.out.println(".........................................");
        System.out.println("GRADES AVAILABEL:1.O\n2.A\n3.B\n4.C\n5.D");
        System.out.println("Enter the grades for SCIENCE:");
        grade = p.next();

        if (grade.equals("O"))
            gradeValue = 10.00;
        else if (grade.equals("A"))
            gradeValue = 9.00;
        else if (grade.equals("B"))
            gradeValue = 7.00;
        else if (grade.equals("C"))
            gradeValue = 6.00;
        else if (grade.equals("D"))
            gradeValue = 5.00;
        else
            System.out.println("ERROR:INVALID GRADE:CHECK THE AVAILABLE GRADES!!");

        totPtsclass4 = gradeValue * credit4;


        System.out.println("........................................");
        System.out.println("Enter the number of credits for SOCIAL (ENTER A NUmber from 10 to 5): ");
        credit1 = p.nextDouble();
        System.out.println(".........................................");
        System.out.println("GRADES AVAILABEL:1.O\n2.A\n3.B\n4.C\n5.D");
        System.out.println("Enter the grades for SOCIAL:");
        grade = p.next();

        if (grade.equals("O"))
            gradeValue = 10.00;
        else if (grade.equals("A"))
            gradeValue = 9.00;
        else if (grade.equals("B"))
            gradeValue = 7.00;
        else if (grade.equals("C"))
            gradeValue = 6.00;
        else if (grade.equals("D"))
            gradeValue = 5.00;
        else
            System.out.println("ERROR:INVALID GRADE:CHECK THE AVAILABLE GRADES!!");

        totPtsclass5 = gradeValue * credit5;

        totPts = totPtsclass1 + totPtsclass2 + totPtsclass3 + totPtsclass4 + totPtsclass5;
        totCredits = credit1 + credit2 + credit3 + credit4 + credit5;
        gpa = totPts / totCredits;

        System.out.println("YOUR CGPA IS: \n" + gpa);
    }

    static void registerClub() {
        int p;
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();

        if (p == 1) {
            System.out.println("\nYOU HAVE SELECTED NSS CLUB ");
            System.out.println("CREDIT: 2");
        }
        if (p == 2) {
            System.out.println("\nYOU HAVE SELECTED NATURE CLUB ");
            System.out.println("CREDIT: 1");
        }
        if (p == 3) {
            System.out.println("\nYOU HAVE SELECTED NCC CLUB ");
            System.out.println("CREDIT:3");
        }
    }


    static void registerSub() {
        int ch;
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
        do {
            switch (ch) {

                case 1: {
                    System.out.println("The subject English is registered! ");
                }
                break;

                case 2: {
                    System.out.println("The subject Maths is registered! ");
                }
                break;
                case 3: {
                    System.out.println("The subject French is registered! ");
                }
                case 5: {
                    System.out.println("The subject Science is registered! ");
                }
                break;
                case 6: {
                    System.out.println("The subject Social is registered! ");
                }
                break;
            }
        } while (ch == 5);
    }


    static void assignFaculty()
    {
        int c;
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        System.out.println("FACULTIES AVAILABLE ARE: ");
        System.out.println("\n1.Dr.Carol\n2.Dr.Chris\n3.Dr.Jane\n4.Dr.Tina\n5.Dr.Andrea");
        System.out.println("ENTER THE FACULTY OF YOUR CHOICE:  ");

        if(c==1) {
            System.out.println("\nYOU HAVE SELECTED Dr.CAROL ");
        }
        if(c==2)
        {
            System.out.println("\nYOU HAVE SELECTED Dr.CHRIS! ");
        }
        if(c==3)
        {
            System.out.println("\nYOU HAVE SELECTED Dr.JANE! ");
        }
        if(c==4)
        {
            System.out.println("\nYOU HAVE SELECTED Dr.TINA! ");
        }
        if(c==5)
        {
            System.out.println("\nYOU HAVE SELECTED Dr.ANDREA! ");
        }
    }


}

interface NonAcademic extends Academic//static final and default
{

    void calNonAcademicCredit();
    void registerClub();
}

class Course implements Academic {
    String name;
    String reg_no;
    int subjects;
    int faculty;
    int non_acad_club;
     public  Course(String a, String b, int c, int d, int e)
    {
        name = a;
        reg_no = b;
        subjects = c;
        faculty = d;
        non_acad_club = e;
    }



    public void calAcademicDetails() {
        System.out.println(".............................");
        System.out.println("ACADEMIC DETAILS AND CREDITS");
        System.out.println("ENTER YOUR REG NO: ");
        System.out.println(reg_no);
        System.out.println("ENTER YOUR NAME: ");
        System.out.println(name);
        System.out.println("SUBJECTS AVAILABLE ARE:");
        System.out.println("\n1.English\n2.Maths\n3.French\n4.Science\n5.Social");
        System.out.println("Enter the subject of your choice :  ");
        Academic.registerSub();
        System.out.println("SUCCESS!YOU HAVE COMPLETED SUBJECT REGISTRATION");
        System.out.println("FACULTIES AVAILABLE ARE: ");
        System.out.println("\n1.Dr.Carol\n2.Dr.Chris\n3.Dr.Jane\n4.Dr.Tina\n5.Dr.Andrea");
        System.out.println("ENTER THE FACULTY OF YOUR CHOICE:  ");
        Academic.assignFaculty();
        System.out.println("SUCCESS!YOU HAVE COMPLETED FACULTY REGISTRATION");
        System.out.println("..........GPA CALCULATION..............");
        Academic.calAcademicCredit();
        System.out.println("CONGRATUALTIONS! ON YOUR GPA!");
        System.out.println("..................................");
    }

   public void calNonAcademicCredit()
   {
       System.out.println("........................");
       System.out.println("NON ACADEMIC DETAILS AND CREDITS");
       System.out.println("...............................");
       System.out.println("ENTER YOUR REG NO: ");
       System.out.println(reg_no);
       System.out.println("ENTER YOUR NAME: ");
       System.out.println(name);
       System.out.println(name + " SELECT THE CLUB OF YOUR CHOICE!: ");
       System.out.println("\n 1.NSS CLUB \n2.NATURE CLUB \n3.NCC CLUB");
       Academic.registerClub();
       System.out.println("CLUB REGISTRATION SUCCESSFULL!");
       System.out.println("...........................");
       System.out.println("THANK YOU FOR REGISTERING!!!!"+name+"!");

   }
}
    public class Interface_Academic{

        public static void main(String[] args) {
            Course  Eobj = new Course("Christina", "URK19CS1063",1,1,1);
            Eobj.calAcademicDetails();
            Eobj.calNonAcademicCredit();
            System.out.println("....................................");
        }
    }


