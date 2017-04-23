package com.juarezjunior.http.client.async.reactive.javase8.helpers;

import java.net.URI;
import java.util.Locale;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.rx.RxInvocationBuilder;
import org.glassfish.jersey.client.rx.java8.RxCompletionStageInvoker;

import com.juarezjunior.http.client.async.reactive.javase8.hystrix.ReactiveAsyncHystrixException;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixInvokable;
import com.netflix.hystrix.HystrixObservableCommand;

public class ReactiveAsyncHelper {

	private ReactiveAsyncHelper() {
		super();
	}

	public static boolean checkIntegerValue(final Object value) {
		boolean result = true;
		if (!(value instanceof java.lang.Integer)) {
			result = false;
		}
		return result;
	}

	public static boolean checkBooleanValue(final Object value) {
		boolean result = true;
		if (!(value instanceof java.lang.Boolean)) {
			result = false;
		}
		return result;
	}

	public static boolean checkStringValue(final Object value) {
		boolean result = true;
		if (!(value instanceof java.lang.Boolean)) {
			result = false;
		}
		return result;
	}

	public static <T> String getUniqueTransactionId(final HystrixInvokable<T> commandInstance) {

		long transactionId = -1;
		if (commandInstance instanceof HystrixObservableCommand) {
			final HystrixObservableCommand<T> command = (HystrixObservableCommand<T>) commandInstance;
			transactionId = command.getCommandRunStartTimeInNanos();
		} else if (commandInstance instanceof HystrixCommand) {
			final HystrixCommand<T> command = (HystrixCommand<T>) commandInstance;
			transactionId = command.getCommandRunStartTimeInNanos();
		}

		final String commandName = commandInstance.getClass().getName();
		final StringBuilder uniqueTransactionRequestID = new StringBuilder(
				commandName.substring(commandName.lastIndexOf('.'), commandName.length()))
						.append(ReactiveAsyncUtilsEnum.UNDERSCORE.value()).append(transactionId);

		return uniqueTransactionRequestID.toString();

	}

	public static void checkStringUrl(final String stringValue) {
		if (stringValue == null || stringValue.equals(ReactiveAsyncUtilsEnum.EMPTY_STRING.value())) {
			throw new ReactiveAsyncHystrixException(
					ReactiveAsyncUtilsEnum.STRING_URL_ARGUMENT_VALUE_NULL_OR_EMPTY.value());
		}
	}

	public static void checkLink(final Link linkTarget) {
		if (linkTarget == null) {
			throw new ReactiveAsyncHystrixException(ReactiveAsyncUtilsEnum.LINK_ARGUMENT_VALUE_NULL.value());
		}
	}

	public static void checkWebTarget(final WebTarget webTarget) {
		if (webTarget == null) {
			throw new ReactiveAsyncHystrixException(ReactiveAsyncUtilsEnum.WEBTARGET_ARGUMENT_VALUE_NULL.value());
		}
	}

	public static void checkUriBuilder(final UriBuilder uriBuilderTarget) {
		if (uriBuilderTarget == null) {
			throw new ReactiveAsyncHystrixException(ReactiveAsyncUtilsEnum.URIBUILDER_ARGUMENT_VALUE_NULL.value());
		}
	}

	public static void checkUri(final URI uri) {
		if (uri == null) {
			throw new ReactiveAsyncHystrixException(ReactiveAsyncUtilsEnum.URI_ARGUMENT_VALUE_NULL.value());
		}
	}

	public static void checkClass(final Class<?> clazzType) {
		if (clazzType == null) {
			throw new ReactiveAsyncHystrixException(ReactiveAsyncUtilsEnum.CLASS_ARGUMENT_VALUE_NULL.value());
		}
	}

	public static void checkGenericType(final GenericType<?> genericType) {
		if (genericType == null) {
			throw new ReactiveAsyncHystrixException(ReactiveAsyncUtilsEnum.GENERICTYPE_ARGUMENT_VALUE_NULL.value());
		}
	}

	public static void checkEntity(final Entity<?> entity) {
		if (entity == null) {
			throw new ReactiveAsyncHystrixException(ReactiveAsyncUtilsEnum.ENTITY_ARGUMENT_VALUE_NULL.value());
		}
	}

	public static void validateTargetUrlTypeString(final String stringTarget, final GenericType<?> genericType,
			final Entity<?> entity) {

		ReactiveAsyncHelper.checkStringUrl(stringTarget);
		ReactiveAsyncHelper.checkEntity(entity);
		ReactiveAsyncHelper.checkGenericType(genericType);

	}

