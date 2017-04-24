package com.juarezjunior.http.client.async.reactive.javase8.api;

import java.net.URI;
import java.util.Map;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.rx.RxClient;
import org.glassfish.jersey.client.rx.RxWebTarget;
import org.glassfish.jersey.client.rx.java8.RxCompletionStageInvoker;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncCommandsResults;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpDeleteCommandClassResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpDeleteCommandGenericTypeResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpDeleteCommandTextResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpDeleteCommandResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpGetCommandClassResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpGetCommandGenericTypeResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpGetCommandResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpGetCommandTextResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpHeadCommandResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpOptionsCommandClassResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpOptionsCommandGenericTypeResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpOptionsCommandResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpOptionsCommandTextResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpPostCommandClassResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpPostCommandGenericTypeResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpPostCommandResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpPostCommandTextResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpPutCommandClassResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpPutCommandGenericTypeResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpPutCommandResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpTraceCommandClassResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpTraceCommandGenericTypeResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpTraceCommandResponse;
import com.juarezjunior.http.client.async.reactive.javase8.commands.ReactiveAsyncHttpTraceCommandTextResponse;
import com.juarezjunior.http.client.async.reactive.javase8.guice.ReactiveAsyncGuiceInjector;
import com.juarezjunior.http.client.async.reactive.javase8.helpers.ReactiveAsyncDispatcher;
import com.juarezjunior.http.client.async.reactive.javase8.hystrix.ReactiveAsyncCommandsHook;
import com.netflix.hystrix.strategy.HystrixPlugins;

@Singleton
public class ReactiveAsyncOrchestrator implements IReactiveAsyncOrchestrator {

	@Inject
	protected static ReactiveAsyncDispatcher dispatcher;

