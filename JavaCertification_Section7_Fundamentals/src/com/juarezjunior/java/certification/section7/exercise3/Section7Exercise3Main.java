package com.juarezjunior.java.certification.section7.exercise3;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 7, Exercise 3
 *
 *         Create a class that demonstrates by means of two distinct methods the
 *         use of arguments by value and by reference
 *
 *         Reference:
 *
 *         https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
 *
 */
public class Section7Exercise3Main {

	public static void main(String[] args) {
		Test t = new Test("arg1");
		t.print();
		t.print("arg2");
		t.print(33);
	}

}

class Test {

	Object s;

	Test(Object t) {
		s = t;
	}

	void print(Object e) {
		System.out.println(e);
	}

	void print() {
		System.out.println(s);
	}

	void print(int x) {
		System.out.println(x);
	}

}
