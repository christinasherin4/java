package com.ticbook;
import java.util.Scanner;
import java.util.Random;

class Bus_ticket {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	int price = r.nextInt(130);

	void Tic_booking(int seat_matrix[][]) {
		System.out.println("Enter the row number: ");
		int row = sc.nextInt();
		System.out.println("Enter the seat number: ");
		int col = sc.nextInt();
		System.out.println("Enter the passenger's name: ");
		String w = sc.next();
		if (seat_matrix[row][col] == 0) {
			seat_matrix[row][col] = 1;
			System.out.println("SUCCESS!!:You have booked your seat.HAPPY JOURNEY!"+ "\t" + w);
		} else {
			System.out.println("This seat has been reserved by another passenger.Do check out the other seats!!");
		}
	}

	void compare_Tariff() {
		int seat_matix[][] = new int[10][6];
		System.out.println("Number of buses available from source to destination are : ");
		int no_ofBuses = r.nextInt(130);
		System.out.println(no_ofBuses);
		for (int i = 1; i <= no_ofBuses; i++) {
			int prices = r.nextInt(130);
			if (prices < price) {
				System.out.println("Searching....buses at a lower tariff");
				System.out.
	}
}
public class ArrayOfObjects {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		Bus_ticket obj[] = new Bus_ticket[130];
		int p = 0;
		int ch;
		int seat_matrix[][] = new int[10][6];
		System.out.println("Enter source : ");
		String source = sc.next();
		System.out.println("Enter Destination : ");
		String destination = sc.next();
		System.out.println("Bus Number: ");
		int bus_no = r.nextInt(130);
		System.out.println(bus_no);
		do {
			obj[p] = new Bus_ticket();
			System.out.println("MENU << Options Available >> :");
			System.out.println("1. <<Booking Ticket>> ");
			System.out.println("2.  <<Compare Tariff>> ");
			System.out.println("3.  <<Exit>> ");
			System.out.println("ENTER YOUR CHOICE:");
			ch = sc.nextInt();
			switch (ch) {
				case 1:
					obj[p].Tic_booking(seat_matrix);
					break;
				case 2:
					System.out.println("Source : " + source + "\nDestination : " + destination);
					obj[p].compare_Tariff();
					break;
				default:
					System.out.println("Enjoy your trip");
					break;
			}
			p = p + 1;
		} while (ch < 3);
	}
}
