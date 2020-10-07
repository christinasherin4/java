package com.ticket;
import java.util.Scanner;


class Ticket {
    String pname;
    String source;
    String destination;
    float cost;
    Scanner sc = new Scanner(System.in);

    Ticket()
    {
        pname = "Christina";
        destination = "Coimbatore";
        source="Train";
        cost = 1500;
    }

    Ticket(String x,String y,String z)
    {
        pname=x;
        destination=y;
        source=z;
    }

    void details() {
        System.out.println("Enter passenger name:");
        pname = sc.next();
        System.out.println("Enter destination:");
        destination = sc.next();
        System.out.println("Enter source:");
        source = sc.next();
        System.out.println("Enter cost:");
        cost = sc.nextFloat();
    }

    void Display() {
        System.out.println("\n**************\n");
        System.out.println("\nPassenger Name:" + pname);
        System.out.println("\nDestination:" + destination);
        System.out.println("\nSource:" + source);
        System.out.println("\nCost:" + cost);
    }
}

public class Main {

    public static void main(String[] args) {
        Ticket ticket[] = new Ticket[3];
        ticket[0]=new Ticket();
        ticket[1]=new Ticket("Rachel","Chennai","train",1200);
        ticket[2]=new Ticket("Monica","Madurai","bus",600);
        for (int i = 0; i < ticket.length; i++)
        ticket[i] = new Ticket();
        ticket[i].details();
        for (ticket x : Ticket)
            x.details();

    }
}

