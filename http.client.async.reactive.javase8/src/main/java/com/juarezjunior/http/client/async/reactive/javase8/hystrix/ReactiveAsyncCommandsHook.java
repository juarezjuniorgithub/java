package com.juarezjunior.http.client.async.reactive.javase8.hystrix;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.juarezjunior.http.client.async.reactive.javase8.helpers.ReactiveAsyncCommandsEnum;
import com.juarezjunior.http.client.async.reactive.javase8.helpers.ReactiveAsyncHelper;
import com.juarezjunior.http.client.async.reactive.javase8.helpers.ReactiveAsyncLogVO;
import com.netflix.hystrix.HystrixInvokable;
import com.netflix.hystrix.strategy.executionhook.HystrixCommandExecutionHook;

public class ReactiveAsyncCommandsHook extends HystrixCommandExecutionHook {

	private static Logger LOGGER = LoggerFactory.getLogger(ReactiveAsyncCommandsHook.class);

	public <T> void onExecutionStart(final HystrixInvokable<T> commandInstance) {

		final ReactiveAsyncLogVO loggingData = new ReactiveAsyncLogVO(commandInstance.getClass().getName(),
				ReactiveAsyncHelper.getUniqueTransactionId(commandInstance),
				ReactiveAsyncCommandsEnum.EXECUTION_STARTED.value(), LocalDateTime.now().toString());
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug(loggingData.toString());
		}

	}

	public <T> void onExecutionSuccess(final HystrixInvokable<T> commandInstance) {

		final ReactiveAsyncLogVO loggingData = new ReactiveAsyncLogVO(commandInstance.getClass().getName(),
				ReactiveAsyncHelper.getUniqueTransactionId(commandInstance),
				ReactiveAsyncCommandsEnum.EXECUTION_FINISHED.value(), LocalDateTime.now().toString());
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug(loggingData.toString());
		}

	}

	public <T> java.lang.Exception onExecutionError(final HystrixInvokable<T> commandInstance,
			final java.lang.Exception e) {

		final ReactiveAsyncLogVO loggingData = new ReactiveAsyncLogVO(commandInstance.getClass().getName(),
				ReactiveAsyncHelper.getUniqueTransactionId(commandInstance),
				ReactiveAsyncCommandsEnum.EXECUTION_ERROR.value(), LocalDateTime.now().toString());
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug(loggingData.toString());
		}
		return e;

	}

	public <T> void onFallbackSuccess(final HystrixInvokable<T> commandInstance) {

		final ReactiveAsyncLogVO loggingData = new ReactiveAsyncLogVO(commandInstance.getClass().getName(),
				ReactiveAsyncHelper.getUniqueTransactionId(commandInstance),
				ReactiveAsyncCommandsEnum.EXECUTION_CANCELLED.value(), LocalDateTime.now().toString());
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug(loggingData.toString());
		}

	}

}
