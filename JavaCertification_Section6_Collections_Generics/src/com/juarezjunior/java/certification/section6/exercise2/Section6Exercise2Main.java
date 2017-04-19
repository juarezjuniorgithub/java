package com.juarezjunior.java.certification.section6.exercise2;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 6, Exercise 2
 *
 *         Create a class that demonstrates the implementation of methods
 *         equals() and hashCode() and also demonstrate comparisons using
 *         equals() and the == operator
 *
 */
public class Section6Exercise2Main {

	public static void main(String[] args) {

		Person a = new Person("Juarez", 85);
		Person b = new Person("Peter", 85);
		Person c = a;
		Person d = new Person("Junior", 85);

		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
	}

}
