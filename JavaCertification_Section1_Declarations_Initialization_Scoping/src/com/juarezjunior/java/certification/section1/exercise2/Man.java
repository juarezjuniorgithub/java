package com.juarezjunior.java.certification.section1.exercise2;

/**
 *
 * @author juarezjuniorgithub
 */
public class Man extends Being {

	public Man(String name) {
		super(name);
	}

	@Override
	void speak() {
		System.out.println("I'm human being, " + super.getName());
	}

}
