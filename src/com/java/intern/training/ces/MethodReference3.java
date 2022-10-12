package com.java.intern.training.ces;

import java.util.function.BiFunction;

public class MethodReference3 {
	public static void main(String[] args) {
		MethodReference3 ref = new MethodReference3();
		MethodReference3.call(10, MethodReference3::perform);
		MethodReference3.call(10, ref::performs);
		MethodReference3.lambda(10, (m, n) -> m + n);
	}

	public static void call(int number, BiFunction<Integer, Integer, Integer> b) {
		System.out.println(number + b.apply(10, 10));
	}

	public static void lambda(int number, BiFunction<Integer, Integer, Integer> b) {
		System.out.println(number + b.apply(10, 10));
	}

	public static int perform(int a, int b) {
		return a + b;
	}

	public int performs(int a, int b) {
		return a + b;
	}
}
