package com.juarezjunior.java.certification.section1.exercise1;

import java.awt.Color;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 1, Exercise 1
 *
 *         Create two simple Java classes (Vehicle and Car) and demonstrate in
 *         practice the following OO concepts: inheritance, encapsulation (data
 *         hiding), method overloading, method overriding, object instantiation,
 *         polymorphism.
 *
 *         References:
 *
 *         http://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
 *         http://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
 *
 */
public class Section1Exercise1Main {

	public static void main(String[] args) {

		Vehicle a = new Vehicle("a", Color.blue, 100);
		Vehicle b = (Vehicle) new Car("b", Color.green, 100);
		Car c = new Car("c", Color.red, 100);

		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());

		a.accelerate(10);
		b.accelerate(10);
		c.accelerate(1, 10.0);
		c.setManufacturer("Mazda");

		System.out.println("");
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());

	}

}
