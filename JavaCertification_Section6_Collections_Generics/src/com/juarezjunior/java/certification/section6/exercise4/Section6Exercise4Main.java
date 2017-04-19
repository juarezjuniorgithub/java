package com.juarezjunior.java.certification.section6.exercise4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 6, Exercise 4
 *
 *         Create a class that demonstrates the use of java.util.NavigableSet
 *         and java.util.NaviagableMap
 *
 */
public class Section6Exercise4Main {

	public static void main(String[] args) {
		navigableMapTest();
		navigableSetTest();
	}

	private static void navigableMapTest() {
		NavigableMap<String, Integer> navigableMap = new TreeMap<String, Integer>();

		navigableMap.put("X", 500);
		navigableMap.put("B", 600);
		navigableMap.put("A", 700);
		navigableMap.put("T", 800);
		navigableMap.put("Y", 900);
		navigableMap.put("Z", 200);

		System.out.printf("Descending Set  : %s%n", navigableMap.descendingKeySet());

		System.out.printf("Floor Entry  : %s%n", navigableMap.floorEntry("L"));

		System.out.printf("First Entry  : %s%n", navigableMap.firstEntry());

		System.out.printf("Last Key : %s%n", navigableMap.lastKey());

		System.out.printf("First Key : %s%n", navigableMap.firstKey());

		System.out.printf("Original Map : %s%n", navigableMap);

		System.out.printf("Reverse Map : %s%n", navigableMap.descendingMap());
	}

	private static void navigableSetTest() {
		NavigableSet<String> navigableSet = new TreeSet<String>(Arrays.asList("X", "B", "A", "Z", "T"));

		Iterator<String> iterator = navigableSet.descendingIterator();

		System.out.println("Original Set :");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		iterator = navigableSet.iterator();

		System.out.println("Sorted Navigable Set :");

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.printf("Head Set : %s.%n", navigableSet.headSet("X"));

		System.out.printf("Tail Set : %s.%n", navigableSet.tailSet("T", false));

		System.out.printf("Sub Set : %s.%n", navigableSet.subSet("B", true, "X", true));

		System.out.printf("Last Element : %s%n", navigableSet.last());

		System.out.printf("First Element : %s%n", navigableSet.first());

		System.out.printf("Reverse Set : %s%n", navigableSet.descendingSet());

		System.out.printf("Original Set : %s%n", navigableSet);

	}

}
