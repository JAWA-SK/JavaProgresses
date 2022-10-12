package com.credo.systems.java.training;

public class Greatest3 {

	public static void main(String[] args) {
		System.out.println(GreatestNum3(10, 11, 12));
	}

	public static int GreatestNum3(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c && b > a) {
			return b;
		} else {
			return c;
		}
	}
}
