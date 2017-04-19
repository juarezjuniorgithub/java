package com.juarezjunior.java.certification.section6.exercise3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 6, Exercise 3
 *
 *         Create a class that demonstrates the definition and use of Generic
 *         Collections with examples of Set, Map and List
 *
 */
public class Section6Exercise3Main {

	public static void main(String[] args) {

		Person a = new Person("Juarez", 85);
		Person b = new Person("Junior", 86);
		Person c = a;
		Person d = new Person("James", 87);

		System.out.println("List<Object> myList = new LinkedList<Object>()");
		List<Object> myList = new LinkedList<Object>();
		myList.add(a);
		myList.add(b);
		myList.add(c);
		myList.add(d);
		System.out.println(myList);
		System.out.println(myList.toString());

		System.out.println("------------------------------------------------------------------------------------");

		System.out.println("Set<Person> personSet = new TreeSet<Person>()");
		Set<Person> personSet = new TreeSet<Person>();
		personSet.add(d);
		personSet.add(a);
		personSet.add(b);
		personSet.add(c);
		System.out.println(personSet);
		for (Iterator<Person> iterator = personSet.iterator(); iterator.hasNext();) {
			Object next = iterator.next();
			System.out.println(next.toString());
		}
		System.out.println(personSet.toString());

		System.out.println("------------------------------------------------------------------------------------");

		System.out.println("Map<String, Person> personMap = new HashMap<String, Person>()");
		Map<String, Person> personMap = new HashMap<String, Person>();
		personMap.put(a.getName(), a);
		personMap.put(b.getName(), b);
		personMap.put(c.getName(), c);
		personMap.put(d.getName(), d);
		System.out.println(personMap);
		for (Map.Entry<String, Person> entrySet : personMap.entrySet()) {
			String key = entrySet.getKey();
			Person value = entrySet.getValue();
			System.out.println(key);
			System.out.println(value);
		}

	}

}
