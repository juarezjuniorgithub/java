package com.juarezjunior.http.client.async.reactive.javase8.helpers;

public enum ReactiveAsyncUtilsEnum {

	LINK_ARGUMENT_VALUE_NULL("Link value cannot be null"),

	COMMA_SEPARATOR(", "),

	UNDERSCORE("_"),

	OPENING_SQUARE_BRACKET("["),

	CLOSING_SQUARE_BRACKET("]"),

	STRING_URL_ARGUMENT_VALUE_NULL_OR_EMPTY("String URL value cannot be null or empty"),

	URIBUILDER_ARGUMENT_VALUE_NULL("UriBuilder value cannot be null"),

	WEBTARGET_ARGUMENT_VALUE_NULL("WebTarget value cannot be null"),

	URI_ARGUMENT_VALUE_NULL("URI value cannot be null"),

	CLASS_ARGUMENT_VALUE_NULL("Class value cannot be null"),

	ENTITY_ARGUMENT_VALUE_NULL("Entity value cannot be null"),

	MEDIATYPE_ARGUMENT_VALUE_NULL("MediaType value cannot be null"),

	GENERICTYPE_ARGUMENT_VALUE_NULL("GenericType value cannot be null"),

	PROPERTY_NAME_NULL_EMPTY_WRONG_TYPE("Property name is null, empty or the provided value is invalid"),

	STRING_URL("java.lang.String"),

	URI("java.net.URI"),

	URIBUILDER("javax.ws.rs.core.UriBuilder"),

	WEBTARGET("javax.ws.rs.client.WebTarget"),

	LINK("javax.ws.rs.core.Link"),

	EMPTY_STRING("");

	private String value;

	ReactiveAsyncUtilsEnum(String value) {
		this.value = value;
	}

	public String value() {
		return value;
	}

}
