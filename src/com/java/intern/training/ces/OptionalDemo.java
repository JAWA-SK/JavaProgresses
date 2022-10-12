package com.java.intern.training.ces;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String array[] = new String[2];
		array[1] = "JAVA 8";
		Optional<String> opt = Optional.ofNullable(array[1]);
		if (opt.isPresent())
			System.out.println(array[1].toLowerCase());
		else
			System.out.println("null");
	}

}