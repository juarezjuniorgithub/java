package com.juarezjunior.http.client.async.reactive.javase8.commands;

import java.net.URI;
import java.util.concurrent.CompletionStage;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;
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

public class ReactiveAsyncHttpPutCommandResponse<T> extends HystrixCommand<CompletionStage<Response>> {

	protected String stringTarget;

	protected Link linkTarget;

	protected URI uriTarget;

	protected UriBuilder uriBuilderTarget;

	protected RxWebTarget<RxCompletionStageInvoker> webTarget;

	protected final Entity<?> entity;

	@Inject
	protected ReactiveAsyncDispatcher callbackDispatcher;

	protected final String httpRequestTargetType;

	protected Object[] informedAdditionalProperties;

	public ReactiveAsyncHttpPutCommandResponse(final String targetUrl, final Entity<?> entity, final int timeout,
			Object... additionalProperties) {

		super(Setter
				.withGroupKey(
						HystrixCommandGroupKey.Factory.asKey(ReactiveAsyncCommandsEnum.PUT_COMMAND_RESP_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.stringTarget = targetUrl;
		this.entity = entity;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.STRING_URL.value();
	}

	public ReactiveAsyncHttpPutCommandResponse(final Link link, final Entity<?> entity, final int timeout,
			Object... additionalProperties) {

		super(Setter
				.withGroupKey(
						HystrixCommandGroupKey.Factory.asKey(ReactiveAsyncCommandsEnum.PUT_COMMAND_RESP_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.linkTarget = link;
		this.entity = entity;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.LINK.value();
	}

	public ReactiveAsyncHttpPutCommandResponse(final URI uri, final Entity<?> entity, final int timeout,
			Object... additionalProperties) {

		super(Setter
				.withGroupKey(
						HystrixCommandGroupKey.Factory.asKey(ReactiveAsyncCommandsEnum.PUT_COMMAND_RESP_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.uriTarget = uri;
		this.entity = entity;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.URI.value();
	}

	public ReactiveAsyncHttpPutCommandResponse(final UriBuilder uriBuilder, final Entity<?> entity, final int timeout,
			Object... additionalProperties) {

		super(Setter
				.withGroupKey(
						HystrixCommandGroupKey.Factory.asKey(ReactiveAsyncCommandsEnum.PUT_COMMAND_RESP_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.uriBuilderTarget = uriBuilder;
		this.entity = entity;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.URIBUILDER.value();
	}

	public ReactiveAsyncHttpPutCommandResponse(final RxWebTarget<RxCompletionStageInvoker> target,
			final Entity<?> entity, final int timeout, Object... additionalProperties) {
		super(Setter
				.withGroupKey(
						HystrixCommandGroupKey.Factory.asKey(ReactiveAsyncCommandsEnum.PUT_COMMAND_RESP_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.webTarget = target;
		this.entity = entity;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.WEBTARGET.value();
	}

	@Override
	protected CompletionStage<Response> run() throws Exception {

		CompletionStage<Response> response = null;
		ReactiveAsyncUtilsEnum targetType = ReactiveAsyncUtilsEnum.valueOf(httpRequestTargetType);

		switch (targetType) {

		case STRING_URL:
			ReactiveAsyncHelper.validateTargetUrlTypeString(stringTarget, entity);
			response = callbackDispatcher.putRequestForResponse(stringTarget, entity, informedAdditionalProperties);
			break;

		case LINK:
			ReactiveAsyncHelper.validateUrlTypeLink(linkTarget, entity);
			response = callbackDispatcher.putRequestForResponse(linkTarget, entity, informedAdditionalProperties);
			break;

		case URI:
			ReactiveAsyncHelper.validateUrlTypeUri(uriTarget, entity);
			response = callbackDispatcher.putRequestForResponse(uriTarget, entity, informedAdditionalProperties);
			break;

		case URIBUILDER:
			ReactiveAsyncHelper.validateUrlTypeBuilder(uriBuilderTarget, entity);
			response = callbackDispatcher.putRequestForResponse(uriBuilderTarget, entity, informedAdditionalProperties);
			break;

		case WEBTARGET:
			ReactiveAsyncHelper.validateUrlTypeWebTarget(webTarget, entity);
			response = callbackDispatcher.putRequestForResponse(webTarget, entity, informedAdditionalProperties);
			break;

		default:
			response = null;
			break;

		}

		return response;

	}

	@Override
	protected CompletionStage<Response> getFallback() {
		return null;
	}
}
