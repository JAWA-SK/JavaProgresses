package com.credo.systems.java.training;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		String input = sc.next();
		System.out.println(Ams(input));
		sc.close();

	}

	public static String Ams(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			sum += Math.pow(Integer.parseInt(input.charAt(i) + ""), input.length());
		}
		if (sum == Integer.parseInt(input))
			return "AMSTRONG NUMBER";
		else
			return "NOT AN AMSTRONG NUMBER";

	}

}
