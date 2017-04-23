package com.juarezjunior.http.client.async.reactive.javase8.commands;

import java.net.URI;
import java.util.concurrent.CompletionStage;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.rx.RxWebTarget;
import org.glassfish.jersey.client.rx.java8.RxCompletionStageInvoker;

import com.google.inject.Inject;
import com.juarezjunior.http.client.async.reactive.javase8.guice.ReactiveAsyncGuiceInjector;
import com.juarezjunior.http.client.async.reactive.javase8.helpers.ReactiveAsyncCommandsEnum;
import com.juarezjunior.http.client.async.reactive.javase8.helpers.ReactiveAsyncDispatcher;
import com.juarezjunior.http.client.async.reactive.javase8.helpers.ReactiveAsyncHelper;
import com.juarezjunior.http.client.async.reactive.javase8.helpers.ReactiveAsyncUtilsEnum;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;

@SuppressWarnings("unchecked")
public class ReactiveAsyncHttpPutCommandGenericTypeResponse<T> extends HystrixCommand<CompletionStage<T>> {

	protected String stringTarget;

	protected Link linkTarget;

	protected URI uriTarget;

	protected UriBuilder uriBuilderTarget;

	protected RxWebTarget<RxCompletionStageInvoker> webTarget;

	protected final GenericType<?> genericType;

	protected final Entity<?> entity;

	@Inject
	protected ReactiveAsyncDispatcher callbackDispatcher;

	protected final String httpRequestTargetType;

	protected Object[] informedAdditionalProperties;

	public ReactiveAsyncHttpPutCommandGenericTypeResponse(final String targetUrl, final Entity<?> entity,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		super(Setter
				.withGroupKey(
						HystrixCommandGroupKey.Factory.asKey(ReactiveAsyncCommandsEnum.PUT_COMMAND_GEN_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.stringTarget = targetUrl;
		this.genericType = type;
		this.entity = entity;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.STRING_URL.value();
	}

	public ReactiveAsyncHttpPutCommandGenericTypeResponse(final Link link, final Entity<?> entity,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		super(Setter
				.withGroupKey(
						HystrixCommandGroupKey.Factory.asKey(ReactiveAsyncCommandsEnum.PUT_COMMAND_GEN_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.linkTarget = link;
		this.genericType = type;
		this.entity = entity;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.LINK.value();
	}

	public ReactiveAsyncHttpPutCommandGenericTypeResponse(final URI uri, final Entity<?> entity,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		super(Setter
				.withGroupKey(
						HystrixCommandGroupKey.Factory.asKey(ReactiveAsyncCommandsEnum.PUT_COMMAND_GEN_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.uriTarget = uri;
		this.genericType = type;
		this.entity = entity;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.URI.value();
	}

	public ReactiveAsyncHttpPutCommandGenericTypeResponse(final UriBuilder uriBuilder, final Entity<?> entity,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		super(Setter
				.withGroupKey(
						HystrixCommandGroupKey.Factory.asKey(ReactiveAsyncCommandsEnum.PUT_COMMAND_GEN_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.uriBuilderTarget = uriBuilder;
		this.genericType = type;
		this.entity = entity;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.URIBUILDER.value();
	}

	public ReactiveAsyncHttpPutCommandGenericTypeResponse(final RxWebTarget<RxCompletionStageInvoker> target,
			final Entity<?> entity, final GenericType<T> type, final int timeout, Object... additionalProperties) {

		super(Setter
				.withGroupKey(
						HystrixCommandGroupKey.Factory.asKey(ReactiveAsyncCommandsEnum.PUT_COMMAND_GEN_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.webTarget = target;
		this.genericType = type;
		this.entity = entity;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.WEBTARGET.value();
	}

	@Override
	protected CompletionStage<T> run() throws Exception {

		CompletionStage<T> response = null;
		ReactiveAsyncUtilsEnum targetType = ReactiveAsyncUtilsEnum.valueOf(httpRequestTargetType);

		switch (targetType) {

		case STRING_URL:
			ReactiveAsyncHelper.validateTargetUrlTypeString(stringTarget, genericType, entity);
			response = (CompletionStage<T>) callbackDispatcher.putRequestForGenericTypedResponse(stringTarget, entity,
					genericType, informedAdditionalProperties);
			break;

		case LINK:
			ReactiveAsyncHelper.validateUrlTypeLink(linkTarget, genericType, entity);
			response = (CompletionStage<T>) callbackDispatcher.putRequestForGenericTypedResponse(linkTarget, entity,
					genericType, informedAdditionalProperties);
			break;

		case URI:
			ReactiveAsyncHelper.validateUrlTypeUri(uriTarget, genericType, entity);
			response = (CompletionStage<T>) callbackDispatcher.putRequestForGenericTypedResponse(uriTarget, entity,
					genericType, informedAdditionalProperties);
			break;

		case URIBUILDER:
			ReactiveAsyncHelper.validateUrlTypeBuilder(uriBuilderTarget, genericType, entity);
			response = (CompletionStage<T>) callbackDispatcher.putRequestForGenericTypedResponse(uriBuilderTarget,
					entity, genericType, informedAdditionalProperties);
			break;

		case WEBTARGET:
			ReactiveAsyncHelper.validateUrlTypeWebTarget(webTarget, genericType, entity);
			response = (CompletionStage<T>) callbackDispatcher.putRequestForGenericTypedResponse(webTarget, entity,
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
