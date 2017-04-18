package com.juarezjunior.java.certification.section2.exercise5;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Section2Exercise5Main {

	public static void main(String[] args) {
		try {
			TestFile testFile = new TestFile();
			testFile.testFile();
			TestFile.testReadFile();
		} catch (IOException ex) {
			Logger.getLogger(Section2Exercise5Main.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
