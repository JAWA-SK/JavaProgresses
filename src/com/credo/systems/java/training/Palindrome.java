package com.credo.systems.java.training;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		String input = sc.next();
		System.out.println(Pal(input));
		sc.close();
	}

	public static String Pal(String input) {
		String out = "";
		for (int i = input.length() - 1; i>=0; i--) {
			out += input.charAt(i);
		}
		if (out.equals(input))

			return "PALINDROME";
		else
			return "NOT A PALINDROME";

	}

}
