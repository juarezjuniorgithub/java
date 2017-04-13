package com.juarezjunior.java.certification.section1.exercise3;

/**
 *
 * @author @githubjuarezjunior
 */
public class Container {

	public void whichOneCalled() {
		System.out.println("Container");
	}

	static class StaticInnerClass {

		public static void whichOneCalled() {
			System.out.println("Static Inner Class");
		}
	}

	class InnerClass {

		public void whichOneCalled() {

			System.out.println("Inner Class");
		}
	}

}
