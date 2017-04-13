package com.juarezjunior.java.certification.section1.exercise6;

/**
 *
 * @author @juarezjuniorgithub
 *
 *         Section 1, Exercise 6
 *
 *         Create a class and example to show the use of a simple Java Enum *
 *
 *         Reference:
 *
 *         http://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 *
 */
public class Section1Exercise6Main {

	public static void main(String[] args) {

		TestMovement t = new TestMovement(MovementEnum.DOWN);
		t.printDirection();

		t = new TestMovement(MovementEnum.UP);
		t.printDirection();

		t = new TestMovement(MovementEnum.RIGHT);
		t.printDirection();

		t = new TestMovement(MovementEnum.LEFT);
		t.printDirection();
	}

}
