package com.juarezjunior.javase7.improved_compiler_warnings_errors_non_reifiable_params_varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Improved Compiler Warnings and Errors When Using Non-Reifiable Formal
 *         Parameters with Varargs Methods - Exercise
 *
 *         Create a class that demonstrates the use of non-reifiable parameters
 *         with Java VarArgs
 *
 *         Note the compiler warnings in the absence of the @SafeVarargs
 *         annotations (commented out). Also uncomment them and check again
 *
 *
 *         References:
 *
 *         https://docs.oracle.com/javase/tutorial/java/generics/nonReifiableVarargsType.html
 *
 */
public class ImprovedCompilerWarningsAndErrorsNonReifiableParametersWithVarArgs {

	public static void main(String[] args) {

		List<String> stringListA = new ArrayList<>();
		List<String> stringListB = new ArrayList<>();

		ArrayBuilder.addToList(stringListA, "Seven", "Eight", "Nine");
		ArrayBuilder.addToList(stringListA, "Ten", "Eleven", "Twelve");
		List<List<String>> listOfStringLists = new ArrayList<>();
		ArrayBuilder.addToList(listOfStringLists, stringListA, stringListB);

		ArrayBuilder.faultyMethod(Arrays.asList("Hello!"), Arrays.asList("World!"));
	}

}

class ArrayBuilder {

	// @SafeVarargs
	public static <T> void addToList(List<T> listArg, T... elements) {
		for (T x : elements) {
			listArg.add(x);
		}
	}

	// @SafeVarargs
	public static void faultyMethod(List<String>... l) {
		Object[] objectArray = l; // Valid
		objectArray[0] = Arrays.asList(42);

		String s = l[0].get(0); // ClassCastException thrown here
		System.out.println(s);
	}

}
