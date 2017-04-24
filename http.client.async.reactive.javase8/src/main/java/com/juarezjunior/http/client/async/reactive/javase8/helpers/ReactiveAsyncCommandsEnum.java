package com.juarezjunior.http.client.async.reactive.javase8.helpers;

public enum ReactiveAsyncCommandsEnum {

	TRANSACTION_ID("Transaction ID: "),

	TRANSACTION_STATUS("Transaction Status: "),

	TRANSACTION_DATE("Transaction DateTime: "),

	COMMAND_NAME("Command Name: "),

	DELETE_COMMAND_CLASS_GROUP("ReactiveAsyncHttpDeleteCommandClassResponse"),

	GET_COMMAND_CLASS_GROUP("ReactiveAsyncHttpGetCommandResponse"),

	OPTIONS_COMMAND_CLASS_GROUP("ReactiveAsyncHttpOptionsCommandClassResponse"),

	POST_COMMAND_CLASS_GROUP("ReactiveAsyncHttpPostCommandClassResponse"),

	PUT_COMMAND_CLASS_GROUP("ReactiveAsyncHttpPutCommandClassResponse"),

	TRACE_COMMAND_CLASS_GROUP("ReactiveAsyncHttpTraceCommandClassResponse"),

	DELETE_COMMAND_GEN_GROUP("ReactiveAsyncHttpDeleteCommandGenericTypeResponse"),

	GET_COMMAND_GEN_GROUP("ReactiveAsyncHttpGetCommandGenericTypeResponse"),

	OPTIONS_COMMAND_GEN_GROUP("ReactiveAsyncHttpOptionsCommandGenericTypeResponse"),

	POST_COMMAND_GEN_GROUP("ReactiveAsyncHttpPostCommandGenericTypeResponse"),

	PUT_COMMAND_GEN_GROUP("ReactiveAsyncHttpPutCommandGenericTypeResponse"),

	TRACE_COMMAND_GEN_GROUP("ReactiveAsyncHttpTraceCommandGenericTypeResponse"),

	DELETE_COMMAND_RESP_GROUP("ReactiveAsyncHttpDeleteCommandResponse"),

	GET_COMMAND_RESP_GROUP("ReactiveAsyncHttpGetCommandResponse"),

	HEAD_COMMAND_RESP_GROUP("ReactiveAsyncHttpHeadCommandResponse"),

	OPTIONS_COMMAND_RESP_GROUP("ReactiveAsyncHttpOptionsCommandResponse"),

	POST_COMMAND_RESP_GROUP("ReactiveAsyncHttpPostCommandResponse"),

	PUT_COMMAND_RESP_GROUP("ReactiveAsyncHttpPutCommandResponse"),

	TRACE_COMMAND_RESP_GROUP("ReactiveAsyncHttpTraceCommandResponse"),

	DELETE_COMMAND_TEXT_GROUP("ReactiveAsyncHttpDeleteCommandTextResponse"),

	GET_COMMAND_TEXT_GROUP("ReactiveAsyncHttpGetCommandTextResponse"),

	OPTIONS_COMMAND_TEXT_GROUP("ReactiveAsyncHttpOptionsCommandTextResponse"),

	POST_COMMAND_TEXT_GROUP("ReactiveAsyncHttpPostCommandTextResponse"),

	TRACE_COMMAND_TEXT_GROUP("ReactiveAsyncHttpTraceCommandTextResponse"),

	EXECUTION_STARTED("EXECUTION_STARTED"),

	EXECUTION_FINISHED("EXECUTION_FINISHED"),

	EXECUTION_CANCELLED("EXECUTION_CANCELLED"),

	EXECUTION_ERROR("EXECUTION_ERROR");

	private String value;

	ReactiveAsyncCommandsEnum(String value) {
		this.value = value;
	}

	public String value() {
		return value;
	}

}
