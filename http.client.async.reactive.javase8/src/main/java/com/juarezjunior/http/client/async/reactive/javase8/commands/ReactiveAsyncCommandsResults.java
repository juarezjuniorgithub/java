package com.juarezjunior.http.client.async.reactive.javase8.commands;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;

import com.netflix.hystrix.HystrixCommand;

public class ReactiveAsyncCommandsResults<T> {

	protected final HystrixCommand<T> command;

	protected final Future<CompletionStage<T>> futureCompletionStage;

	public ReactiveAsyncCommandsResults(final HystrixCommand<T> command,
			final Future<CompletionStage<T>> completionStage) {
		this.command = command;
		this.futureCompletionStage = completionStage;
	}

	public Future<CompletionStage<T>> getFutureCompletionStage() {
		return futureCompletionStage;
	}

	public java.lang.Throwable getFailedExecutionException() {
		return this.command.getFailedExecutionException();
	}

	public boolean isResponseFromFallback() {
		return this.command.isResponseFromFallback();
	}

	public boolean isCircuitBreakerOpen() {
		return this.command.isCircuitBreakerOpen();

	}

	public boolean isResponseShortCircuited() {
		return this.command.isResponseShortCircuited();
	}

	public boolean isResponseTimedOut() {
		return this.command.isResponseTimedOut();
	}

	public boolean isFailedExecution() {
		return this.command.isFailedExecution();
	}

}
