package com.juarezjunior.http.client.async.reactive.javase8.helpers;

public class ReactiveAsyncLogVO {

	private String commandName;

	private String transactionRequestID;

	private String requestTransactionStatus;

	private String date;

	public ReactiveAsyncLogVO(final String commandName, final String transactionRequestID,
			final String requestTransactionStatus, final String date) {
		this.commandName = commandName;
		this.transactionRequestID = transactionRequestID;
		this.requestTransactionStatus = requestTransactionStatus;
		this.date = date;
	}

	public ReactiveAsyncLogVO(final String commandName, final String transactionRequestID,
			final String requestTransactionStatus, final String tenantId, final String instanceId, final String date) {
		this.commandName = commandName;
		this.transactionRequestID = transactionRequestID;
		this.requestTransactionStatus = requestTransactionStatus;
		this.date = date;
	}

	public String getCommandName() {
		return commandName;
	}

	public void setCommandName(final String commandName) {
		this.commandName = commandName;
	}

	public String getTransactionRequestID() {
		return transactionRequestID;
	}

	public void setTransactionRequestID(final String transactionRequestID) {
		this.transactionRequestID = transactionRequestID;
	}

	public String getRequestTransactionStatus() {
		return requestTransactionStatus;
	}

	public void setRequestTransactionStatus(final String requestTransactionStatus) {
		this.requestTransactionStatus = requestTransactionStatus;
	}

	public String getDate() {
		return date;
	}

	public void setDate(final String date) {
		this.date = date;
	}

	public String toString() {

		final StringBuilder builder = new StringBuilder();
		builder.append(ReactiveAsyncUtilsEnum.OPENING_SQUARE_BRACKET.value())
				.append(ReactiveAsyncCommandsEnum.COMMAND_NAME.value()).append(this.commandName)
				.append(ReactiveAsyncUtilsEnum.COMMA_SEPARATOR.value())
				.append(ReactiveAsyncCommandsEnum.TRANSACTION_ID.value()).append(this.transactionRequestID)
				.append(ReactiveAsyncUtilsEnum.COMMA_SEPARATOR.value())
				.append(ReactiveAsyncCommandsEnum.TRANSACTION_STATUS.value()).append(this.requestTransactionStatus)
				.append(ReactiveAsyncUtilsEnum.COMMA_SEPARATOR.value())
				.append(ReactiveAsyncCommandsEnum.TRANSACTION_DATE.value()).append(this.date)
				.append(ReactiveAsyncUtilsEnum.CLOSING_SQUARE_BRACKET.value());

		return builder.toString();

	}

}
