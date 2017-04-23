package com.juarezjunior.http.client.async.reactive.javase8.api;

import java.net.URI;
import java.util.Map;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.rx.RxClient;
import org.glassfish.jersey.client.rx.RxWebTarget;
import org.glassfish.jersey.client.rx.java8.RxCompletionStageInvoker;

import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncCommandsResults;

public interface IReactiveAsyncOrchestrator {

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForClassResponse(final String stringURL,
			final Class<T> responseType, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForClassResponse(Link link, Class<T> responseType,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForClassResponse(URI uri, Class<T> responseType,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForClassResponse(UriBuilder uriBuilder, Class<T> responseType,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForClassResponse(RxWebTarget<RxCompletionStageInvoker> target,
			Class<T> responseType, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForGenericTypeResponse(String stringURL, GenericType<T> type,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForGenericTypeResponse(Link link, GenericType<T> type,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForGenericTypeResponse(URI uri, GenericType<T> type,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForGenericTypeResponse(UriBuilder uriBuilder, GenericType<T> type,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForGenericTypeResponse(
			RxWebTarget<RxCompletionStageInvoker> target, GenericType<T> type, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForTextResponse(String stringURL, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForTextResponse(Link link, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForTextResponse(URI uri, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForTextResponse(UriBuilder uriBuilder, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForTextResponse(RxWebTarget<RxCompletionStageInvoker> target,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForResponse(String stringURL, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForResponse(Link link, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForResponse(URI uri, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForResponse(UriBuilder uriBuilder, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpGetRequestForResponse(RxWebTarget<RxCompletionStageInvoker> target,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForResponse(String stringURL, Entity<?> entity,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForResponse(Link link, Entity<?> entity, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForResponse(URI uri, Entity<?> entity, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForResponse(UriBuilder uriBuilder, Entity<?> entity,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForResponse(RxWebTarget<RxCompletionStageInvoker> target,
			Entity<?> entity, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForClassResponse(String stringURL, Entity<?> entity,
			Class<T> responseTypeClazz, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForClassResponse(Link link, Entity<?> entity,
			Class<T> responseTypeClazz, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForClassResponse(URI uri, Entity<?> entity,
			Class<T> responseTypeClazz, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForClassResponse(UriBuilder uriBuilder, Entity<?> entity,
			Class<T> responseTypeClazz, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForClassResponse(RxWebTarget<RxCompletionStageInvoker> target,
			Entity<?> entity, Class<T> responseTypeClazz, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForGenericTypeResponse(String stringURL, Entity<?> entity,
			GenericType<T> type, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForGenericTypeResponse(Link link, Entity<?> entity,
			GenericType<T> type, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForGenericTypeResponse(URI uri, Entity<?> entity,
			GenericType<T> type, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForGenericTypeResponse(UriBuilder uriBuilder, Entity<?> entity,
			GenericType<T> type, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForGenericTypeResponse(
			RxWebTarget<RxCompletionStageInvoker> target, Entity<?> entity, GenericType<T> type, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForTextResponse(String stringURL, Entity<?> entity,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForTextResponse(Link link, Entity<?> entity, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForTextResponse(URI uri, Entity<?> entity, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForTextResponse(UriBuilder uriBuilder, Entity<?> entity,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPostRequestForTextResponse(RxWebTarget<RxCompletionStageInvoker> target,
			Entity<?> entity, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForResponse(String stringURL, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForResponse(Link link, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForResponse(URI uri, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForResponse(UriBuilder uriBuilder, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForResponse(RxWebTarget<RxCompletionStageInvoker> target,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForClassResponse(String stringURL, Class<T> responseTypeClazz,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForClassResponse(Link link, Class<T> responseTypeClazz,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForClassResponse(URI uri, Class<T> responseTypeClazz,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForClassResponse(UriBuilder uriBuilder,
			Class<T> responseTypeClazz, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForClassResponse(RxWebTarget<RxCompletionStageInvoker> target,
			Class<T> responseTypeClazz, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForGenericTypeResponse(String stringURL, GenericType<T> type,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForGenericTypeResponse(Link link, GenericType<T> type,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForGenericTypeResponse(URI uri, GenericType<T> type,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForGenericTypeResponse(UriBuilder uriBuilder,
			GenericType<T> type, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForGenericTypeResponse(
			RxWebTarget<RxCompletionStageInvoker> target, GenericType<T> type, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForTextResponse(String stringURL, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForTextResponse(Link link, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForTextResponse(URI uri, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForTextResponse(UriBuilder uriBuilder, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForTextResponse(RxWebTarget<RxCompletionStageInvoker> target,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForResponse(String stringURL, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForResponse(Link link, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForResponse(URI uri, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForResponse(UriBuilder uriBuilder, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForResponse(RxWebTarget<RxCompletionStageInvoker> target,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForClassResponse(String stringURL, Class<T> responseTypeClazz,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForClassResponse(Link link, Class<T> responseTypeClazz,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForClassResponse(URI uri, Class<T> responseTypeClazz,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForClassResponse(UriBuilder uriBuilder,
			Class<T> responseTypeClazz, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForClassResponse(RxWebTarget<RxCompletionStageInvoker> target,
			Class<T> responseTypeClazz, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForGenericTypeResponse(String stringURL, GenericType<T> type,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForGenericTypeResponse(Link link, GenericType<T> type,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForGenericTypeResponse(URI uri, GenericType<T> type,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForGenericTypeResponse(UriBuilder uriBuilder,
			GenericType<T> type, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForGenericTypeResponse(
			RxWebTarget<RxCompletionStageInvoker> target, GenericType<T> type, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForTextResponse(String stringURL, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForTextResponse(Link link, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForTextResponse(URI uri, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForTextResponse(UriBuilder uriBuilder, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForTextResponse(RxWebTarget<RxCompletionStageInvoker> target,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForResponse(String stringURL, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForResponse(Link link, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForResponse(URI uri, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForResponse(UriBuilder uriBuilder, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForResponse(RxWebTarget<RxCompletionStageInvoker> target,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForClassResponse(String stringURL, Class<T> responseTypeClazz,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForClassResponse(Link link, Class<T> responseTypeClazz,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForClassResponse(URI uri, Class<T> responseTypeClazz,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForClassResponse(UriBuilder uriBuilder,
			Class<T> responseTypeClazz, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForClassResponse(RxWebTarget<RxCompletionStageInvoker> target,
			Class<T> responseTypeClazz, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForGenericTypeResponse(String stringURL, GenericType<T> type,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForGenericTypeResponse(Link link, GenericType<T> type,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForGenericTypeResponse(URI uri, GenericType<T> type,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForGenericTypeResponse(UriBuilder uriBuilder,
			GenericType<T> type, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForGenericTypeResponse(
			RxWebTarget<RxCompletionStageInvoker> target, GenericType<T> type, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForTextResponse(String stringURL, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForTextResponse(Link link, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForTextResponse(URI uri, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForTextResponse(UriBuilder uriBuilder, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpTraceRequestForTextResponse(RxWebTarget<RxCompletionStageInvoker> target,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpHeadRequestForResponse(String stringURL, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpHeadRequestForResponse(Link link, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpHeadRequestForResponse(URI uri, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpHeadRequestForResponse(UriBuilder uriBuilder, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpHeadRequestForResponse(RxWebTarget<RxCompletionStageInvoker> target,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPutRequestForResponse(String stringURL, Entity<?> entity, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPutRequestForResponse(Link link, Entity<?> entity, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPutRequestForResponse(URI uri, Entity<?> entity, final int timeout,
			Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPutRequestForResponse(UriBuilder uriBuilder, Entity<?> entity,
			final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPutRequestForResponse(RxWebTarget<RxCompletionStageInvoker> target,
			Entity<?> entity, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPutRequestForClassResponse(String stringURL, Entity<?> entity,
			Class<T> responseTypeClazz, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPutRequestForClassResponse(Link link, Entity<?> entity,
			Class<T> responseTypeClazz, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPutRequestForClassResponse(URI uri, Entity<?> entity,
			Class<T> responseTypeClazz, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPutRequestForClassResponse(UriBuilder uriBuilder, Entity<?> entity,
			Class<T> responseTypeClazz, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPutRequestForClassResponse(RxWebTarget<RxCompletionStageInvoker> target,
			Entity<?> entity, Class<T> responseTypeClazz, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPutRequestForGenericTypeResponse(String stringURL, Entity<?> entity,
			GenericType<T> type, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPutRequestForGenericTypeResponse(Link link, Entity<?> entity,
			GenericType<T> type, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPutRequestForGenericTypeResponse(URI uri, Entity<?> entity,
			GenericType<T> type, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPutRequestForGenericTypeResponse(UriBuilder uriBuilder, Entity<?> entity,
			GenericType<T> type, final int timeout, Object... additionalProperties);

	<T> ReactiveAsyncCommandsResults<T> httpPutRequestForGenericTypeResponse(
			RxWebTarget<RxCompletionStageInvoker> target, Entity<?> entity, GenericType<T> type, final int timeout,
			Object... additionalProperties);

	<T> T getClientPropertyValue(Map<String, ?> properties, String key, T defaultValue);

	<T> T getClientPropertyValue(Map<String, ?> properties, String key, T defaultValue, Class<T> type);

	<T> T getClientPropertyValue(Map<String, ?> properties, String key, Class<T> type);

	RxClient<RxCompletionStageInvoker> getRxClient();

}
