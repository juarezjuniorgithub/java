package com.juarezjunior.java.certification.section3.exercise7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 3, Exercise 7
 *
 *         Create a class that demonstrates the use of classes BufferedReader,
 *         BufferedWriter, File, FileReader, FileWriter in a scenario that
 *         writes / reads a String in a file called javafile.txt
 *
 */
public class Section3Exercise7Main {

	private static Logger LOGGER = Logger.getLogger(Section3Exercise7Main.class.getName());

	public static void main(String[] args) {

		BufferedWriter writer = null;
		BufferedReader reader = null;

		try {
			writer = new BufferedWriter(new FileWriter(new File("javafile.txt")));
			writer.append("Java Technology");
		} catch (IOException ex) {
			LOGGER.log(Level.SEVERE, null, ex);
		} finally {
			try {
				writer.close();
			} catch (IOException ex) {
				LOGGER.log(Level.SEVERE, null, ex);
			}
		}
		try {
			reader = new BufferedReader(new FileReader(("javafile.txt")));
			System.out.println(reader.readLine());
		} catch (IOException ex) {
			LOGGER.log(Level.SEVERE, null, ex);
		} finally {
			try {
				reader.close();
			} catch (IOException ex) {
				LOGGER.log(Level.SEVERE, null, ex);
			}
		}
	}

}
