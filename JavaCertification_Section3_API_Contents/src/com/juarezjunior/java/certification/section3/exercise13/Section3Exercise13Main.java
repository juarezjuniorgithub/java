package com.juarezjunior.java.certification.section3.exercise13;

import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 3, Exercise 13
 *
 *         Create a class that demonstrates the use of java.util.Formatter and
 *         java.util.Scanner and use of methods format and printf of PrintWriter
 *         class
 */
public class Section3Exercise13Main {

	public static void main(String[] args) {

		Formatter format1 = new Formatter();
		format1.format("Formatting %s : int ( %d )  float ( %f )", "numbers", 10, 98.6);
		System.out.println(format1);

		Scanner s1 = new Scanner("08/08/2012");
		String s = s1.nextLine();

		try {

			// create a new writer
			PrintWriter pw = new PrintWriter(System.out);

			// printf text with default locale.
			// %s indicates a string will be placed there, which is s
			pw.printf("This is a %s program", s);

			// change line
			pw.println();

			// printf text with default locale
			// %d indicates a integer will be placed there, which is 100
			pw.printf("This is a %s program with %d", s, 100);

			// flush the writer
			pw.flush();

			// create a new writer
			PrintWriter pw2 = new PrintWriter(System.out);

			// format text with specified locale.
			// %s indicates a string will be placed there, which is s
			pw2.format(Locale.UK, "This is a %s program", s);

			// change line
			pw2.println();

			// format text with specified locale
			// %d indicates a integer will be placed there, which is 100
			pw2.format(Locale.UK, "This is a %s program with %d", s, 100);

			// flush the writer
			pw2.flush();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			s1.close();
		}
	}

}
