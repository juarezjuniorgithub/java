package com.juarezjunior.java.certification.section7.exercise6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 7, Exercise 6
 *
 *         Create a class that demonstrates the implementation of the finalize()
 *         method to release a given resource (it can be a ficticious one)
 *
 *         Reference:
 *
 *         https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#finalize()
 */
public class Section7Exercise6Main {

	public static void main(String[] args) throws IOException {

		try {

			for (int i = 0; i < 10; i++) {
				File f = new File("r" + i + ".txt");
				f.createNewFile();
				new FinalizeTest(f);
			}
			Thread.sleep(5000L);
			System.gc();
			Thread.sleep(1000L);
			System.gc();

		} catch (InterruptedException ex) {
			Logger.getLogger(Section7Exercise6Main.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}

class FinalizeTest {

	File file;
	FileReader fr;
	static int a = 0;

	FinalizeTest(File f) {
		file = f;
		try {
			fr = new FileReader(file);
			try {
				int read = fr.read();
				System.out.println(read);
				a++;
			} catch (IOException ex) {
				Logger.getLogger(FinalizeTest.class.getName()).log(Level.SEVERE, null, ex);
			}
		} catch (FileNotFoundException ex) {
			Logger.getLogger(FinalizeTest.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Close File");
		fr.close();
		file.delete();
		System.out.println(a);
		super.finalize();
	}

}