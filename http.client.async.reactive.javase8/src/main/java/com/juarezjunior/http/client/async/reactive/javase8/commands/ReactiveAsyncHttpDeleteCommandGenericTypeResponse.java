package com.juarezjunior.http.client.async.reactive.javase8.commands;

import java.net.URI;
import java.util.concurrent.CompletionStage;

import javax.ws.rs.core.GenericType;
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
public class ReactiveAsyncHttpDeleteCommandGenericTypeResponse<T> extends HystrixCommand<CompletionStage<T>> {

	protected String stringTarget;

	protected Link linkTarget;

	protected URI uriTarget;

	protected UriBuilder uriBuilderTarget;

	protected RxWebTarget<RxCompletionStageInvoker> webTarget;

	protected final GenericType<?> genericType;

	@Inject
	protected ReactiveAsyncDispatcher callbackDispatcher;

	protected final String httpRequestTargetType;

	protected Object[] informedAdditionalProperties;

	public ReactiveAsyncHttpDeleteCommandGenericTypeResponse(final String targetUrl, final GenericType<T> type,
			final int timeout, Object... additionalProperties) {
		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.DELETE_COMMAND_GEN_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		Injector injector = Guice.createInjector(new ReactiveAsyncHttpClientModule());
		injector.injectMembers(this);
		this.informedAdditionalProperties = additionalProperties;
		this.stringTarget = targetUrl;
		this.genericType = type;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.STRING_URL.value();
		;
	}

	public ReactiveAsyncHttpDeleteCommandGenericTypeResponse(final Link link, final GenericType<T> type,
			final int timeout, Object... additionalProperties) {
		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.DELETE_COMMAND_GEN_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		Injector injector = Guice.createInjector(new ReactiveAsyncHttpClientModule());
		injector.injectMembers(this);
		this.informedAdditionalProperties = additionalProperties;
		this.linkTarget = link;
		this.genericType = type;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.LINK.value();
	}

	public ReactiveAsyncHttpDeleteCommandGenericTypeResponse(final URI uri, final GenericType<T> type,
			final int timeout, Object... additionalProperties) {
		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.DELETE_COMMAND_GEN_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		Injector injector = Guice.createInjector(new ReactiveAsyncHttpClientModule());
		injector.injectMembers(this);
		this.informedAdditionalProperties = additionalProperties;
		this.uriTarget = uri;
		this.genericType = type;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.URI.value();
	}

	public ReactiveAsyncHttpDeleteCommandGenericTypeResponse(final UriBuilder uriBuilder, final GenericType<T> type,
			final int timeout, Object... additionalProperties) {
		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.DELETE_COMMAND_GEN_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		Injector injector = Guice.createInjector(new ReactiveAsyncHttpClientModule());
		injector.injectMembers(this);
		this.informedAdditionalProperties = additionalProperties;
		this.uriBuilderTarget = uriBuilder;
		this.genericType = type;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.URIBUILDER.value();
	}

	public ReactiveAsyncHttpDeleteCommandGenericTypeResponse(final RxWebTarget<RxCompletionStageInvoker> target,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {
		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.DELETE_COMMAND_GEN_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		Injector injector = Guice.createInjector(new ReactiveAsyncHttpClientModule());
		injector.injectMembers(this);
		this.informedAdditionalProperties = additionalProperties;
		this.webTarget = target;
		this.genericType = type;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.WEBTARGET.value();
	}

	@Override
	protected CompletionStage<T> run() throws Exception {

		CompletionStage<T> response = null;

		ReactiveAsyncUtilsEnum targetType = ReactiveAsyncUtilsEnum.valueOf(httpRequestTargetType);

		switch (targetType) {

		case STRING_URL:
			ReactiveAsyncHelper.validateTargetUrlTypeString(stringTarget, genericType);
			response = (CompletionStage<T>) callbackDispatcher.deleteRequestForGenericTypedResponse(stringTarget,
					genericType, informedAdditionalProperties);
			break;

		case LINK:
			ReactiveAsyncHelper.validateUrlTypeLink(linkTarget, genericType);
			response = (CompletionStage<T>) callbackDispatcher.deleteRequestForGenericTypedResponse(linkTarget,
					genericType, informedAdditionalProperties);
			break;

		case URI:
			ReactiveAsyncHelper.validateUrlTypeUri(uriTarget, genericType);
			response = (CompletionStage<T>) callbackDispatcher.deleteRequestForGenericTypedResponse(uriTarget,
					genericType, informedAdditionalProperties);
			break;

		case URIBUILDER:
			ReactiveAsyncHelper.validateUrlTypeBuilder(uriBuilderTarget, genericType);
			response = (CompletionStage<T>) callbackDispatcher.deleteRequestForGenericTypedResponse(uriBuilderTarget,
					genericType, informedAdditionalProperties);
			break;

		case WEBTARGET:
			ReactiveAsyncHelper.validateUrlTypeWebTarget(webTarget, genericType);
			response = (CompletionStage<T>) callbackDispatcher.deleteRequestForGenericTypedResponse(webTarget,
					genericType, informedAdditionalProperties);
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
