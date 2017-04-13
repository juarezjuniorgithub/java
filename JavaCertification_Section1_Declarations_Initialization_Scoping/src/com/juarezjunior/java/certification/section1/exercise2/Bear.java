package com.juarezjunior.java.certification.section1.exercise2;

/**
 *
 * @author juarezjuniorgithub
 */
public class Bear extends Being {

	public Bear(String name) {
		super(name);
	}

	@Override
	void speak() {
		System.out.println("I'm a Bear, " + super.getName());
	}

}
