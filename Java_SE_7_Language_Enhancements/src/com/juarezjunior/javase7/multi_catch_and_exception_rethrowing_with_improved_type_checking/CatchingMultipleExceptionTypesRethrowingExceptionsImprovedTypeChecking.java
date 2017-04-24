package com.juarezjunior.javase7.multi_catch_and_exception_rethrowing_with_improved_type_checking;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Catching Multiple Exception Types and Rethrowing Exceptions with
 *         Improved Type Checking - Exercise
 *
 *         Create a class that demonstrates the use of a muti-catch try as well
 *         as exception rethrowing with improved type checking *
 *
 *         References:
 *
 *         https://docs.oracle.com/javase/8/docs/technotes/guides/language/catch-multiple.html
 *
 */
public class CatchingMultipleExceptionTypesRethrowingExceptionsImprovedTypeChecking {

	public static void main(String[] args) {

		try {

			rethrowException("Second");

		} catch (Exception ex) {
			Logger.getLogger(CatchingMultipleExceptionTypesRethrowingExceptionsImprovedTypeChecking.class.getName())
					.log(Level.SEVERE, null, ex);
		}
	}

	public static void rethrowException(String exceptionName) throws Exception {

		try {
			if (exceptionName.equals("First")) {
				throw new FirstException("First");
			} else {
				throw new SecondException("Second");
			}
		} catch (FirstException | SecondException e) {
			System.out.println("Exception is: " + e.getMessage());
			throw e;
		}

	}

	static class FirstException extends Exception {
		private static final long serialVersionUID = -7223880363542490233L;

		public FirstException(String message) {
			super(message);
		}
	}

	static class SecondException extends Exception {
		private static final long serialVersionUID = -4158876400152404472L;

		public SecondException(String message) {
			super(message);
		}
	}

}
