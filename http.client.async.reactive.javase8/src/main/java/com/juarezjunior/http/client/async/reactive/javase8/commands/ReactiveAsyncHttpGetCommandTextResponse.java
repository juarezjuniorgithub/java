package com.juarezjunior.http.client.async.reactive.javase8.commands;

import java.net.URI;
import java.util.concurrent.CompletionStage;

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

public class ReactiveAsyncHttpGetCommandTextResponse<T> extends HystrixCommand<CompletionStage<String>> {

	protected String stringTarget;

	protected Link linkTarget;

	protected URI uriTarget;

	protected UriBuilder uriBuilderTarget;

	protected RxWebTarget<RxCompletionStageInvoker> webTarget;

	@Inject
	protected ReactiveAsyncDispatcher callbackDispatcher;

	protected final String httpRequestTargetType;

	protected Object[] informedAdditionalProperties;

	public ReactiveAsyncHttpGetCommandTextResponse(final String targetUrl, final int timeout,
			Object... additionalProperties) {

		super(Setter
				.withGroupKey(
						HystrixCommandGroupKey.Factory.asKey(ReactiveAsyncCommandsEnum.GET_COMMAND_TEXT_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.stringTarget = targetUrl;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.STRING_URL.value();
	}

	public ReactiveAsyncHttpGetCommandTextResponse(final Link link, final int timeout, Object... additionalProperties) {

		super(Setter
				.withGroupKey(
						HystrixCommandGroupKey.Factory.asKey(ReactiveAsyncCommandsEnum.GET_COMMAND_TEXT_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.linkTarget = link;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.LINK.value();
	}

	public ReactiveAsyncHttpGetCommandTextResponse(final URI uri, final int timeout, Object... additionalProperties) {

		super(Setter
				.withGroupKey(
						HystrixCommandGroupKey.Factory.asKey(ReactiveAsyncCommandsEnum.GET_COMMAND_TEXT_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.uriTarget = uri;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.URI.value();
	}

	public ReactiveAsyncHttpGetCommandTextResponse(final UriBuilder uriBuilder, final int timeout,
			Object... additionalProperties) {

		super(Setter
				.withGroupKey(
						HystrixCommandGroupKey.Factory.asKey(ReactiveAsyncCommandsEnum.GET_COMMAND_TEXT_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.uriBuilderTarget = uriBuilder;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.URIBUILDER.value();
	}

	public ReactiveAsyncHttpGetCommandTextResponse(final RxWebTarget<RxCompletionStageInvoker> target,
			final int timeout, Object... additionalProperties) {

		super(Setter
				.withGroupKey(
						HystrixCommandGroupKey.Factory.asKey(ReactiveAsyncCommandsEnum.GET_COMMAND_TEXT_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		this.informedAdditionalProperties = additionalProperties;
		this.webTarget = target;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.WEBTARGET.value();
	}

	@Override
	protected CompletionStage<String> run() throws Exception {

		CompletionStage<String> response = null;

		ReactiveAsyncUtilsEnum targetType = ReactiveAsyncUtilsEnum.valueOf(httpRequestTargetType);

		switch (targetType) {

		case STRING_URL:
			ReactiveAsyncHelper.checkStringUrl(stringTarget);
			response = callbackDispatcher.getRequestForTextResponse(stringTarget, informedAdditionalProperties);
			break;

		case LINK:
			ReactiveAsyncHelper.checkLink(linkTarget);
			response = callbackDispatcher.getRequestForTextResponse(linkTarget, informedAdditionalProperties);
			break;

		case URI:
			ReactiveAsyncHelper.checkUri(uriTarget);
			response = callbackDispatcher.getRequestForTextResponse(uriTarget, informedAdditionalProperties);
			break;

		case URIBUILDER:
			ReactiveAsyncHelper.checkUriBuilder(uriBuilderTarget);
			response = callbackDispatcher.getRequestForTextResponse(uriBuilderTarget, informedAdditionalProperties);
			break;

		case WEBTARGET:
			ReactiveAsyncHelper.checkWebTarget(webTarget);
			response = callbackDispatcher.getRequestForTextResponse(webTarget, informedAdditionalProperties);
			break;

		default:
			response = null;
			break;

		}

		return response;

	}

	@Override
	protected CompletionStage<String> getFallback() {
		return null;
	}

}