	public static void validateTargetUrlTypeString(final String stringTarget, final Class<?> clazzType,
			final Entity<?> entity) {

		ReactiveAsyncHelper.checkStringUrl(stringTarget);
		ReactiveAsyncHelper.checkClass(clazzType);
		ReactiveAsyncHelper.checkEntity(entity);

	}

	public static void validateTargetUrlTypeString(final String stringTarget, final Class<?> clazzType) {

		ReactiveAsyncHelper.checkStringUrl(stringTarget);
		ReactiveAsyncHelper.checkClass(clazzType);

	}

	public static void validateTargetUrlTypeString(final String stringTarget, final Entity<?> entity) {

		ReactiveAsyncHelper.checkStringUrl(stringTarget);
		ReactiveAsyncHelper.checkEntity(entity);

	}

	public static void validateTargetUrlTypeString(final String stringTarget, final GenericType<?> genericType) {

		ReactiveAsyncHelper.checkStringUrl(stringTarget);
		ReactiveAsyncHelper.checkGenericType(genericType);

	}

	public static void validateUrlTypeLink(final Link linkTarget, final Class<?> clazzType, final Entity<?> entity) {

		ReactiveAsyncHelper.checkLink(linkTarget);
		ReactiveAsyncHelper.checkClass(clazzType);
		ReactiveAsyncHelper.checkEntity(entity);

	}

	public static void validateUrlTypeLink(final Link linkTarget, final GenericType<?> genericType,
			final Entity<?> entity) {

		ReactiveAsyncHelper.checkLink(linkTarget);
		ReactiveAsyncHelper.checkEntity(entity);
		ReactiveAsyncHelper.checkGenericType(genericType);

	}

	public static void validateUrlTypeLink(final Link linkTarget, final Class<?> clazzType) {

		ReactiveAsyncHelper.checkLink(linkTarget);
		ReactiveAsyncHelper.checkClass(clazzType);

	}

	public static void validateUrlTypeLink(final Link linkTarget, final Entity<?> entity) {

		ReactiveAsyncHelper.checkLink(linkTarget);
		ReactiveAsyncHelper.checkEntity(entity);

	}

	public static void validateUrlTypeLink(final Link linkTarget, final GenericType<?> genericType) {

		ReactiveAsyncHelper.checkLink(linkTarget);
		ReactiveAsyncHelper.checkGenericType(genericType);

	}

	public static void validateUrlTypeUri(final URI uriTarget, final Class<?> clazzType, final Entity<?> entity) {

		ReactiveAsyncHelper.checkUri(uriTarget);
		ReactiveAsyncHelper.checkClass(clazzType);
		ReactiveAsyncHelper.checkEntity(entity);

	}

	public static void validateUrlTypeUri(final URI uriTarget, final Entity<?> entity) {

		ReactiveAsyncHelper.checkUri(uriTarget);
		ReactiveAsyncHelper.checkEntity(entity);

	}

	public static void validateUrlTypeUri(final URI uriTarget, final GenericType<?> genericType,
			final Entity<?> entity) {

		ReactiveAsyncHelper.checkUri(uriTarget);
		ReactiveAsyncHelper.checkEntity(entity);
		ReactiveAsyncHelper.checkGenericType(genericType);

	}

	public static void validateUrlTypeUri(final URI uriTarget, final Class<?> clazzType) {

		ReactiveAsyncHelper.checkUri(uriTarget);
		ReactiveAsyncHelper.checkClass(clazzType);

	}

	public static void validateUrlTypeUri(final URI uriTarget, final GenericType<?> genericType) {

		ReactiveAsyncHelper.checkUri(uriTarget);
		ReactiveAsyncHelper.checkGenericType(genericType);

	}

	public static void validateUrlTypeBuilder(final UriBuilder uriBuilderTarget, final Class<?> clazzType,
			final Entity<?> entity) {

		ReactiveAsyncHelper.checkUriBuilder(uriBuilderTarget);
		ReactiveAsyncHelper.checkClass(clazzType);
		ReactiveAsyncHelper.checkEntity(entity);

	}

	public static void validateUrlTypeBuilder(final UriBuilder uriBuilderTarget, final Entity<?> entity) {

		ReactiveAsyncHelper.checkUriBuilder(uriBuilderTarget);
		ReactiveAsyncHelper.checkEntity(entity);

	}

