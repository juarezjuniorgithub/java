package com.juarezjunior.java.certification.section2.exercise1;

public class Section2Exercise1Main {

	/**
	 *
	 * @author juarezjuniorgithub
	 *
	 *         Section 2, Exercise 1
	 *
	 *         Create one or more classes where you can demonstrate the use of
	 *         the following statements: if...then, if...then...else - and the
	 *         switch with the following variations: primitive type, enum type,
	 *         String, wrapper classes (Byte, Long, etc).
	 *
	 *         References:
	 *
	 *         http://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
	 *         http://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
	 *
	 */
	public static void main(String[] args) {

		Section2Exercise1Main main = new Section2Exercise1Main();

		main.ifThenElse("dog");
		main.ifThenElse("bird");

		main.testeSwitchPrimitivo(2);
		main.testeSwitchPrimitivo(5);

		main.enumSwitch(CarsEnum.CARRERA);
		main.enumSwitch(CarsEnum.CAMARO);

		main.stringSwitch("java");
		main.stringSwitch("c");
		main.stringSwitch("js");

		main.charSwitch('c');
		main.charSwitch('j');
		main.charSwitch('h');

	}

	public void ifThenElse(String animal) {

		if (animal == "dog") {
			System.out.println("It's a dog");
		} else if (animal == "bird") {
			System.out.println("It's a bird");
		} else {
			System.out.println("unknown animal");
		}

	}

	public void testeSwitchPrimitivo(int people) {

		switch (people) {
		case 1:
			System.out.println("One person");
			break;
		case 2:
			System.out.println("two people");
			break;
		default:
			System.out.println("many people");
			break;
		}
	}

	public void enumSwitch(CarsEnum cars) {

		switch (cars) {
		case CARRERA:
			System.out.println("Porsche Carrera");
			break;
		case MUSTANG:
			System.out.println("Ford Mustang");
			break;
		case CAMARO:
			System.out.println("GM Camaro");
			break;
		default:
			System.out.println("Unknown Car");
			break;
		}
	}

	public void stringSwitch(String programmingLanguages) {

		switch (programmingLanguages) {
		case "java":
			System.out.println("Java by James Gosling");
			break;
		case "c":
			System.out.println("C by Dennis Ritchie");
			break;
		case "js":
			System.out.println("Javascript by Brendan Eich");
			break;
		default:
			System.out.println("No idea");
			break;
		}
	}

	public void charSwitch(Character caractere) {

		switch (caractere) {
		case 'c':
			System.out.println("C language");
			break;
		case 'j':
			System.out.println("Java language");
			break;
		case 'f':
			System.out.println("Fortran - Formula Translator");
			break;
		default:
			System.out.println("No idea");
			break;
		}
	}

}
