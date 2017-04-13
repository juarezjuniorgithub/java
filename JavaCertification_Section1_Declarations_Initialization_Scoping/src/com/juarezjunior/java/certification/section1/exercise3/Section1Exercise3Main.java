package com.juarezjunior.java.certification.section1.exercise3;

/**
 *
 * @author @juarezjuniorgithub
 *
 *         Section 1, Exercise 3
 *
 *         Create three classes that demonstrate a simple relationship scheme
 *         containing a top-level class (container), a static inner class and a
 *         non static inner class.
 *
 *         References:
 *
 *         http://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
 *         http://docs.oracle.com/javase/tutorial/java/javaOO/innerclasses.html
 *
 */
public class Section1Exercise3Main {

	public static void main(String[] args) {

		Container c = new Container();
		Container.InnerClass d = c.new InnerClass();
		c.whichOneCalled();
		d.whichOneCalled();
		Container.StaticInnerClass.whichOneCalled();

	}

}
