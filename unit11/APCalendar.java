package unit11;

// 2019 FRQ #1
// https://apcentral.collegeboard.org/media/pdf/ap19-frq-computer-science-a.pdf#page=3
import java.time.LocalDate;

public class APCalendar {

	/** Returns true if year is a leap year and false otherwise. */
	private static boolean isLeapYear(int year) { /* implementation not shown */
		return LocalDate.of(year, 1, 1).isLeapYear();
	}

	/**
	 * Returns the number of leap years between year1 and year2, inclusive.
	 * Precondition: 0 <= year1 <= year2
	 */
	public static int numberOfLeapYears(int year1, int year2) {
		/* to be implemented in part (a) */
		return -1; // replace me!
	}

	/**
	 * Returns the value representing the day of the week for the first day of year,
	 * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
	 */
	private static int firstDayOfYear(int year) { /* implementation not shown */
		return LocalDate.of(year, 1, 1).getDayOfWeek().getValue();
	}

	/**
	 * Returns n, where month, day, and year specify the nth day of the year.
	 * Returns 1 for January 1 (month = 1, day = 1) of any year.
	 * Precondition: The date represented by month, day, year is a valid date.
	 */
	private static int dayOfYear(int month, int day, int year) { /* implementation not shown */
		return LocalDate.of(year, month, day).getDayOfYear();
	}

	/**
	 * Returns the value representing the day of the week for the given date
	 * (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
	 * and 6 denotes Saturday.
	 * Precondition: The date represented by month, day, year is a valid date.
	 */
	public static int dayOfWeek(int month, int day, int year) {
		/* to be implemented in part (b) */
		return -1; // replace me!
	}

	public static void check(boolean test) throws AssertionError {
		if (!test)
			throw new AssertionError("bad panda");
	}

	public static void main(String[] args) {
		check(APCalendar.isLeapYear(2023) == false);
		check(APCalendar.isLeapYear(2024) == true);
		check(APCalendar.isLeapYear(2500) == false);
		check(APCalendar.firstDayOfYear(1992) == 3);
		check(APCalendar.dayOfYear(1, 1, 1992) == 1);
		check(APCalendar.dayOfYear(3, 1, 2017) == 60);
		check(APCalendar.dayOfYear(3, 1, 2016) == 61);

		// part (a) tests
		check(APCalendar.numberOfLeapYears(1976, 2023) == 12);
		check(APCalendar.numberOfLeapYears(2000, 2016) == 5);
		check(APCalendar.numberOfLeapYears(2000, 2000) == 1);
		check(APCalendar.numberOfLeapYears(1900, 1999) == 24);

		// part (b) tests
		check(APCalendar.dayOfWeek(1, 1, 1992) == 3);
		check(APCalendar.dayOfWeek(1, 2, 1992) == 4);
		check(APCalendar.dayOfWeek(1, 5, 2019) == 6);
		check(APCalendar.dayOfWeek(1, 10, 2019) == 4);
		check(APCalendar.dayOfWeek(3, 1, 2017) == 3);
		check(APCalendar.dayOfWeek(3, 1, 2016) == 2);
		check(APCalendar.dayOfWeek(3, 1, 2015) == 0);
		check(APCalendar.dayOfWeek(5, 3, 2023) == 3); // AP EXAM!

		System.out.println("Happy Panda! \uD83D\uDC3C");
	}

}