package com.juarezjunior.java.certification.section1.exercise2;

/**
 *
 * @author juarezjuniorgithub
 */
public class Elf extends Being {

	public Elf(String name) {
		super(name);
	}

	@Override
	void speak() {
		System.out.println("I'm the Elf, " + super.getName());
	}

}
