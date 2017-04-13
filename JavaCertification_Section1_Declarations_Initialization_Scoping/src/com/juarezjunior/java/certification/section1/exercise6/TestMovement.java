
package com.juarezjunior.java.certification.section1.exercise6;

/**
 *
 * @author @juarezjuniorgithub
 */
public class TestMovement {

    MovementEnum direction;

    public TestMovement(MovementEnum direction) {
        this.direction = direction;
    }

    public void printDirection(){
        System.out.println(direction.toString());
    }

    public abstract interface Frobnicate {

        public void twiddle(String s);
    }

    public abstract class Frob implements Frobnicate {
    }

    public class Frob2 implements Frobnicate {

		public void twiddle(String i) {
        }

        public void twiddle(Integer s) {
        }

    }

}
