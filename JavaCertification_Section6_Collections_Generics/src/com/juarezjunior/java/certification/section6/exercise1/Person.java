package com.juarezjunior.java.certification.section6.exercise1;

public class Person implements Comparable<Person> {

	private String name;
	private int birthYear;

	@Override
	public int compareTo(Person o) {
		if (birthYear == o.getBirthYear()) {
			return 0;
		} else if (birthYear < o.getBirthYear()) {
			return 1;
		} else {
			return -1;
		}
	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person{" + "name=" + name + '}';
	}

}
