package com.juarezjunior.http.client.async.reactive.javase8.helpers;

import java.net.URI;
import java.util.Map;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.client.rx.Rx;
import org.glassfish.jersey.client.rx.RxClient;
import org.glassfish.jersey.client.rx.RxInvocationBuilder;
import org.glassfish.jersey.client.rx.RxWebTarget;
import org.glassfish.jersey.client.rx.java8.RxCompletionStageInvoker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Singleton;
import com.juarezjunior.http.client.async.reactive.javase8.guice.ReactiveAsyncGuiceInjector;

@Singleton
public class ReactiveAsyncDispatcher implements IReactiveAsyncHttpRequestDispatcher {

	protected static RxClient<RxCompletionStageInvoker> rxClient;

	protected static ExecutorService executor;

	protected static Logger LOGGER = LoggerFactory.getLogger(ReactiveAsyncDispatcher.class);

	public ReactiveAsyncDispatcher() {
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		rxClient = Rx.newClient(RxCompletionStageInvoker.class, ForkJoinPool.commonPool());
		rxClient.property(ClientProperties.CONNECT_TIMEOUT, 50000);
		rxClient.property(ClientProperties.READ_TIMEOUT, 240000);
		rxClient.property(ClientProperties.ASYNC_THREADPOOL_SIZE, 2000);
	}

