package com.juarezjunior.java.certification.section6.exercise2;

import java.util.Objects;

public class Person {

	private String name;
	private int birthYear;

	public Person(String name, int anoNascimento) {
		this.name = name;
		this.birthYear = anoNascimento;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int anoNascimento) {
		this.birthYear = anoNascimento;
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

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 83 * hash + Objects.hashCode(this.name);
		hash = 83 * hash + this.birthYear;
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Person other = (Person) obj;
		if (!Objects.equals(this.name, other.name)) {
			return false;
		}
		if (this.birthYear != other.birthYear) {
			return false;
		}
		return true;
	}

}
