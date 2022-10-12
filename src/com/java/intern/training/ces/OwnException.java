package com.java.intern.training.ces;

class AgeLimitException extends RuntimeException {
	public AgeLimitException(String s) {
		super(s);
	}

	public AgeLimitException() {
	};

	public AgeLimitException(Throwable reason) {
		super(reason);
	}

	public AgeLimitException(String s, Throwable reason) {
		super(s, reason);
	}
}

public class OwnException {

	public static void main(String[] args) {
		exe("jaw");

	}

	public static void exe(String name) {
		if (name.length() < 4) {
			throw new AgeLimitException("hello", new RuntimeException());

		}
		System.out.println("NO EXCEPTIONS WORKING FINE");
	}

}
