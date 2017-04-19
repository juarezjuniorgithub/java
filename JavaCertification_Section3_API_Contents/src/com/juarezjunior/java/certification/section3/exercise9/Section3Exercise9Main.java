package com.juarezjunior.java.certification.section3.exercise9;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 3, Exercise 9
 *
 *         Create a class that demonstrates the use of classes in the package
 *         java.text and pre-defined formats that will be used to format: a
 *         date, a time, a number and a currency value
 *
 */
public class Section3Exercise9Main {

	public static void main(String[] args) {

		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
			String dateInString = "8-Aug-2012";
			Date date = formatter.parse(dateInString);
			System.out.println(date);
			System.out.println(formatter.format(date));

			double priceInUSD = 100 * 0.5;
			NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
			System.out.printf("Price in USD : %s %n", currencyFormat.format(priceInUSD));

			String pattern = "EEEEE MMMMM yyyy HH:mm:ss.SSSZ";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale("pt", "BR"));

			String date2 = simpleDateFormat.format(new Date());
			System.out.println(date2);

		} catch (ParseException e) {
			Logger.getLogger(Section3Exercise9Main.class.getName()).log(Level.SEVERE, e.getMessage(), e);
		}

	}

}
