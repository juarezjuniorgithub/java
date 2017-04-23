package com.juarezjunior.http.client.async.reactive.javase8.commands;

import java.net.URI;
import java.util.concurrent.CompletionStage;

import javax.ws.rs.client.Entity;
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
public class ReactiveAsyncHttpPostCommandClassResponse<T> extends HystrixCommand<CompletionStage<T>> {

	protected String stringTarget;

	protected Link linkTarget;

	protected URI uriTarget;

	protected UriBuilder uriBuilderTarget;

	protected RxWebTarget<RxCompletionStageInvoker> webTarget;

	protected final Class<?> clazzType;

	protected final Entity<?> entity;

	@Inject
	protected ReactiveAsyncDispatcher callbackDispatcher;

	protected final String httpRequestTargetType;

	protected Object[] informedAdditionalProperties;

	public ReactiveAsyncHttpPostCommandClassResponse(final String targetUrlString, final Entity<?> entity,
			final Class<T> responseType, final int timeout, Object... additionalProperties) {

		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.POST_COMMAND_CLASS_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.stringTarget = targetUrlString;
		this.clazzType = responseType;
		this.entity = entity;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.STRING_URL.value();
	}

	public ReactiveAsyncHttpPostCommandClassResponse(final Link link, final Entity<?> entity,
			final Class<T> responseType, final int timeout, Object... additionalProperties) {

		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.POST_COMMAND_CLASS_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.linkTarget = link;
		this.clazzType = responseType;
		this.entity = entity;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.LINK.value();
	}

	public ReactiveAsyncHttpPostCommandClassResponse(final URI uri, final Entity<?> entity, final Class<T> responseType,
			final int timeout, Object... additionalProperties) {

		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.POST_COMMAND_CLASS_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.uriTarget = uri;
		this.clazzType = responseType;
		this.entity = entity;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.URI.value();
	}

	public ReactiveAsyncHttpPostCommandClassResponse(final UriBuilder uriBuilder, final Entity<?> entity,
			final Class<T> responseType, final int timeout, Object... additionalProperties) {

		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.POST_COMMAND_CLASS_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.uriBuilderTarget = uriBuilder;
		this.clazzType = responseType;
		this.entity = entity;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.URIBUILDER.value();
	}

	public ReactiveAsyncHttpPostCommandClassResponse(final RxWebTarget<RxCompletionStageInvoker> target,
			final Entity<?> entity, final Class<T> responseType, final int timeout, Object... additionalProperties) {

		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.POST_COMMAND_CLASS_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.webTarget = target;
		this.clazzType = responseType;
		this.entity = entity;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.WEBTARGET.value();
	}

	@Override
	protected CompletionStage<T> run() throws Exception {

		CompletionStage<T> response = null;

		ReactiveAsyncUtilsEnum targetType = ReactiveAsyncUtilsEnum.valueOf(httpRequestTargetType);

		switch (targetType) {

		case STRING_URL:
			ReactiveAsyncHelper.validateTargetUrlTypeString(stringTarget, clazzType, entity);
			response = (CompletionStage<T>) callbackDispatcher.postRequestForTypedResponse(stringTarget, entity,
					clazzType, informedAdditionalProperties);
			break;

		case LINK:
			ReactiveAsyncHelper.validateUrlTypeLink(linkTarget, clazzType, entity);
			response = (CompletionStage<T>) callbackDispatcher.postRequestForTypedResponse(linkTarget, entity,
					clazzType, informedAdditionalProperties);
			break;

		case URI:
			ReactiveAsyncHelper.validateUrlTypeUri(uriTarget, clazzType, entity);
			response = (CompletionStage<T>) callbackDispatcher.postRequestForTypedResponse(uriTarget, entity, clazzType,
					informedAdditionalProperties);
			break;

		case URIBUILDER:
			ReactiveAsyncHelper.validateUrlTypeBuilder(uriBuilderTarget, clazzType, entity);
			response = (CompletionStage<T>) callbackDispatcher.postRequestForTypedResponse(uriBuilderTarget, entity,
					clazzType, informedAdditionalProperties);
			break;

		case WEBTARGET:
			ReactiveAsyncHelper.validateUrlTypeWebTarget(webTarget, clazzType, entity);
			response = (CompletionStage<T>) callbackDispatcher.postRequestForTypedResponse(webTarget, entity, clazzType,
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
