package com.juarezjunior.java.certification.section1.exercise8;

/**
 *
 * @author @juarezjuniorgithub
 */
public class SimpleClass {

	private int instanceVariable = 5;
	public static int staticVariable = 10;

	public int getInstanceVariable() {
		return instanceVariable;
	}

	public void setInstanceVariable(int instanceVariable) {
		this.instanceVariable = instanceVariable;
	}

	public int[] getIntArray() {
		int[] localArray = { 1, 2, 3, 4, 5, 6, 7 };
		return localArray;
	}

}
