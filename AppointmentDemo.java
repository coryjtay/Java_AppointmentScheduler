package edu.orangecoastcollege.cs170.ctaylor82.ic22;

import java.util.Scanner;

public class AppointmentDemo {

	public static final int SIZE = 6;

	public static void main(String[] args) {
		String name;
		int time;
		boolean error = false;
		String[] app = new String[SIZE];
		Scanner cs = new Scanner(System.in);

		do {
			System.out.println("Please enter a time to schedule an appointment between 1 and 6 pm.");
			time = cs.nextInt();
			try {
				if (time >= 1 && time <= 6) {
					if (app[time] == null) {
						System.out.print("Please enter your name: ");
						name = cs.next();
						app[time] = name;
						error = true;
						cs.nextLine();
					} else 
						throw new TimeInUseException();
				} else
					throw new InvalidTimeException();

			} catch (TimeInUseException e) {
				System.out.println(e.getMessage());

			} catch (InvalidTimeException e) {
				System.out.println(e.getMessage());
			}

		} while (error = true);
		cs.close();
	}
}
