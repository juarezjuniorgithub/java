package com.juarezjunior.http.client.async.reactive.javase8.commands;

import java.net.URI;
import java.util.concurrent.CompletionStage;

import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;
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

public class ReactiveAsyncHttpDeleteImperativeCommandResponse<T> extends HystrixCommand<CompletionStage<Response>> {

	protected String stringTarget;

	protected Link linkTarget;

	protected URI uriTarget;

	protected UriBuilder uriBuilderTarget;

	protected RxWebTarget<RxCompletionStageInvoker> webTarget;

	@Inject
	protected ReactiveAsyncDispatcher callbackDispatcher;

	protected final String httpRequestTargetType;

	protected Object[] informedAdditionalProperties;

	public ReactiveAsyncHttpDeleteImperativeCommandResponse(final String targetUrl, final int timeout,
			Object... additionalProperties) {

		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.DELETE_COMMAND_RESP_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		Injector injector = Guice.createInjector(new ReactiveAsyncHttpClientModule());
		injector.injectMembers(this);
		this.informedAdditionalProperties = additionalProperties;
		this.stringTarget = targetUrl;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.STRING_URL.value();
	}

	public ReactiveAsyncHttpDeleteImperativeCommandResponse(final Link link, final int timeout,
			Object... additionalProperties) {

		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.DELETE_COMMAND_RESP_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		Injector injector = Guice.createInjector(new ReactiveAsyncHttpClientModule());
		injector.injectMembers(this);
		this.informedAdditionalProperties = additionalProperties;
		this.linkTarget = link;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.LINK.value();
	}

	public ReactiveAsyncHttpDeleteImperativeCommandResponse(final URI uri, final int timeout,
			Object... additionalProperties) {

		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.DELETE_COMMAND_RESP_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		Injector injector = Guice.createInjector(new ReactiveAsyncHttpClientModule());
		injector.injectMembers(this);
		this.informedAdditionalProperties = additionalProperties;
		this.uriTarget = uri;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.URI.value();
	}

	public ReactiveAsyncHttpDeleteImperativeCommandResponse(final UriBuilder uriBuilder, final int timeout,
			Object... additionalProperties) {

		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.DELETE_COMMAND_RESP_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		Injector injector = Guice.createInjector(new ReactiveAsyncHttpClientModule());
		injector.injectMembers(this);
		this.informedAdditionalProperties = additionalProperties;
		this.uriBuilderTarget = uriBuilder;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.URIBUILDER.value();
	}

	public ReactiveAsyncHttpDeleteImperativeCommandResponse(final RxWebTarget<RxCompletionStageInvoker> target,
			final int timeout, Object... additionalProperties) {

		super(Setter
				.withGroupKey(HystrixCommandGroupKey.Factory
						.asKey(ReactiveAsyncCommandsEnum.DELETE_COMMAND_RESP_GROUP.value()))
				.andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(timeout)));
		Injector injector = Guice.createInjector(new ReactiveAsyncHttpClientModule());
		injector.injectMembers(this);
		this.informedAdditionalProperties = additionalProperties;
		this.webTarget = target;
		this.httpRequestTargetType = ReactiveAsyncUtilsEnum.WEBTARGET.value();
	}

	@Override
	protected CompletionStage<Response> run() throws Exception {

		CompletionStage<Response> response = null;

		ReactiveAsyncUtilsEnum targetType = ReactiveAsyncUtilsEnum.valueOf(httpRequestTargetType);

		switch (targetType) {

		case STRING_URL:
			ReactiveAsyncHelper.checkStringUrl(stringTarget);
			response = callbackDispatcher.deleteRequestForResponse(stringTarget, informedAdditionalProperties);
			break;

		case LINK:
			ReactiveAsyncHelper.checkLink(linkTarget);
			response = callbackDispatcher.deleteRequestForResponse(linkTarget, informedAdditionalProperties);
			break;

		case URI:
			ReactiveAsyncHelper.checkUri(uriTarget);
			response = callbackDispatcher.deleteRequestForResponse(uriTarget, informedAdditionalProperties);
			break;

		case URIBUILDER:
			ReactiveAsyncHelper.checkUriBuilder(uriBuilderTarget);
			response = callbackDispatcher.deleteRequestForResponse(uriBuilderTarget, informedAdditionalProperties);
			break;

		case WEBTARGET:
			ReactiveAsyncHelper.checkWebTarget(webTarget);
			response = callbackDispatcher.deleteRequestForResponse(webTarget, informedAdditionalProperties);
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