	@Override
	public <T> CompletionStage<T> getRequestForTypedResponse(final String stringURL, final Class<T> responseType,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).get(responseType);
		return response;
	}

	@Override
	public <T> CompletionStage<T> getRequestForTypedResponse(final Link link, final Class<T> responseType,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).get(responseType);
		return response;

	}

	@Override
	public <T> CompletionStage<T> getRequestForTypedResponse(final URI uri, final Class<T> responseType,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).get(responseType);
		return response;
	}

	@Override
	public <T> CompletionStage<T> getRequestForTypedResponse(final UriBuilder uriBuilder, final Class<T> responseType,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).get(responseType);
		return response;

	}

	@Override
	public <T> CompletionStage<T> getRequestForTypedResponse(final RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			final Class<T> responseType, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).get(responseType);
		return response;

	}

	@Override
	public <T> CompletionStage<T> getRequestForGenericTypedResponse(final String stringURL, final GenericType<T> type,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).get(type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> getRequestForGenericTypedResponse(final Link link, final GenericType<T> type,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).get(type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> getRequestForGenericTypedResponse(final URI uri, final GenericType<T> type,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).get(type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> getRequestForGenericTypedResponse(final UriBuilder uriBuilder,
			final GenericType<T> type, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).get(type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> getRequestForGenericTypedResponse(
			final RxWebTarget<RxCompletionStageInvoker> rxWebTarget, final GenericType<T> type,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).get(type);
		return response;

	}

	@Override
	public CompletionStage<String> getRequestForTextResponse(final String stringURL, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).get(String.class);
		return response;

	}

	@Override
	public CompletionStage<String> getRequestForTextResponse(final Link link, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).get(String.class);
		return response;

	}

	@Override
	public CompletionStage<String> getRequestForTextResponse(final URI uri, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).get(String.class);
		return response;

	}

	@Override
	public CompletionStage<String> getRequestForTextResponse(final UriBuilder uriBuilder,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).get(String.class);
		return response;

	}

	@Override
	public CompletionStage<String> getRequestForTextResponse(final RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).get(String.class);
		return response;

	}

	@Override
	public CompletionStage<Response> getRequestForResponse(final String stringURL, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).get();
		return response;

	}

	@Override
	public CompletionStage<Response> getRequestForResponse(final Link link, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).get();
		return response;

	}

	@Override
	public CompletionStage<Response> getRequestForResponse(final URI uri, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).get();
		return response;

	}

	@Override
	public CompletionStage<Response> getRequestForResponse(final UriBuilder uriBuilder,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).get();
		return response;

	}

	@Override
	public CompletionStage<Response> getRequestForResponse(final RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).get();
		return response;

	}

	@Override
	public CompletionStage<Response> postRequestForResponse(final String stringURL, final Entity<?> entity,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity);
		return response;

	}

	@Override
	public CompletionStage<Response> postRequestForResponse(final Link link, final Entity<?> entity,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity);
		return response;

	}

	@Override
	public CompletionStage<Response> postRequestForResponse(final URI uri, final Entity<?> entity,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity);
		return response;

	}

	@Override
	public CompletionStage<Response> postRequestForResponse(final UriBuilder uriBuilder, final Entity<?> entity,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity);
		return response;

	}

	@Override
	public CompletionStage<Response> postRequestForResponse(final RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			final Entity<?> entity, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity);
		return response;

	}

	@Override
	public <T> CompletionStage<T> postRequestForTypedResponse(final String stringURL, final Entity<?> entity,
			final Class<T> responseTypeClazz, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity, responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> postRequestForTypedResponse(final Link link, final Entity<?> entity,
			final Class<T> responseTypeClazz, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity, responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> postRequestForTypedResponse(final URI uri, final Entity<?> entity,
			final Class<T> responseTypeClazz, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity, responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> postRequestForTypedResponse(final UriBuilder uriBuilder, final Entity<?> entity,
			final Class<T> responseTypeClazz, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity, responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> postRequestForTypedResponse(final RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			final Entity<?> entity, final Class<T> responseTypeClazz, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity, responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> postRequestForGenericTypedResponse(final String stringURL, final Entity<?> entity,
			final GenericType<T> type, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity, type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> postRequestForGenericTypedResponse(final Link link, final Entity<?> entity,
			final GenericType<T> type, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity, type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> postRequestForGenericTypedResponse(final URI uri, final Entity<?> entity,
			final GenericType<T> type, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity, type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> postRequestForGenericTypedResponse(final UriBuilder uriBuilder,
			final Entity<?> entity, final GenericType<T> type, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity, type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> postRequestForGenericTypedResponse(
			final RxWebTarget<RxCompletionStageInvoker> rxWebTarget, final Entity<?> entity, final GenericType<T> type,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity, type);
		return response;

	}

	@Override
	public CompletionStage<String> postRequestForTextResponse(final String stringURL, final Entity<?> entity,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity, String.class);
		return response;

	}

	@Override
	public CompletionStage<String> postRequestForTextResponse(final Link link, final Entity<?> entity,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity, String.class);
		return response;

	}

	@Override
	public CompletionStage<String> postRequestForTextResponse(final URI uri, final Entity<?> entity,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity, String.class);
		return response;

	}

	@Override
	public CompletionStage<String> postRequestForTextResponse(final UriBuilder uriBuilder, final Entity<?> entity,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity, String.class);
		return response;

	}

	@Override
	public CompletionStage<String> postRequestForTextResponse(final RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			final Entity<?> entity, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).post(entity, String.class);
		return response;

	}

	@Override
	public CompletionStage<Response> deleteRequestForResponse(final String stringURL, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete();
		return response;

	}

	@Override
	public CompletionStage<Response> deleteRequestForResponse(final Link link, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete();
		return response;

	}

	@Override
	public CompletionStage<Response> deleteRequestForResponse(final URI uri, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete();
		return response;

	}

	@Override
	public CompletionStage<Response> deleteRequestForResponse(final UriBuilder uriBuilder,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete();
		return response;

	}

	@Override
	public CompletionStage<Response> deleteRequestForResponse(final RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete();
		return response;

	}

	@Override
	public <T> CompletionStage<T> deleteRequestForTypedResponse(final String stringURL,
			final Class<T> responseTypeClazz, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete(responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> deleteRequestForTypedResponse(final Link link, final Class<T> responseTypeClazz,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxClient.target(link).request().rx(ForkJoinPool.commonPool())
				.delete(responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> deleteRequestForTypedResponse(final URI uri, final Class<T> responseTypeClazz,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete(responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> deleteRequestForTypedResponse(final UriBuilder uriBuilder,
			final Class<T> responseTypeClazz, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete(responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> deleteRequestForTypedResponse(final RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			final Class<T> responseTypeClazz, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete(responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> deleteRequestForGenericTypedResponse(final String stringURL,
			final GenericType<T> type, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete(type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> deleteRequestForGenericTypedResponse(final Link link, final GenericType<T> type,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete(type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> deleteRequestForGenericTypedResponse(final URI uri, final GenericType<T> type,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete(type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> deleteRequestForGenericTypedResponse(final UriBuilder uriBuilder,
			final GenericType<T> type, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete(type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> deleteRequestForGenericTypedResponse(
			final RxWebTarget<RxCompletionStageInvoker> rxWebTarget, final GenericType<T> type,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete(type);
		return response;

	}

	@Override
	public CompletionStage<String> deleteRequestForTextResponse(final String stringURL,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete(String.class);
		return response;

	}

	@Override
	public CompletionStage<String> deleteRequestForTextResponse(final Link link, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete(String.class);
		return response;

	}

	@Override
	public CompletionStage<String> deleteRequestForTextResponse(final URI uri, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete(String.class);
		return response;

	}

	@Override
	public CompletionStage<String> deleteRequestForTextResponse(final UriBuilder uriBuilder,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete(String.class);
		return response;

	}

	@Override
	public CompletionStage<String> deleteRequestForTextResponse(final RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete(String.class);
		return response;

	}

	@Override
	public CompletionStage<Response> optionsRequestForResponse(final String stringURL, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).options();
		return response;

	}

	@Override
	public CompletionStage<Response> optionsRequestForResponse(final Link link, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).options();
		return response;

	}

	@Override
	public CompletionStage<Response> optionsRequestForResponse(final URI uri, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).options();
		return response;

	}

	@Override
	public CompletionStage<Response> optionsRequestForResponse(final UriBuilder uriBuilder,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).options();
		return response;

	}

	@Override
	public CompletionStage<Response> optionsRequestForResponse(final RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).delete();
		return response;

	}

	@Override
	public <T> CompletionStage<T> optionsRequestForTypedResponse(final String stringURL,
			final Class<T> responseTypeClazz, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).options(responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> optionsRequestForTypedResponse(final Link link, final Class<T> responseTypeClazz,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).options(responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> optionsRequestForTypedResponse(final URI uri, final Class<T> responseTypeClazz,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).options(responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> optionsRequestForTypedResponse(final UriBuilder uriBuilder,
			final Class<T> responseTypeClazz, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).options(responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> optionsRequestForTypedResponse(
			final RxWebTarget<RxCompletionStageInvoker> rxWebTarget, final Class<T> responseTypeClazz,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).options(responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> optionsRequestForGenericTypedResponse(final String stringURL,
			final GenericType<T> type, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).options(type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> optionsRequestForGenericTypedResponse(final Link link, final GenericType<T> type,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).options(type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> optionsRequestForGenericTypedResponse(final URI uri, final GenericType<T> type,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).options(type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> optionsRequestForGenericTypedResponse(final UriBuilder uriBuilder,
			final GenericType<T> type, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).options(type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> optionsRequestForGenericTypedResponse(
			final RxWebTarget<RxCompletionStageInvoker> rxWebTarget, final GenericType<T> type,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).options(type);
		return response;

	}

	@Override
	public CompletionStage<String> optionsRequestForTextResponse(final String stringURL,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).options(String.class);
		return response;

	}

	@Override
	public CompletionStage<String> optionsRequestForTextResponse(final Link link, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).options(String.class);
		return response;

	}

	@Override
	public CompletionStage<String> optionsRequestForTextResponse(final URI uri, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).options(String.class);
		return response;

	}

	@Override
	public CompletionStage<String> optionsRequestForTextResponse(final UriBuilder uriBuilder,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).options(String.class);
		return response;

	}

	@Override
	public CompletionStage<String> optionsRequestForTextResponse(
			final RxWebTarget<RxCompletionStageInvoker> rxWebTarget, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).options(String.class);
		return response;

	}

	@Override
	public CompletionStage<Response> traceRequestForResponse(final String stringURL, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace();
		return response;

	}

	@Override
	public CompletionStage<Response> traceRequestForResponse(final Link link, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace();
		return response;

	}

	@Override
	public CompletionStage<Response> traceRequestForResponse(final URI uri, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace();
		return response;

	}

	@Override
	public CompletionStage<Response> traceRequestForResponse(final UriBuilder uriBuilder,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace();
		return response;

	}

	@Override
	public CompletionStage<Response> traceRequestForResponse(final RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace();
		return response;

	}

	@Override
	public <T> CompletionStage<T> traceRequestForTypedResponse(final String stringURL, final Class<T> responseTypeClazz,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace(responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> traceRequestForTypedResponse(final Link link, final Class<T> responseTypeClazz,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace(responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> traceRequestForTypedResponse(final URI uri, final Class<T> responseTypeClazz,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace(responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> traceRequestForTypedResponse(final UriBuilder uriBuilder,
			final Class<T> responseTypeClazz, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace(responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> traceRequestForTypedResponse(final RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			final Class<T> responseTypeClazz, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace(responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> traceRequestForGenericTypedResponse(final String stringURL, final GenericType<T> type,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace(type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> traceRequestForGenericTypedResponse(final Link link, final GenericType<T> type,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace(type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> traceRequestForGenericTypedResponse(final URI uri, final GenericType<T> type,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace(type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> traceRequestForGenericTypedResponse(final UriBuilder uriBuilder,
			final GenericType<T> type, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace(type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> traceRequestForGenericTypedResponse(
			final RxWebTarget<RxCompletionStageInvoker> rxWebTarget, final GenericType<T> type,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace(type);
		return response;

	}

	@Override
	public CompletionStage<String> traceRequestForTextResponse(final String stringURL, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace(String.class);
		return response;

	}

	@Override
	public CompletionStage<String> traceRequestForTextResponse(final Link link, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace(String.class);
		return response;

	}

	@Override
	public CompletionStage<String> traceRequestForTextResponse(final URI uri, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace(String.class);
		return response;

	}

	@Override
	public CompletionStage<String> traceRequestForTextResponse(final UriBuilder uriBuilder,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace(String.class);
		return response;

	}

	@Override
	public CompletionStage<String> traceRequestForTextResponse(final RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<String> response = rxBuilder.rx(ForkJoinPool.commonPool()).trace(String.class);
		return response;

	}

	@Override
	public CompletionStage<Response> headRequestForResponse(final String stringURL, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		final CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).head();
		return response;

	}

	@Override
	public CompletionStage<Response> headRequestForResponse(final Link link, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).head();
		return response;

	}

	@Override
	public CompletionStage<Response> headRequestForResponse(final URI uri, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).head();
		return response;

	}

	@Override
	public CompletionStage<Response> headRequestForResponse(final UriBuilder uriBuilder,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).head();
		return response;

	}

	@Override
	public CompletionStage<Response> headRequestForResponse(final RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).head();
		return response;

	}

	@Override
	public CompletionStage<Response> putRequestForResponse(final String stringURL, final Entity<?> entity,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).put(entity);
		return response;

	}

	@Override
	public CompletionStage<Response> putRequestForResponse(final Link link, final Entity<?> entity,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).put(entity);
		return response;

	}

	@Override
	public CompletionStage<Response> putRequestForResponse(final URI uri, final Entity<?> entity,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).put(entity);
		return response;

	}

	@Override
	public CompletionStage<Response> putRequestForResponse(final UriBuilder uriBuilder, final Entity<?> entity,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).put(entity);
		return response;

	}

	@Override
	public CompletionStage<Response> putRequestForResponse(final RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			final Entity<?> entity, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<Response> response = rxBuilder.rx(ForkJoinPool.commonPool()).put(entity);
		return response;

	}

	@Override
	public <T> CompletionStage<T> putRequestForTypedResponse(final String stringURL, final Entity<?> entity,
			final Class<T> responseTypeClazz, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).put(entity, responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> putRequestForTypedResponse(final Link link, final Entity<?> entity,
			final Class<T> responseTypeClazz, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).put(entity, responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> putRequestForTypedResponse(final URI uri, final Entity<?> entity,
			final Class<T> responseTypeClazz, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).put(entity, responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> putRequestForTypedResponse(final UriBuilder uriBuilder, final Entity<?> entity,
			final Class<T> responseTypeClazz, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).put(entity, responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> putRequestForTypedResponse(final RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			final Entity<?> entity, final Class<T> responseTypeClazz, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).put(entity, responseTypeClazz);
		return response;

	}

	@Override
	public <T> CompletionStage<T> putRequestForGenericTypedResponse(final String stringURL, final Entity<?> entity,
			final GenericType<T> type, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(stringURL).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).put(entity, type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> putRequestForGenericTypedResponse(final Link link, final Entity<?> entity,
			final GenericType<T> type, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(link).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).put(entity, type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> putRequestForGenericTypedResponse(final URI uri, final Entity<?> entity,
			final GenericType<T> type, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uri).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).put(entity, type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> putRequestForGenericTypedResponse(final UriBuilder uriBuilder, final Entity<?> entity,
			final GenericType<T> type, Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxClient.target(uriBuilder).request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).put(entity, type);
		return response;

	}

	@Override
	public <T> CompletionStage<T> putRequestForGenericTypedResponse(
			final RxWebTarget<RxCompletionStageInvoker> rxWebTarget, final Entity<?> entity, final GenericType<T> type,
			Object... additionalProperties) {

		RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder = rxWebTarget.request();
		ReactiveAsyncHelper.configureAdditionaRequestProperties(rxBuilder, additionalProperties);
		CompletionStage<T> response = rxBuilder.rx(ForkJoinPool.commonPool()).put(entity, type);
		return response;

	}

	@Override
	public <T> T getValue(final Map<String, ?> properties, final String key, final T defaultValue) {
		return ClientProperties.getValue(properties, key, defaultValue);
	}

	@Override
	public <T> T getValue(final Map<String, ?> properties, final String key, final T defaultValue,
			final Class<T> type) {
		return ClientProperties.getValue(properties, key, defaultValue, type);
	}

	@Override
	public <T> T getValue(final Map<String, ?> properties, final String key, final Class<T> type) {
		return ClientProperties.getValue(properties, key, type);
	}

	public RxClient<RxCompletionStageInvoker> getRxClient() {
		return rxClient;
	}

}