	public static void validateUrlTypeBuilder(final UriBuilder uriBuilderTarget, final GenericType<?> genericType,
			final Entity<?> entity) {

		ReactiveAsyncHelper.checkUriBuilder(uriBuilderTarget);
		ReactiveAsyncHelper.checkEntity(entity);
		ReactiveAsyncHelper.checkGenericType(genericType);

	}

	public static void validateUrlTypeBuilder(final UriBuilder uriBuilderTarget, final Class<?> clazzType) {

		ReactiveAsyncHelper.checkUriBuilder(uriBuilderTarget);
		ReactiveAsyncHelper.checkClass(clazzType);

	}

	public static void validateUrlTypeBuilder(final UriBuilder uriBuilderTarget, final GenericType<?> genericType) {

		ReactiveAsyncHelper.checkUriBuilder(uriBuilderTarget);
		ReactiveAsyncHelper.checkGenericType(genericType);

	}

	public static void validateUrlTypeWebTarget(final WebTarget webTarget, final Class<?> clazzType,
			final Entity<?> entity) {

		ReactiveAsyncHelper.checkWebTarget(webTarget);
		ReactiveAsyncHelper.checkClass(clazzType);
		ReactiveAsyncHelper.checkEntity(entity);

	}

	public static void validateUrlTypeWebTarget(final WebTarget webTarget, final Entity<?> entity) {

		ReactiveAsyncHelper.checkWebTarget(webTarget);
		ReactiveAsyncHelper.checkEntity(entity);

	}

	public static void validateUrlTypeWebTarget(final WebTarget webTarget, final GenericType<?> genericType,
			final Entity<?> entity) {

		ReactiveAsyncHelper.checkWebTarget(webTarget);
		ReactiveAsyncHelper.checkEntity(entity);
		ReactiveAsyncHelper.checkGenericType(genericType);

	}

	public static void validateUrlTypeWebTarget(final WebTarget webTarget, final Class<?> clazzType) {

		ReactiveAsyncHelper.checkWebTarget(webTarget);
		ReactiveAsyncHelper.checkClass(clazzType);

	}

	public static void validateUrlTypeWebTarget(final WebTarget webTarget, final GenericType<?> genericType) {

		ReactiveAsyncHelper.checkWebTarget(webTarget);
		ReactiveAsyncHelper.checkGenericType(genericType);

	}

	private static boolean hasAdditionalProperties(Object... additionalProperties) {
		boolean result = false;
		if (additionalProperties.length > 0) {
			result = true;
		}
		return result;
	}

	private static void setCookieProperty(Object property, RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder) {
		if (property instanceof Cookie) {
			rxBuilder.cookie((Cookie) property);
		}
	}

	private static void setRequestHeaderProperty(Object property,
			RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder) {
		if (property instanceof ReactiveAsyncHttpRequestHeader) {
			ReactiveAsyncHttpRequestHeader header = (ReactiveAsyncHttpRequestHeader) property;
			rxBuilder.header(header.getName(), header.getValue());
		}
	}

	private static void setEncodingProperty(Object property, RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder) {
		if (property instanceof String) {
			rxBuilder.acceptEncoding((String) property);
		}
	}

	private static void setLanguageProperty(Object property, RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder) {
		if (property instanceof Locale) {
			rxBuilder.acceptLanguage((Locale) property);
		}
	}

	private static void setCacheControlProperty(Object property,
			RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder) {
		if (property instanceof CacheControl) {
			rxBuilder.cacheControl((CacheControl) property);
		}
	}

	private static void setMediaTypeProperty(Object property, RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder) {
		if (property instanceof MediaType) {
			rxBuilder.accept((MediaType) property);
		}
	}

	private static void setRequestProperty(Object property, RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder) {
		if (property instanceof ReactiveAsyncHttpRequestProperty) {
			ReactiveAsyncHttpRequestProperty requestProperty = (ReactiveAsyncHttpRequestProperty) property;
			rxBuilder.property(requestProperty.getName(), requestProperty.getValue());
		}
	}

	public static void configureAdditionaRequestProperties(RxInvocationBuilder<RxCompletionStageInvoker> rxBuilder,
			Object... additionalProperties) {
		if (hasAdditionalProperties(additionalProperties)) {
			for (Object property : additionalProperties) {
				setMediaTypeProperty(property, rxBuilder);
				setCookieProperty(property, rxBuilder);
				setRequestHeaderProperty(property, rxBuilder);
				setEncodingProperty(property, rxBuilder);
				setLanguageProperty(property, rxBuilder);
				setCacheControlProperty(property, rxBuilder);
				setRequestProperty(property, rxBuilder);
			}
		}

	}

}
