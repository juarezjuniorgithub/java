package com.juarezjunior.javase7.type_inference_for_generic_instance_creation_diamond_operator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Type Inference in Generic Instance Creation (Diamond Operator) -
 *         Exercise
 *
 *         Create a class that demonstrates the use type inference in generic
 *         instance creation with the pair of angle brackets is informally
 *         called the diamond operator
 *
 *         References:
 *
 *         https://docs.oracle.com/javase/8/docs/technotes/guides/language/type-inference-generic-instance-creation.html
 *
 */
public class TypeInferenceForGenericInstanceCreationDiamondOperatorExerciseExample {

	public static void main(String[] args) {

		Map<String, Object> aMap = new HashMap<>();

		List<String> aList = new ArrayList<>();

		aMap.put("1", "a");
		aMap.put("2", "b");
		aMap.put("3", "c");
		aMap.put("4", "d");

		aList.add("a");
		aList.add("b");
		aList.add("c");
		aList.add("d");

		System.out.println(aMap.toString());

		for (Map.Entry<String, Object> entrySet : aMap.entrySet()) {

			String key = entrySet.getKey();
			Object value = entrySet.getValue();
			System.out.println("Map key: " + key + ", Map value: " + value.toString());

		}

		System.out.println(aList);
		// the remove operation removes the list element at the informed
		// position
		// and returns the removed element
		System.out.println(aList.remove(0));

	}

}
