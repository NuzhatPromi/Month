package io.naztech.Month;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		for (Month m : Month.values()) {
			System.out.println(m.getShortName() + " has " + m.daysInMonth() + " days");
		}
		System.out.println("Enter a month name to see the number of days in that month in 2019!");
		String monthName;
		Scanner s = new Scanner(System.in);
		monthName = s.nextLine();

		Month m = Month.JANUARY;
		Month m2 = m.parseMonth(monthName);
		if (m2 != null)
			System.out.println(m2.title() + " " + m2.daysInMonth()
					+ "days\nCongrats! You have new year calender. Happy New Year!");
		else
			System.out.println("cannot find the month");

		Month ob = Month.parseMonth("jan");
	}

}
