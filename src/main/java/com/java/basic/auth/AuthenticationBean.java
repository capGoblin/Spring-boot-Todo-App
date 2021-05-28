package com.java.basic.auth;

public class AuthenticationBean {

	private String message;

	public AuthenticationBean(String message) {
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "helloWorldBean [message=" + message + "]";
	}


	public void setMessage(String message) {
		this.message = message;
	}

}
