package com.juarezjunior.http.client.async.reactive.javase8.helpers;

import java.net.URI;
import java.util.Map;
import java.util.concurrent.CompletionStage;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.rx.RxClient;
import org.glassfish.jersey.client.rx.RxWebTarget;
import org.glassfish.jersey.client.rx.java8.RxCompletionStageInvoker;

public interface IReactiveAsyncHttpRequestDispatcher {

	<T> CompletionStage<T> getRequestForTypedResponse(String stringURL, Class<T> responseType,
			Object... additionalProperties);

	<T> CompletionStage<T> getRequestForTypedResponse(Link link, Class<T> responseType, Object... additionalProperties);

	<T> CompletionStage<T> getRequestForTypedResponse(URI uri, Class<T> responseType, Object... additionalProperties);

	<T> CompletionStage<T> getRequestForTypedResponse(UriBuilder uriBuilder, Class<T> responseType,
			Object... additionalProperties);

	<T> CompletionStage<T> getRequestForTypedResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Class<T> responseType, Object... additionalProperties);

	<T> CompletionStage<T> getRequestForGenericTypedResponse(String stringURL, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> getRequestForGenericTypedResponse(Link link, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> getRequestForGenericTypedResponse(URI uri, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> getRequestForGenericTypedResponse(UriBuilder uriBuilder, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> getRequestForGenericTypedResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			GenericType<T> type, Object... additionalProperties);

	CompletionStage<String> getRequestForTextResponse(String stringURL, Object... additionalProperties);

	CompletionStage<String> getRequestForTextResponse(Link link, Object... additionalProperties);

	CompletionStage<String> getRequestForTextResponse(URI uri, Object... additionalProperties);

	CompletionStage<String> getRequestForTextResponse(UriBuilder uriBuilder, Object... additionalProperties);

	CompletionStage<String> getRequestForTextResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Object... additionalProperties);

	CompletionStage<Response> getRequestForResponse(String stringURL, Object... additionalProperties);

	CompletionStage<Response> getRequestForResponse(Link link, Object... additionalProperties);

	CompletionStage<Response> getRequestForResponse(URI uri, Object... additionalProperties);

	CompletionStage<Response> getRequestForResponse(UriBuilder uriBuilder, Object... additionalProperties);

	CompletionStage<Response> getRequestForResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Object... additionalProperties);

	CompletionStage<Response> postRequestForResponse(String stringURL, Entity<?> entity,
			Object... additionalProperties);

	CompletionStage<Response> postRequestForResponse(Link link, Entity<?> entity, Object... additionalProperties);

	CompletionStage<Response> postRequestForResponse(URI uri, Entity<?> entity, Object... additionalProperties);

	CompletionStage<Response> postRequestForResponse(UriBuilder uriBuilder, Entity<?> entity,
			Object... additionalProperties);

	CompletionStage<Response> postRequestForResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Entity<?> entity, Object... additionalProperties);

	<T> CompletionStage<T> postRequestForTypedResponse(String stringURL, Entity<?> entity, Class<T> responseTypeClazz,
			Object... additionalProperties);

	<T> CompletionStage<T> postRequestForTypedResponse(Link link, Entity<?> entity, Class<T> responseTypeClazz,
			Object... additionalProperties);

	<T> CompletionStage<T> postRequestForTypedResponse(URI uri, Entity<?> entity, Class<T> responseTypeClazz,
			Object... additionalProperties);

	<T> CompletionStage<T> postRequestForTypedResponse(UriBuilder uriBuilder, Entity<?> entity,
			Class<T> responseTypeClazz, Object... additionalProperties);

	<T> CompletionStage<T> postRequestForTypedResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Entity<?> entity, Class<T> responseTypeClazz, Object... additionalProperties);

	<T> CompletionStage<T> postRequestForGenericTypedResponse(String stringURL, Entity<?> entity, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> postRequestForGenericTypedResponse(Link link, Entity<?> entity, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> postRequestForGenericTypedResponse(URI uri, Entity<?> entity, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> postRequestForGenericTypedResponse(UriBuilder uriBuilder, Entity<?> entity,
			GenericType<T> type, Object... additionalProperties);

	<T> CompletionStage<T> postRequestForGenericTypedResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Entity<?> entity, GenericType<T> type, Object... additionalProperties);

	CompletionStage<String> postRequestForTextResponse(String stringURL, Entity<?> entity,
			Object... additionalProperties);

	CompletionStage<String> postRequestForTextResponse(Link link, Entity<?> entity, Object... additionalProperties);

	CompletionStage<String> postRequestForTextResponse(URI uri, Entity<?> entity, Object... additionalProperties);

	CompletionStage<String> postRequestForTextResponse(UriBuilder uriBuilder, Entity<?> entity,
			Object... additionalProperties);

	CompletionStage<String> postRequestForTextResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Entity<?> entity, Object... additionalProperties);

	CompletionStage<Response> deleteRequestForResponse(String stringURL, Object... additionalProperties);

	CompletionStage<Response> deleteRequestForResponse(Link link, Object... additionalProperties);

	CompletionStage<Response> deleteRequestForResponse(URI uri, Object... additionalProperties);

	CompletionStage<Response> deleteRequestForResponse(UriBuilder uriBuilder, Object... additionalProperties);

	CompletionStage<Response> deleteRequestForResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Object... additionalProperties);

	<T> CompletionStage<T> deleteRequestForTypedResponse(String stringURL, Class<T> responseTypeClazz,
			Object... additionalProperties);

	<T> CompletionStage<T> deleteRequestForTypedResponse(Link link, Class<T> responseTypeClazz,
			Object... additionalProperties);

	<T> CompletionStage<T> deleteRequestForTypedResponse(URI uri, Class<T> responseTypeClazz,
			Object... additionalProperties);

	<T> CompletionStage<T> deleteRequestForTypedResponse(UriBuilder uriBuilder, Class<T> responseTypeClazz,
			Object... additionalProperties);

	<T> CompletionStage<T> deleteRequestForTypedResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Class<T> responseTypeClazz, Object... additionalProperties);

	<T> CompletionStage<T> deleteRequestForGenericTypedResponse(String stringURL, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> deleteRequestForGenericTypedResponse(Link link, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> deleteRequestForGenericTypedResponse(URI uri, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> deleteRequestForGenericTypedResponse(UriBuilder uriBuilder, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> deleteRequestForGenericTypedResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			GenericType<T> type, Object... additionalProperties);

	CompletionStage<String> deleteRequestForTextResponse(String stringURL, Object... additionalProperties);

	CompletionStage<String> deleteRequestForTextResponse(Link link, Object... additionalProperties);

	CompletionStage<String> deleteRequestForTextResponse(URI uri, Object... additionalProperties);

	CompletionStage<String> deleteRequestForTextResponse(UriBuilder uriBuilder, Object... additionalProperties);

	CompletionStage<String> deleteRequestForTextResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Object... additionalProperties);

	CompletionStage<Response> optionsRequestForResponse(String stringURL, Object... additionalProperties);

	CompletionStage<Response> optionsRequestForResponse(Link link, Object... additionalProperties);

	CompletionStage<Response> optionsRequestForResponse(URI uri, Object... additionalProperties);

	CompletionStage<Response> optionsRequestForResponse(UriBuilder uriBuilder, Object... additionalProperties);

	CompletionStage<Response> optionsRequestForResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Object... additionalProperties);

	<T> CompletionStage<T> optionsRequestForTypedResponse(String stringURL, Class<T> responseTypeClazz,
			Object... additionalProperties);

	<T> CompletionStage<T> optionsRequestForTypedResponse(Link link, Class<T> responseTypeClazz,
			Object... additionalProperties);

	<T> CompletionStage<T> optionsRequestForTypedResponse(URI uri, Class<T> responseTypeClazz,
			Object... additionalProperties);

	<T> CompletionStage<T> optionsRequestForTypedResponse(UriBuilder uriBuilder, Class<T> responseTypeClazz,
			Object... additionalProperties);

	<T> CompletionStage<T> optionsRequestForTypedResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Class<T> responseTypeClazz, Object... additionalProperties);

	<T> CompletionStage<T> optionsRequestForGenericTypedResponse(String stringURL, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> optionsRequestForGenericTypedResponse(Link link, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> optionsRequestForGenericTypedResponse(URI uri, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> optionsRequestForGenericTypedResponse(UriBuilder uriBuilder, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> optionsRequestForGenericTypedResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			GenericType<T> type, Object... additionalProperties);

	CompletionStage<String> optionsRequestForTextResponse(String stringURL, Object... additionalProperties);

	CompletionStage<String> optionsRequestForTextResponse(Link link, Object... additionalProperties);

	CompletionStage<String> optionsRequestForTextResponse(URI uri, Object... additionalProperties);

	CompletionStage<String> optionsRequestForTextResponse(UriBuilder uriBuilder, Object... additionalProperties);

	CompletionStage<String> optionsRequestForTextResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Object... additionalProperties);

	CompletionStage<Response> traceRequestForResponse(String stringURL, Object... additionalProperties);

	CompletionStage<Response> traceRequestForResponse(Link link, Object... additionalProperties);

	CompletionStage<Response> traceRequestForResponse(URI uri, Object... additionalProperties);

	CompletionStage<Response> traceRequestForResponse(UriBuilder uriBuilder, Object... additionalProperties);

	CompletionStage<Response> traceRequestForResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Object... additionalProperties);

	<T> CompletionStage<T> traceRequestForTypedResponse(String stringURL, Class<T> responseTypeClazz,
			Object... additionalProperties);

	<T> CompletionStage<T> traceRequestForTypedResponse(Link link, Class<T> responseTypeClazz,
			Object... additionalProperties);

	<T> CompletionStage<T> traceRequestForTypedResponse(URI uri, Class<T> responseTypeClazz,
			Object... additionalProperties);

	<T> CompletionStage<T> traceRequestForTypedResponse(UriBuilder uriBuilder, Class<T> responseTypeClazz,
			Object... additionalProperties);

	<T> CompletionStage<T> traceRequestForTypedResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Class<T> responseTypeClazz, Object... additionalProperties);

	<T> CompletionStage<T> traceRequestForGenericTypedResponse(String stringURL, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> traceRequestForGenericTypedResponse(Link link, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> traceRequestForGenericTypedResponse(URI uri, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> traceRequestForGenericTypedResponse(UriBuilder uriBuilder, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> traceRequestForGenericTypedResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			GenericType<T> type, Object... additionalProperties);

	CompletionStage<String> traceRequestForTextResponse(String stringURL, Object... additionalProperties);

	CompletionStage<String> traceRequestForTextResponse(Link link, Object... additionalProperties);

	CompletionStage<String> traceRequestForTextResponse(URI uri, Object... additionalProperties);

	CompletionStage<String> traceRequestForTextResponse(UriBuilder uriBuilder, Object... additionalProperties);

	CompletionStage<String> traceRequestForTextResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Object... additionalProperties);

	CompletionStage<Response> headRequestForResponse(String stringURL, Object... additionalProperties);

	CompletionStage<Response> headRequestForResponse(Link link, Object... additionalProperties);

	CompletionStage<Response> headRequestForResponse(URI uri, Object... additionalProperties);

	CompletionStage<Response> headRequestForResponse(UriBuilder uriBuilder, Object... additionalProperties);

	CompletionStage<Response> headRequestForResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Object... additionalProperties);

	CompletionStage<Response> putRequestForResponse(String stringURL, Entity<?> entity, Object... additionalProperties);

	CompletionStage<Response> putRequestForResponse(Link link, Entity<?> entity, Object... additionalProperties);

	CompletionStage<Response> putRequestForResponse(URI uri, Entity<?> entity, Object... additionalProperties);

	CompletionStage<Response> putRequestForResponse(UriBuilder uriBuilder, Entity<?> entity,
			Object... additionalProperties);

	CompletionStage<Response> putRequestForResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget, Entity<?> entity,
			Object... additionalProperties);

	<T> CompletionStage<T> putRequestForTypedResponse(String stringURL, Entity<?> entity, Class<T> responseTypeClazz,
			Object... additionalProperties);

	<T> CompletionStage<T> putRequestForTypedResponse(Link link, Entity<?> entity, Class<T> responseTypeClazz,
			Object... additionalProperties);

	<T> CompletionStage<T> putRequestForTypedResponse(URI uri, Entity<?> entity, Class<T> responseTypeClazz,
			Object... additionalProperties);

	<T> CompletionStage<T> putRequestForTypedResponse(UriBuilder uriBuilder, Entity<?> entity,
			Class<T> responseTypeClazz, Object... additionalProperties);

	<T> CompletionStage<T> putRequestForTypedResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Entity<?> entity, Class<T> responseTypeClazz, Object... additionalProperties);

	<T> CompletionStage<T> putRequestForGenericTypedResponse(String stringURL, Entity<?> entity, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> putRequestForGenericTypedResponse(Link link, Entity<?> entity, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> putRequestForGenericTypedResponse(URI uri, Entity<?> entity, GenericType<T> type,
			Object... additionalProperties);

	<T> CompletionStage<T> putRequestForGenericTypedResponse(UriBuilder uriBuilder, Entity<?> entity,
			GenericType<T> type, Object... additionalProperties);

	<T> CompletionStage<T> putRequestForGenericTypedResponse(RxWebTarget<RxCompletionStageInvoker> rxWebTarget,
			Entity<?> entity, GenericType<T> type, Object... additionalProperties);

	<T> T getValue(Map<String, ?> properties, String key, T defaultValue);

	<T> T getValue(Map<String, ?> properties, String key, T defaultValue, Class<T> type);

	<T> T getValue(Map<String, ?> properties, String key, Class<T> type);

	RxClient<RxCompletionStageInvoker> getRxClient();
}
