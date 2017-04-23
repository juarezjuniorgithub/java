package com.juarezjunior.http.client.async.reactive.javase8.helpers;

public class ReactiveAsyncHttpRequestHeader {

	public ReactiveAsyncHttpRequestHeader(String newName, Object newValue) {
		this.name = newName;
		this.value = newValue;
	}

	private String name;

	private Object value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
