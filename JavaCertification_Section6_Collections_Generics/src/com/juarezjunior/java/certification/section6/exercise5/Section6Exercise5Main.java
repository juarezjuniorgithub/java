package com.juarezjunior.java.certification.section6.exercise5;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 6, Exercise 5
 *
 *         Create a class that demonstrates the use of three type parameters:
 *         use in class definitions, instance variable, method arguments or
 *         return types
 *
 */
public class Section6Exercise5Main {

	public static void main(String[] args) {

		SimpleInterface sf = new SimpleCalss();
		sf.show();
		sf.show("s");
		sf.show("d", 5);

	}
}

interface SimpleInterface {

	int A = 5;

	void show();

	void show(String s);

	void show(String s, int c);

}

class SimpleCalss implements SimpleInterface {

	public void show() {
		System.out.println(A);
	}

	public void show(String s) {
		System.out.println(s);
	}

	public void show(String s, int c) {
		System.out.println(s + c);
	}

}