	public ReactiveAsyncOrchestrator() {
		ReactiveAsyncGuiceInjector.injectInstanceVariables(this);
		HystrixPlugins.getInstance().registerCommandExecutionHook(new ReactiveAsyncCommandsHook());
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForClassResponse(final String stringURL,
			final Class<T> responseType, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandClassResponse<T> command = new ReactiveAsyncHttpGetCommandClassResponse<T>(
				stringURL, responseType, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForClassResponse(final Link link,
			final Class<T> responseType, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandClassResponse<T> command = new ReactiveAsyncHttpGetCommandClassResponse<T>(
				link, responseType, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForClassResponse(final URI uri,
			final Class<T> responseType, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandClassResponse<T> command = new ReactiveAsyncHttpGetCommandClassResponse<T>(uri,
				responseType, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForClassResponse(final UriBuilder uriBuilder,
			final Class<T> responseType, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandClassResponse<T> command = new ReactiveAsyncHttpGetCommandClassResponse<T>(
				uriBuilder, responseType, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForClassResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final Class<T> responseType, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandClassResponse<T> command = new ReactiveAsyncHttpGetCommandClassResponse<T>(
				target, responseType, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForGenericTypeResponse(final String stringURL,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpGetCommandGenericTypeResponse<T>(
				stringURL, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForGenericTypeResponse(final Link link,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpGetCommandGenericTypeResponse<T>(
				link, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForGenericTypeResponse(final URI uri,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpGetCommandGenericTypeResponse<T>(
				uri, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForGenericTypeResponse(final UriBuilder uriBuilder,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpGetCommandGenericTypeResponse<T>(
				uriBuilder, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForGenericTypeResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final GenericType<T> type, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpGetCommandGenericTypeResponse<T>(
				target, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForTextResponse(final String stringURL, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandTextResponse<T> command = new ReactiveAsyncHttpGetCommandTextResponse<T>(
				stringURL, timeout);

		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForTextResponse(final Link link, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandTextResponse<T> command = new ReactiveAsyncHttpGetCommandTextResponse<T>(link,
				timeout);

		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForTextResponse(final URI uri, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandTextResponse<T> command = new ReactiveAsyncHttpGetCommandTextResponse<T>(uri,
				timeout);

		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForTextResponse(final UriBuilder uriBuilder,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandTextResponse<T> command = new ReactiveAsyncHttpGetCommandTextResponse<T>(
				uriBuilder, timeout);

		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForTextResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandTextResponse<T> command = new ReactiveAsyncHttpGetCommandTextResponse<T>(
				target, timeout);

		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForResponse(final String stringURL, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandResponse<T> command = new ReactiveAsyncHttpGetCommandResponse<T>(stringURL,
				timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForResponse(final Link link, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandResponse<T> command = new ReactiveAsyncHttpGetCommandResponse<T>(link,
				timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForResponse(final URI uri, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandResponse<T> command = new ReactiveAsyncHttpGetCommandResponse<T>(uri, timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForResponse(final UriBuilder uriBuilder, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandResponse<T> command = new ReactiveAsyncHttpGetCommandResponse<T>(uriBuilder,
				timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpGetRequestForResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpGetCommandResponse<T> command = new ReactiveAsyncHttpGetCommandResponse<T>(target,
				timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForResponse(final String stringURL,
			final Entity<?> entity, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandResponse<T> command = new ReactiveAsyncHttpPostCommandResponse<T>(stringURL,
				entity, timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForResponse(final Link link, final Entity<?> entity,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandResponse<T> command = new ReactiveAsyncHttpPostCommandResponse<T>(link,
				entity, timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForResponse(final URI uri, final Entity<?> entity,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandResponse<T> command = new ReactiveAsyncHttpPostCommandResponse<T>(uri, entity,
				timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForResponse(final UriBuilder uriBuilder,
			final Entity<?> entity, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandResponse<T> command = new ReactiveAsyncHttpPostCommandResponse<T>(uriBuilder,
				entity, timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final Entity<?> entity, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandResponse<T> command = new ReactiveAsyncHttpPostCommandResponse<T>(target,
				entity, timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForClassResponse(final String stringURL,
			final Entity<?> entity, final Class<T> responseTypeClazz, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandClassResponse<T> command = new ReactiveAsyncHttpPostCommandClassResponse<T>(
				stringURL, entity, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForClassResponse(final Link link, final Entity<?> entity,
			final Class<T> responseTypeClazz, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandClassResponse<T> command = new ReactiveAsyncHttpPostCommandClassResponse<T>(
				link, entity, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForClassResponse(final URI uri, final Entity<?> entity,
			final Class<T> responseTypeClazz, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandClassResponse<T> command = new ReactiveAsyncHttpPostCommandClassResponse<T>(
				uri, entity, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForClassResponse(final UriBuilder uriBuilder,
			final Entity<?> entity, final Class<T> responseTypeClazz, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandClassResponse<T> command = new ReactiveAsyncHttpPostCommandClassResponse<T>(
				uriBuilder, entity, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForClassResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final Entity<?> entity,
			final Class<T> responseTypeClazz, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandClassResponse<T> command = new ReactiveAsyncHttpPostCommandClassResponse<T>(
				target, entity, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForGenericTypeResponse(final String stringURL,
			final Entity<?> entity, final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpPostCommandGenericTypeResponse<T>(
				stringURL, entity, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForGenericTypeResponse(final Link link,
			final Entity<?> entity, final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpPostCommandGenericTypeResponse<T>(
				link, entity, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForGenericTypeResponse(final URI uri,
			final Entity<?> entity, final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpPostCommandGenericTypeResponse<T>(
				uri, entity, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForGenericTypeResponse(final UriBuilder uriBuilder,
			final Entity<?> entity, final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpPostCommandGenericTypeResponse<T>(
				uriBuilder, entity, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForGenericTypeResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final Entity<?> entity, final GenericType<T> type,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpPostCommandGenericTypeResponse<T>(
				target, entity, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForTextResponse(final String stringURL,
			final Entity<?> entity, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandTextResponse<T> command = new ReactiveAsyncHttpPostCommandTextResponse<T>(
				stringURL, entity, timeout);
		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForTextResponse(final Link link, final Entity<?> entity,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandTextResponse<T> command = new ReactiveAsyncHttpPostCommandTextResponse<T>(
				link, entity, timeout);
		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForTextResponse(final URI uri, final Entity<?> entity,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandTextResponse<T> command = new ReactiveAsyncHttpPostCommandTextResponse<T>(uri,
				entity, timeout);
		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForTextResponse(final UriBuilder uriBuilder,
			final Entity<?> entity, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandTextResponse<T> command = new ReactiveAsyncHttpPostCommandTextResponse<T>(
				uriBuilder, entity, timeout);
		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPostRequestForTextResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final Entity<?> entity, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpPostCommandTextResponse<T> command = new ReactiveAsyncHttpPostCommandTextResponse<T>(
				target, entity, timeout);
		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForResponse(final String stringURL, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandResponse<T> command = new ReactiveAsyncHttpDeleteCommandResponse<T>(
				stringURL, timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForResponse(final Link link, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandResponse<T> command = new ReactiveAsyncHttpDeleteCommandResponse<T>(
				link, timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForResponse(final URI uri, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandResponse<T> command = new ReactiveAsyncHttpDeleteCommandResponse<T>(
				uri, timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForResponse(final UriBuilder uriBuilder,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandResponse<T> command = new ReactiveAsyncHttpDeleteCommandResponse<T>(
				uriBuilder, timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandResponse<T> command = new ReactiveAsyncHttpDeleteCommandResponse<T>(
				target, timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForClassResponse(final String stringURL,
			final Class<T> responseTypeClazz, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandClassResponse<T> command = new ReactiveAsyncHttpDeleteCommandClassResponse<T>(
				stringURL, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForClassResponse(final Link link,
			final Class<T> responseTypeClazz, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandClassResponse<T> command = new ReactiveAsyncHttpDeleteCommandClassResponse<T>(
				link, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForClassResponse(final URI uri,
			final Class<T> responseTypeClazz, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandClassResponse<T> command = new ReactiveAsyncHttpDeleteCommandClassResponse<T>(
				uri, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForClassResponse(final UriBuilder uriBuilder,
			final Class<T> responseTypeClazz, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandClassResponse<T> command = new ReactiveAsyncHttpDeleteCommandClassResponse<T>(
				uriBuilder, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForClassResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final Class<T> responseTypeClazz, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandClassResponse<T> command = new ReactiveAsyncHttpDeleteCommandClassResponse<T>(
				target, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForGenericTypeResponse(final String stringURL,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpDeleteCommandGenericTypeResponse<T>(
				stringURL, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForGenericTypeResponse(final Link link,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpDeleteCommandGenericTypeResponse<T>(
				link, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForGenericTypeResponse(final URI uri,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpDeleteCommandGenericTypeResponse<T>(
				uri, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForGenericTypeResponse(final UriBuilder uriBuilder,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpDeleteCommandGenericTypeResponse<T>(
				uriBuilder, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForGenericTypeResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final GenericType<T> type, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpDeleteCommandGenericTypeResponse<T>(
				target, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForTextResponse(final String stringURL,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandTextResponse<T> command = new ReactiveAsyncHttpDeleteCommandTextResponse<T>(
				stringURL, timeout);

		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForTextResponse(final Link link, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandTextResponse<T> command = new ReactiveAsyncHttpDeleteCommandTextResponse<T>(
				link, timeout);

		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForTextResponse(final URI uri, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandTextResponse<T> command = new ReactiveAsyncHttpDeleteCommandTextResponse<T>(
				uri, timeout);

		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForTextResponse(final UriBuilder uriBuilder,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandTextResponse<T> command = new ReactiveAsyncHttpDeleteCommandTextResponse<T>(
				uriBuilder, timeout);

		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpDeleteRequestForTextResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpDeleteCommandTextResponse<T> command = new ReactiveAsyncHttpDeleteCommandTextResponse<T>(
				target, timeout);

		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForResponse(final String stringURL, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandResponse<T> command = new ReactiveAsyncHttpOptionsCommandResponse<T>(
				stringURL, timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForResponse(final Link link, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandResponse<T> command = new ReactiveAsyncHttpOptionsCommandResponse<T>(link,
				timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForResponse(final URI uri, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandResponse<T> command = new ReactiveAsyncHttpOptionsCommandResponse<T>(uri,
				timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForResponse(final UriBuilder uriBuilder,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandResponse<T> command = new ReactiveAsyncHttpOptionsCommandResponse<T>(
				uriBuilder, timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandResponse<T> command = new ReactiveAsyncHttpOptionsCommandResponse<T>(
				target, timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForClassResponse(final String stringURL,
			final Class<T> responseTypeClazz, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandClassResponse<T> command = new ReactiveAsyncHttpOptionsCommandClassResponse<T>(
				stringURL, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForClassResponse(final Link link,
			final Class<T> responseTypeClazz, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandClassResponse<T> command = new ReactiveAsyncHttpOptionsCommandClassResponse<T>(
				link, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForClassResponse(final URI uri,
			final Class<T> responseTypeClazz, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandClassResponse<T> command = new ReactiveAsyncHttpOptionsCommandClassResponse<T>(
				uri, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForClassResponse(final UriBuilder uriBuilder,
			final Class<T> responseTypeClazz, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandClassResponse<T> command = new ReactiveAsyncHttpOptionsCommandClassResponse<T>(
				uriBuilder, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForClassResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final Class<T> responseTypeClazz, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandClassResponse<T> command = new ReactiveAsyncHttpOptionsCommandClassResponse<T>(
				target, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForGenericTypeResponse(final String stringURL,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpOptionsCommandGenericTypeResponse<T>(
				stringURL, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForGenericTypeResponse(final Link link,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpOptionsCommandGenericTypeResponse<T>(
				link, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForGenericTypeResponse(final URI uri,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpOptionsCommandGenericTypeResponse<T>(
				uri, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForGenericTypeResponse(final UriBuilder uriBuilder,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpOptionsCommandGenericTypeResponse<T>(
				uriBuilder, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForGenericTypeResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final GenericType<T> type, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpOptionsCommandGenericTypeResponse<T>(
				target, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForTextResponse(final String stringURL,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandTextResponse<T> command = new ReactiveAsyncHttpOptionsCommandTextResponse<T>(
				stringURL, timeout);

		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForTextResponse(final Link link, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandTextResponse<T> command = new ReactiveAsyncHttpOptionsCommandTextResponse<T>(
				link, timeout);

		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForTextResponse(final URI uri, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandTextResponse<T> command = new ReactiveAsyncHttpOptionsCommandTextResponse<T>(
				uri, timeout);

		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForTextResponse(final UriBuilder uriBuilder,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandTextResponse<T> command = new ReactiveAsyncHttpOptionsCommandTextResponse<T>(
				uriBuilder, timeout);

		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpOptionsRequestForTextResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpOptionsCommandTextResponse<T> command = new ReactiveAsyncHttpOptionsCommandTextResponse<T>(
				target, timeout);

		final Future<CompletionStage<String>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForResponse(final String stringURL, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandResponse<T> command = new ReactiveAsyncHttpTraceCommandResponse<T>(stringURL,
				timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForResponse(final Link link, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandResponse<T> command = new ReactiveAsyncHttpTraceCommandResponse<T>(link,
				timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForResponse(final URI uri, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandResponse<T> command = new ReactiveAsyncHttpTraceCommandResponse<T>(uri,
				timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForResponse(final UriBuilder uriBuilder,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandResponse<T> command = new ReactiveAsyncHttpTraceCommandResponse<T>(
				uriBuilder, timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandResponse<T> command = new ReactiveAsyncHttpTraceCommandResponse<T>(target,
				timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForClassResponse(final String stringURL,
			final Class<T> responseTypeClazz, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandClassResponse<T> command = new ReactiveAsyncHttpTraceCommandClassResponse<T>(
				stringURL, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForClassResponse(final Link link,
			final Class<T> responseTypeClazz, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandClassResponse<T> command = new ReactiveAsyncHttpTraceCommandClassResponse<T>(
				link, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForClassResponse(final URI uri,
			final Class<T> responseTypeClazz, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandClassResponse<T> command = new ReactiveAsyncHttpTraceCommandClassResponse<T>(
				uri, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForClassResponse(final UriBuilder uriBuilder,
			final Class<T> responseTypeClazz, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandClassResponse<T> command = new ReactiveAsyncHttpTraceCommandClassResponse<T>(
				uriBuilder, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForClassResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final Class<T> responseTypeClazz, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandClassResponse<T> command = new ReactiveAsyncHttpTraceCommandClassResponse<T>(
				target, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForGenericTypeResponse(final String stringURL,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpTraceCommandGenericTypeResponse<T>(
				stringURL, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForGenericTypeResponse(final Link link,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpTraceCommandGenericTypeResponse<T>(
				link, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForGenericTypeResponse(final URI uri,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpTraceCommandGenericTypeResponse<T>(
				uri, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForGenericTypeResponse(final UriBuilder uriBuilder,
			final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpTraceCommandGenericTypeResponse<T>(
				uriBuilder, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForGenericTypeResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final GenericType<T> type, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpTraceCommandGenericTypeResponse<T>(
				target, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForTextResponse(final String stringURL,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandTextResponse<T> command = new ReactiveAsyncHttpTraceCommandTextResponse<T>(
				stringURL, timeout);

		final Future<CompletionStage<String>> future = command.queue();
		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);

		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForTextResponse(final Link link, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandTextResponse<T> command = new ReactiveAsyncHttpTraceCommandTextResponse<T>(
				link, timeout);

		final Future<CompletionStage<String>> future = command.queue();
		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);

		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForTextResponse(final URI uri, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandTextResponse<T> command = new ReactiveAsyncHttpTraceCommandTextResponse<T>(
				uri, timeout);

		final Future<CompletionStage<String>> future = command.queue();
		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);

		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForTextResponse(final UriBuilder uriBuilder,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandTextResponse<T> command = new ReactiveAsyncHttpTraceCommandTextResponse<T>(
				uriBuilder, timeout);

		final Future<CompletionStage<String>> future = command.queue();
		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);

		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpTraceRequestForTextResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpTraceCommandTextResponse<T> command = new ReactiveAsyncHttpTraceCommandTextResponse<T>(
				target, timeout);

		final Future<CompletionStage<String>> future = command.queue();
		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);

		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpHeadRequestForResponse(final String stringURL, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpHeadCommandResponse<T> command = new ReactiveAsyncHttpHeadCommandResponse<T>(stringURL,
				timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpHeadRequestForResponse(final Link link, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpHeadCommandResponse<T> command = new ReactiveAsyncHttpHeadCommandResponse<T>(link,
				timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpHeadRequestForResponse(final URI uri, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpHeadCommandResponse<T> command = new ReactiveAsyncHttpHeadCommandResponse<T>(uri,
				timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpHeadRequestForResponse(final UriBuilder uriBuilder,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpHeadCommandResponse<T> command = new ReactiveAsyncHttpHeadCommandResponse<T>(uriBuilder,
				timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpHeadRequestForResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpHeadCommandResponse<T> command = new ReactiveAsyncHttpHeadCommandResponse<T>(target,
				timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPutRequestForResponse(final String stringURL, final Entity<?> entity,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPutCommandResponse<T> command = new ReactiveAsyncHttpPutCommandResponse<T>(stringURL,
				entity, timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPutRequestForResponse(final Link link, final Entity<?> entity,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPutCommandResponse<T> command = new ReactiveAsyncHttpPutCommandResponse<T>(link, entity,
				timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPutRequestForResponse(final URI uri, final Entity<?> entity,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPutCommandResponse<T> command = new ReactiveAsyncHttpPutCommandResponse<T>(uri, entity,
				timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPutRequestForResponse(final UriBuilder uriBuilder,
			final Entity<?> entity, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPutCommandResponse<T> command = new ReactiveAsyncHttpPutCommandResponse<T>(uriBuilder,
				entity, timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPutRequestForResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final Entity<?> entity, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpPutCommandResponse<T> command = new ReactiveAsyncHttpPutCommandResponse<T>(target,
				entity, timeout);

		final Future<CompletionStage<Response>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPutRequestForClassResponse(final String stringURL,
			final Entity<?> entity, final Class<T> responseTypeClazz, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpPutCommandClassResponse<T> command = new ReactiveAsyncHttpPutCommandClassResponse<T>(
				stringURL, entity, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPutRequestForClassResponse(final Link link, final Entity<?> entity,
			final Class<T> responseTypeClazz, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPutCommandClassResponse<T> command = new ReactiveAsyncHttpPutCommandClassResponse<T>(
				link, entity, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPutRequestForClassResponse(final URI uri, final Entity<?> entity,
			final Class<T> responseTypeClazz, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPutCommandClassResponse<T> command = new ReactiveAsyncHttpPutCommandClassResponse<T>(uri,
				entity, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPutRequestForClassResponse(final UriBuilder uriBuilder,
			final Entity<?> entity, final Class<T> responseTypeClazz, final int timeout,
			Object... additionalProperties) {

		final ReactiveAsyncHttpPutCommandClassResponse<T> command = new ReactiveAsyncHttpPutCommandClassResponse<T>(
				uriBuilder, entity, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPutRequestForClassResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final Entity<?> entity,
			final Class<T> responseTypeClazz, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPutCommandClassResponse<T> command = new ReactiveAsyncHttpPutCommandClassResponse<T>(
				target, entity, responseTypeClazz, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPutRequestForGenericTypeResponse(final String stringURL,
			final Entity<?> entity, final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPutCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpPutCommandGenericTypeResponse<T>(
				stringURL, entity, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPutRequestForGenericTypeResponse(final Link link,
			final Entity<?> entity, final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPutCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpPutCommandGenericTypeResponse<T>(
				link, entity, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPutRequestForGenericTypeResponse(final URI uri,
			final Entity<?> entity, final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPutCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpPutCommandGenericTypeResponse<T>(
				uri, entity, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPutRequestForGenericTypeResponse(final UriBuilder uriBuilder,
			final Entity<?> entity, final GenericType<T> type, final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPutCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpPutCommandGenericTypeResponse<T>(
				uriBuilder, entity, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> ReactiveAsyncCommandsResults<T> httpPutRequestForGenericTypeResponse(
			final RxWebTarget<RxCompletionStageInvoker> target, final Entity<?> entity, final GenericType<T> type,
			final int timeout, Object... additionalProperties) {

		final ReactiveAsyncHttpPutCommandGenericTypeResponse<T> command = new ReactiveAsyncHttpPutCommandGenericTypeResponse<T>(
				target, entity, type, timeout);

		final Future<CompletionStage<T>> future = command.queue();

		@SuppressWarnings("rawtypes")
		final ReactiveAsyncCommandsResults result = new ReactiveAsyncCommandsResults(command, future);
		return result;

	}

	@Override
	public <T> T getClientPropertyValue(final Map<String, ?> properties, final String key, final T defaultValue) {

		return dispatcher.getValue(properties, key, defaultValue);

	}

	@Override
	public <T> T getClientPropertyValue(final Map<String, ?> properties, final String key, final T defaultValue,
			final Class<T> type) {

		return dispatcher.getValue(properties, key, defaultValue);

	}

	@Override
	public <T> T getClientPropertyValue(final Map<String, ?> properties, final String key, final Class<T> type) {

		return dispatcher.getValue(properties, key, type);

	}

	public RxClient<RxCompletionStageInvoker> getRxClient() {
		return dispatcher.getRxClient();
	}

}
