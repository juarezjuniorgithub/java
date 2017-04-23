package com.juarezjunior.http.client.async.reactive.javase8.guice;

import com.google.inject.AbstractModule;
import com.juarezjunior.http.client.async.reactive.javase8.api.IReactiveAsyncOrchestrator;
import com.juarezjunior.http.client.async.reactive.javase8.api.ReactiveAsyncOrchestrator;
import com.juarezjunior.http.client.async.reactive.javase8.helpers.IReactiveAsyncHttpRequestDispatcher;
import com.juarezjunior.http.client.async.reactive.javase8.helpers.ReactiveAsyncDispatcher;

public class ReactiveAsyncHttpClientModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IReactiveAsyncOrchestrator.class).to(ReactiveAsyncOrchestrator.class);
		bind(IReactiveAsyncHttpRequestDispatcher.class).to(ReactiveAsyncDispatcher.class);
	}
}
