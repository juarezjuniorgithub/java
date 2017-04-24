package com.juarezjunior.javase7.strings_in_switch_statements;

/**
 *
 * @author juarezjuniorgithub
 *
 *         String in Switch Statements - Exercise
 *
 *         Create a class that demonstrates the use Strings in switch statements
 *
 *         References:
 *
 *         https://docs.oracle.com/javase/8/docs/technotes/guides/language/strings-switch.html
 *
 */
public class StringsInSwitchStatementsExerciseExample {

	public static void main(String[] args) {
		System.out.println(getTypeOfDayWithSwitchStatement("Saturday"));
		System.out.println(getTypeOfDayWithSwitchStatement("Sunday"));
		System.out.println(getTypeOfDayWithSwitchStatement("Monday"));
		System.out.println(getTypeOfDayWithSwitchStatement("Tuesday"));
		System.out.println(getTypeOfDayWithSwitchStatement("Thursday"));
		System.out.println(getTypeOfDayWithSwitchStatement("Friday"));
		System.out.println(getTypeOfDayWithSwitchStatement("Happy"));
	}

	public static String getTypeOfDayWithSwitchStatement(String dayOfWeekArg) {

		String typeOfDay;

		switch (dayOfWeekArg) {

		case "Monday":
			typeOfDay = "Start of work week";
			break;

		// fall through
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
			typeOfDay = "Midweek";
			break;

		case "Friday":
			typeOfDay = "End of work week";
			break;

		// fall through
		case "Saturday":
		case "Sunday":
			typeOfDay = "Weekend";
			break;

		// default
		default:
			throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);

		}

		return typeOfDay;

	}
}
