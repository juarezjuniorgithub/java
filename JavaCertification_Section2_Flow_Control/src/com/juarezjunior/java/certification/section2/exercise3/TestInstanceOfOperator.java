package com.juarezjunior.java.certification.section2.exercise3;

/**
*
* @author @juarezjuniorgithub
*/
public class TestInstanceOfOperator {

	public void testInstanceofOperator() {
		Parent obj1 = new Parent();
		Parent obj2 = new Child();

		System.out.println("obj1 instanceof Parent: " + (obj1 instanceof Parent));
		System.out.println("obj1 instanceof Child: " + (obj1 instanceof Child));
		System.out.println("obj1 instanceof InheritanceInterface: " + (obj1 instanceof InheritanceInterface));
		System.out.println("obj2 instanceof Parent: " + (obj2 instanceof Parent));
		System.out.println("obj2 instanceof Child: " + (obj2 instanceof Child));
		System.out.println("obj2 instanceof InheritanceInterface: " + (obj2 instanceof InheritanceInterface));
	}

	static class Parent {
	}

	static class Child extends Parent implements InheritanceInterface {
	}

	static interface InheritanceInterface {
	}

}
