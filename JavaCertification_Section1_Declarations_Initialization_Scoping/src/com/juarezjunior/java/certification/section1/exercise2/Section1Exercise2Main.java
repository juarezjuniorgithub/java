package com.juarezjunior.java.certification.section1.exercise2;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 1, Exercise 1 Create a project with one abstract class and
 *         two or more concrete classes. Demonstrate the relationship where the
 *         abstract class has two abstract methods and two concrete classes that
 *         extend the abstract one.
 *
 *         Reference:
 *
 *         http://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
 *
 */
public class Section1Exercise2Main {

	public static void main(String[] args) {

		Being a = new Elf("Angel Ears");
		Being b = new Man("Junior");
		Being c = new Bear("Ted");

		Being d = new Being("The Creator") {

			@Override
			void speak() {
				System.out.println("I'm the being, " + super.getName());
			}
		};

		a.speak();
		b.speak();
		c.speak();
		d.speak();

		System.out.println("");
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
	}

}
