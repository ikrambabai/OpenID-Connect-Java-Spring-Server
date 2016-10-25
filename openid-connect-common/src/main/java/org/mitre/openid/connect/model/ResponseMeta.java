package org.mitre.openid.connect.model;

public class ResponseMeta<T> {
	
	private ResponseStatusEnum status;
	private String message;
	
	private T response;
	
	public ResponseMeta(){};
	
	public ResponseMeta(ResponseStatusEnum status, String message, T response){
		this.status = status;
		this.message = message;
		this.response = response;
	}

	public ResponseStatusEnum getStatus() {
		return status;
	}

	public void setStatus(ResponseStatusEnum status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getResponse() {
		return response;
	}

	public void setResponse(T response) {
		this.response = response;
	};	
}