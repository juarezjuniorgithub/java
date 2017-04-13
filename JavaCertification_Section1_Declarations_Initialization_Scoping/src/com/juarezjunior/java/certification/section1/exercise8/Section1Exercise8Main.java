package com.juarezjunior.java.certification.section1.exercise8;

/**
 *
 * @author @juarezjuniorgithub
 *
 *         Section 1, Exercise 8
 *
 *         Create one simple class that has at least one instance variable, one
 *         static variable, one local (method) variable and any type of array.
 *         Initialize the variables. Write a main method that reads the values
 *         for each variable in a direct or indirect way.
 *
 *         References:
 *
 *         http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 *         http://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 *         http://www.oracle.com/technetwork/java/codeconventions-135099.html
 *         http://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
 *         http://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html
 *
 */
public class Section1Exercise8Main {

	public static void main(String[] args) {

		SimpleClass simple = new SimpleClass();
		int inst = simple.getInstanceVariable();
		System.out.println("The instance variable value is: " + inst);
		System.out.println("");
		System.out.println("The static variable value is: " + SimpleClass.staticVariable);
		System.out.println("");
		System.out.println("The array is: " + simple.getIntArray());
		int[] retrievedArray = simple.getIntArray();
		System.out.println("");
		for (int x = 0; x < retrievedArray.length; x++) {
			System.out.println("Current array element value is: " + retrievedArray[x]);
		}

	}

}
