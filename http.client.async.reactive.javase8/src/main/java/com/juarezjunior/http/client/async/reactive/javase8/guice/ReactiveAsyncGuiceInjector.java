package com.juarezjunior.http.client.async.reactive.javase8.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ReactiveAsyncGuiceInjector {

	private static Injector injector = Guice.createInjector(new ReactiveAsyncHttpClientModule());

	public static void injectInstanceVariables(Object toBeInjected) {
		injector.injectMembers(toBeInjected);
	}

}
