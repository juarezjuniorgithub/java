package com.juarezjunior.java.certification.section6.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 6, Exercise 1
 *
 *         Create a class Person that implements the java.lang.Comparable
 *         interface and the compareTo() method and a test class that
 *         instantiates at least 5 people and classifies them
 *
 */
public class Section6Exercise1Main {

	public static void main(String[] args) {

		Person a = new Person("Junior", 1984);
		Person b = new Person("Peter", 1990);
		Person c = new Person("William", 1950);
		Person d = new Person("Jack", 1970);
		Person e = new Person("Gracie", 1999);

		List<Person> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}

}
