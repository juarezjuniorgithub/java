package com.juarezjunior.http.client.async.reactive.javase8.commands;

import java.net.URI;
import java.util.concurrent.CompletionStage;

import javax.ws.rs.core.Link;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.rx.RxWebTarget;
import org.glassfish.jersey.client.rx.java8.RxCompletionStageInvoker;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.juarezjunior.http.client.async.reactive.javase8.guice.ReactiveAsyncHttpClientModule;
import com.juarezjunior.http.client.async.reactive.javase8.helpers.ReactiveAsyncCommandsEnum;
import com.juarezjunior.http.client.async.reactive.javase8.helpers.ReactiveAsyncDispatcher;
import com.juarezjunior.http.client.async.reactive.javase8.helpers.ReactiveAsyncHelper;
import com.juarezjunior.http.client.async.reactive.javase8.helpers.ReactiveAsyncUtilsEnum;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;

@SuppressWarnings("unchecked")
public class ReactiveAsyncHttpDeleteCommandClassResponse<T> extends HystrixCommand<CompletionStage<T>> {

	protected String stringTarget;

	protected Link linkTarget;

	protected URI uriTarget;

	protected UriBuilder uriBuilderTarget;

	protected RxWebTarget<RxCompletionStageInvoker> webTarget;

	protected final Class<?> clazzType;

	@Inject
	protected ReactiveAsyncDispatcher callbackDispatcher;

	protected final String httpRequestTargetType;

	protected Object[] informedAdditionalProperties;

	public ReactiveAsyncHttpDeleteCommandClassResponse(final String targetUrlString, final Class<T> responseType,
			final int timeout, Object... additionalProperties) {
		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.DELETE_COMMAND_CLASS_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		Injector injector = Guice.createInjector(new ReactiveAsyncHttpClientModule());
		injector.injectMembers(this);
		this.informedAdditionalProperties = additionalProperties;
		this.stringTarget = targetUrlString;
		this.clazzType = responseType;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.STRING_URL.value();
	}

	public ReactiveAsyncHttpDeleteCommandClassResponse(final Link link, final Class<T> responseType, final int timeout,
			Object... additionalProperties) {
		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.DELETE_COMMAND_CLASS_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		Injector injector = Guice.createInjector(new ReactiveAsyncHttpClientModule());
		injector.injectMembers(this);
		this.informedAdditionalProperties = additionalProperties;
		this.linkTarget = link;
		this.clazzType = responseType;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.LINK.value();
	}

	public ReactiveAsyncHttpDeleteCommandClassResponse(final URI uri, final Class<T> responseType, final int timeout,
			Object... additionalProperties) {
		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.DELETE_COMMAND_CLASS_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		Injector injector = Guice.createInjector(new ReactiveAsyncHttpClientModule());
		injector.injectMembers(this);
		this.informedAdditionalProperties = additionalProperties;
		this.uriTarget = uri;
		this.clazzType = responseType;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.URI.value();
	}

	public ReactiveAsyncHttpDeleteCommandClassResponse(final UriBuilder uriBuilder, final Class<T> responseType,
			final int timeout, Object... additionalProperties) {
		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.DELETE_COMMAND_CLASS_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		Injector injector = Guice.createInjector(new ReactiveAsyncHttpClientModule());
		injector.injectMembers(this);
		this.informedAdditionalProperties = additionalProperties;
		this.uriBuilderTarget = uriBuilder;
		this.clazzType = responseType;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.URIBUILDER.value();
	}

	public ReactiveAsyncHttpDeleteCommandClassResponse(final RxWebTarget<RxCompletionStageInvoker> target,
			final Class<T> responseType, final int timeout, Object... additionalProperties) {
		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.DELETE_COMMAND_CLASS_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		Injector injector = Guice.createInjector(new ReactiveAsyncHttpClientModule());
		injector.injectMembers(this);
		this.informedAdditionalProperties = additionalProperties;
		this.webTarget = target;
		this.clazzType = responseType;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.WEBTARGET.value();
	}

	@Override
	protected CompletionStage<T> run() throws Exception {

		CompletionStage<T> response;

		ReactiveAsyncUtilsEnum targetType = ReactiveAsyncUtilsEnum.valueOf(httpRequestTargetType);

		switch (targetType) {

		case STRING_URL:
			ReactiveAsyncHelper.validateTargetUrlTypeString(stringTarget, clazzType);
			response = (CompletionStage<T>) callbackDispatcher.deleteRequestForTypedResponse(stringTarget, clazzType,
					informedAdditionalProperties);
			break;

		case LINK:
			ReactiveAsyncHelper.validateUrlTypeLink(linkTarget, clazzType);
			response = (CompletionStage<T>) callbackDispatcher.deleteRequestForTypedResponse(linkTarget, clazzType,
					informedAdditionalProperties);
			break;

		case URI:
			ReactiveAsyncHelper.validateUrlTypeUri(uriTarget, clazzType);
			response = (CompletionStage<T>) callbackDispatcher.deleteRequestForTypedResponse(uriTarget, clazzType,
					informedAdditionalProperties);
			break;

		case URIBUILDER:
			ReactiveAsyncHelper.validateUrlTypeBuilder(uriBuilderTarget, clazzType);
			response = (CompletionStage<T>) callbackDispatcher.deleteRequestForTypedResponse(uriBuilderTarget,
					clazzType, informedAdditionalProperties);
			break;

		case WEBTARGET:
			ReactiveAsyncHelper.validateUrlTypeWebTarget(webTarget, clazzType);
			response = (CompletionStage<T>) callbackDispatcher.deleteRequestForTypedResponse(webTarget, clazzType,
					informedAdditionalProperties);
			break;

		default:
			response = null;
			break;

		}

		return response;

	}

	@Override
	protected CompletionStage<T> getFallback() {
		return null;
	}

}
