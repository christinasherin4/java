package com.univ;
import java.util.Scanner;

public class OopDept {
    public static void main(String[] args) {
        department d = new department();
        int ch;
        do {

            System.out.println("\nMenu:\n1.Add\n2.Edit\n3.Delete\n4.Display");
            Scanner s = new Scanner(System.in);
            int choice;
            System.out.println("Enter the choice:");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    d.add();
                    break;
                case 2:
                    d.edit();
                    break;
                case 3:
                    d.delete();
                    break;
                case 4:
                    d.display();
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }
            System.out.println("Do you want to continue press 1 or else press 0");
            ch = s.nextInt();
            s.nextLine();
        } while (ch == 1);
    }
}
class department {
    String deptname;
    String hodname;
    int nofac;
    int nostu;
    int nopgm;

    department() {
        deptname = null;
        hodname = null;
    }
    {
         nofac=0;
         nopgm=0;
         nostu=0;
    }
    void add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the department name:");
        deptname = scan.nextLine();
        System.out.println("Enter the hod name:");
        hodname = scan.nextLine();
        System.out.println("Enter the number of the faculty:");
        nofac = scan.nextInt();
        System.out.println("Enter the no of programs:");
        nopgm = scan.nextInt();
    }
    void edit()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What do you want to edit?");
        System.out.println("\n1.Department\n2.Hod name\n3.Number of students\n4.no of faculty\n5.Program");
        int choice = s.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter the department name:");
                String dn=s.nextLine();
                dn=s.nextLine();
                deptname=dn;
                 break;
            case 2:
                System.out.println("Enter the new hod name");
                String hod=s.nextLine();
                hod=s.nextLine();
                hodname=hod;
                break;
            case 3:
                System.out.println("Enter the number1 of students:");
                int stu = s.nextInt();
                nostu=stu;
                break;
            case 4:
                System.out.println("Enter the number of faculty:");
                int fac=s.nextInt();
                nofac=fac;
                break;
            case 5:
                System.out.println("Enter the number of programs:");
                int pgm=s.nextInt();
                nopgm=pgm;
                break;
            default:System.out.println("Enter a choice");
        }
    }
    void delete()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What do you want to delete?\n1.Department\n2.hodname\n3.No of Students\n4.No of faculty\n5.No of programs");
        int choice=s.nextInt();
        switch(choice)
        {
            case 1:
                deptname=null;
                break;
            case 2:
                hodname=null;
                break;
            case 3:
                nostu=0;
                break;
            case 4:
                nofac=0;
                break;
            case 5:
                nopgm=0;
                break;
        }
    }
    void display()
    {
        System.out.println("The department details are:");
        if(deptname!=null)
        {
            System.out.println("Department name:"+deptname);
        }
        if(hodname!=null)
        {
            System.out.println("HOD name:"+hodname);
        }
        if(nostu!=0)
        {
            System.out.println("Number of students"+nostu);
        }
        if(nofac!=0)
        {
            System.out.println("No of faculty:"+nofac);
        }
        if(nopgm!=0)
        {
            System.out.println("Number of programs:"+nopgm);
        }
    }
}
