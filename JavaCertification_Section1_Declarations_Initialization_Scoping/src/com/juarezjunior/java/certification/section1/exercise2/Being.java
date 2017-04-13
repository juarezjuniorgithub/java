package com.juarezjunior.java.certification.section1.exercise2;

/**
 *
 * @author juarezjuniorgithub
 */
public abstract class Being {

	private String name;

	abstract void speak();

	public Being(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return this.getClass().getSimpleName();
	}

	@Override
	public String toString() {
		return "Being: " + getGender();
	}

}
